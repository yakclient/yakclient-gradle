package net.yakclient.extensions.test2

import net.yakclient.components.extloader.api.environment.ExtLoaderEnvironment
import net.yakclient.components.extloader.api.tweaker.EnvironmentTweaker

class TweakerTest2 : EnvironmentTweaker {
    override fun tweak(environment: ExtLoaderEnvironment) {
        println("Test test tweaker ran!")
    }

    companion object {
        public val something = 5
    }
}
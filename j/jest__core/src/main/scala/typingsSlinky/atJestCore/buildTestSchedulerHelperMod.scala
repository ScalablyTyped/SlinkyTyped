package typingsSlinky.atJestCore

import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import typingsSlinky.jestDashRunner.jestDashRunnerMod.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/testSchedulerHelper", JSImport.Namespace)
@js.native
object buildTestSchedulerHelperMod extends js.Object {
  def shouldRunInBand(
    tests: js.Array[Test],
    timings: js.Array[Double],
    hasDetectOpenHandlesMaxWorkersWatchWatchAll: GlobalConfig
  ): Boolean = js.native
}


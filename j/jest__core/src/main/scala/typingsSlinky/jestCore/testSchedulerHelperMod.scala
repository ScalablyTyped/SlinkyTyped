package typingsSlinky.jestCore

import typingsSlinky.jestRunner.mod.Test
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/testSchedulerHelper", JSImport.Namespace)
@js.native
object testSchedulerHelperMod extends js.Object {
  def shouldRunInBand(
    tests: js.Array[Test],
    timings: js.Array[Double],
    hasDetectOpenHandlesMaxWorkersWatchWatchAll: GlobalConfig
  ): Boolean = js.native
}


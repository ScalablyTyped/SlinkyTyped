package typingsSlinky.atJestCore.buildTestSchedulerMod

import typingsSlinky.atJestTypes.buildConfigMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSchedulerOptions extends js.Object {
  def startRun(globalConfig: GlobalConfig): Unit
}

object TestSchedulerOptions {
  @scala.inline
  def apply(startRun: GlobalConfig => Unit): TestSchedulerOptions = {
    val __obj = js.Dynamic.literal(startRun = js.Any.fromFunction1(startRun))
  
    __obj.asInstanceOf[TestSchedulerOptions]
  }
}


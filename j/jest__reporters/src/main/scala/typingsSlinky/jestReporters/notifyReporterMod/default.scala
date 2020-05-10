package typingsSlinky.jestReporters.notifyReporterMod

import typingsSlinky.jestReporters.typesMod.TestSchedulerContext
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/notify_reporter", JSImport.Default)
@js.native
class default protected () extends NotifyReporter {
  def this(
    globalConfig: GlobalConfig,
    startRun: js.Function1[/* globalConfig */ GlobalConfig, _],
    context: TestSchedulerContext
  ) = this()
}


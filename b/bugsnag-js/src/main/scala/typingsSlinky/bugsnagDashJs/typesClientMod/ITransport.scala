package typingsSlinky.bugsnagDashJs.typesClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransport extends js.Object {
  var name: String = js.native
  def sendReport(logger: ILogger, config: js.Any, report: IReportPayload): Unit = js.native
  def sendReport(
    logger: ILogger,
    config: js.Any,
    report: IReportPayload,
    cb: js.Function2[/* e */ js.Error | Null, /* resText */ String, Unit]
  ): Unit = js.native
  def sendSession(logger: ILogger, config: js.Any, report: ISessionPayload): Unit = js.native
  def sendSession(
    logger: ILogger,
    config: js.Any,
    report: ISessionPayload,
    cb: js.Function2[/* e */ js.Error | Null, /* resText */ String, Unit]
  ): Unit = js.native
}


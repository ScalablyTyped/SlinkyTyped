package typingsSlinky.bugsnagJs.clientMod

import typingsSlinky.bugsnagJs.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IReportPayload extends js.Object {
  var apiKey: String = js.native
  var events: js.Array[typingsSlinky.bugsnagJs.reportMod.default] = js.native
  var notifier: AnonName = js.native
}

object IReportPayload {
  @scala.inline
  def apply(apiKey: String, events: js.Array[typingsSlinky.bugsnagJs.reportMod.default], notifier: AnonName): IReportPayload = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], notifier = notifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IReportPayload]
  }
  @scala.inline
  implicit class IReportPayloadOps[Self <: IReportPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[typingsSlinky.bugsnagJs.reportMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotifier(value: AnonName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


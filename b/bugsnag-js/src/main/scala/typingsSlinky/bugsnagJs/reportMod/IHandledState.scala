package typingsSlinky.bugsnagJs.reportMod

import typingsSlinky.bugsnagJs.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHandledState extends js.Object {
  var severity: String = js.native
  var severityReason: AnonType = js.native
  var unhandled: Boolean = js.native
}

object IHandledState {
  @scala.inline
  def apply(severity: String, severityReason: AnonType, unhandled: Boolean): IHandledState = {
    val __obj = js.Dynamic.literal(severity = severity.asInstanceOf[js.Any], severityReason = severityReason.asInstanceOf[js.Any], unhandled = unhandled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHandledState]
  }
  @scala.inline
  implicit class IHandledStateOps[Self <: IHandledState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeverityReason(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severityReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnhandled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unhandled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


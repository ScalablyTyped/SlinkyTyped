package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusReport extends js.Object {
  /**
    * The date and time that the health checker performed the health check in ISO 8601 format and Coordinated Universal Time (UTC). For example, the value 2017-03-27T17:48:16.751Z represents March 27, 2017 at 17:48:16.751 UTC.
    */
  var CheckedTime: js.UndefOr[js.Date] = js.native
  /**
    * A description of the status of the health check endpoint as reported by one of the Amazon Route 53 health checkers.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.route53Mod.Status] = js.native
}

object StatusReport {
  @scala.inline
  def apply(): StatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusReport]
  }
  @scala.inline
  implicit class StatusReportOps[Self <: StatusReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}


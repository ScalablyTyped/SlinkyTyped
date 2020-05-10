package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingLogs extends js.Object {
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
    */
  var Audit: js.UndefOr[boolean] = js.native
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[boolean] = js.native
}

object PendingLogs {
  @scala.inline
  def apply(): PendingLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingLogs]
  }
  @scala.inline
  implicit class PendingLogsOps[Self <: PendingLogs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudit(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Audit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Audit")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneral(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("General")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneral: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("General")(js.undefined)
        ret
    }
  }
  
}


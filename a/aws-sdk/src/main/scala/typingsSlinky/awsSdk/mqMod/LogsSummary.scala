package typingsSlinky.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogsSummary extends js.Object {
  /**
    * Enables audit logging. Every user management action made using JMX or the ActiveMQ Web Console is logged.
    */
  var Audit: js.UndefOr[boolean] = js.native
  /**
    * The location of the CloudWatch Logs log group where audit logs are sent.
    */
  var AuditLogGroup: js.UndefOr[string] = js.native
  /**
    * Enables general logging.
    */
  var General: js.UndefOr[boolean] = js.native
  /**
    * The location of the CloudWatch Logs log group where general logs are sent.
    */
  var GeneralLogGroup: js.UndefOr[string] = js.native
  /**
    * The list of information about logs pending to be deployed for the specified broker.
    */
  var Pending: js.UndefOr[PendingLogs] = js.native
}

object LogsSummary {
  @scala.inline
  def apply(): LogsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogsSummary]
  }
  @scala.inline
  implicit class LogsSummaryOps[Self <: LogsSummary] (val x: Self) extends AnyVal {
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
    def withAuditLogGroup(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditLogGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuditLogGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuditLogGroup")(js.undefined)
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
    @scala.inline
    def withGeneralLogGroup(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeneralLogGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneralLogGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GeneralLogGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withPending(value: PendingLogs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pending")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeScheduledAuditResponse extends js.Object {
  /**
    * The day of the month on which the scheduled audit takes place. Will be "1" through "31" or "LAST". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.native
  /**
    * The day of the week on which the scheduled audit takes place. One of "SUN", "MON", "TUE", "WED", "THU", "FRI", or "SAT".
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.native
  /**
    * How often the scheduled audit takes place. One of "DAILY", "WEEKLY", "BIWEEKLY", or "MONTHLY". The start time of each audit is determined by the system.
    */
  var frequency: js.UndefOr[AuditFrequency] = js.native
  /**
    * The ARN of the scheduled audit.
    */
  var scheduledAuditArn: js.UndefOr[ScheduledAuditArn] = js.native
  /**
    * The name of the scheduled audit.
    */
  var scheduledAuditName: js.UndefOr[ScheduledAuditName] = js.native
  /**
    * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are enabled or use UpdateAccountAuditConfiguration to select which checks are enabled.)
    */
  var targetCheckNames: js.UndefOr[TargetAuditCheckNames] = js.native
}

object DescribeScheduledAuditResponse {
  @scala.inline
  def apply(): DescribeScheduledAuditResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScheduledAuditResponse]
  }
  @scala.inline
  implicit class DescribeScheduledAuditResponseOps[Self <: DescribeScheduledAuditResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayOfMonth(value: DayOfMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withDayOfWeek(value: DayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: AuditFrequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledAuditArn(value: ScheduledAuditArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledAuditArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledAuditArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledAuditArn")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledAuditName(value: ScheduledAuditName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledAuditName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledAuditName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledAuditName")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCheckNames(value: TargetAuditCheckNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCheckNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCheckNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCheckNames")(js.undefined)
        ret
    }
  }
  
}


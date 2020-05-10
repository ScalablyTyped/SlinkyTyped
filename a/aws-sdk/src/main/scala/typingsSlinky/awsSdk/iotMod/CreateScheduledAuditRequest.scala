package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateScheduledAuditRequest extends js.Object {
  /**
    * The day of the month on which the scheduled audit takes place. Can be "1" through "31" or "LAST". This field is required if the "frequency" parameter is set to "MONTHLY". If days 29-31 are specified, and the month does not have that many days, the audit takes place on the "LAST" day of the month.
    */
  var dayOfMonth: js.UndefOr[DayOfMonth] = js.native
  /**
    * The day of the week on which the scheduled audit takes place. Can be one of "SUN", "MON", "TUE", "WED", "THU", "FRI", or "SAT". This field is required if the "frequency" parameter is set to "WEEKLY" or "BIWEEKLY".
    */
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.native
  /**
    * How often the scheduled audit takes place. Can be one of "DAILY", "WEEKLY", "BIWEEKLY" or "MONTHLY". The start time of each audit is determined by the system.
    */
  var frequency: AuditFrequency = js.native
  /**
    * The name you want to give to the scheduled audit. (Max. 128 chars)
    */
  var scheduledAuditName: ScheduledAuditName = js.native
  /**
    * Metadata that can be used to manage the scheduled audit.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Which checks are performed during the scheduled audit. Checks must be enabled for your account. (Use DescribeAccountAuditConfiguration to see the list of all checks, including those that are enabled or use UpdateAccountAuditConfiguration to select which checks are enabled.)
    */
  var targetCheckNames: TargetAuditCheckNames = js.native
}

object CreateScheduledAuditRequest {
  @scala.inline
  def apply(
    frequency: AuditFrequency,
    scheduledAuditName: ScheduledAuditName,
    targetCheckNames: TargetAuditCheckNames
  ): CreateScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(frequency = frequency.asInstanceOf[js.Any], scheduledAuditName = scheduledAuditName.asInstanceOf[js.Any], targetCheckNames = targetCheckNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduledAuditRequest]
  }
  @scala.inline
  implicit class CreateScheduledAuditRequestOps[Self <: CreateScheduledAuditRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrequency(value: AuditFrequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScheduledAuditName(value: ScheduledAuditName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledAuditName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetCheckNames(value: TargetAuditCheckNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCheckNames")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}


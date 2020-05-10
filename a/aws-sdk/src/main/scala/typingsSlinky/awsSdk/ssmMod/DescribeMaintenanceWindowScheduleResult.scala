package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowScheduleResult extends js.Object {
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Information about maintenance window executions scheduled for the specified time range.
    */
  var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.native
}

object DescribeMaintenanceWindowScheduleResult {
  @scala.inline
  def apply(): DescribeMaintenanceWindowScheduleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowScheduleResult]
  }
  @scala.inline
  implicit class DescribeMaintenanceWindowScheduleResultOps[Self <: DescribeMaintenanceWindowScheduleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledWindowExecutions(value: ScheduledWindowExecutionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledWindowExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledWindowExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScheduledWindowExecutions")(js.undefined)
        ret
    }
  }
  
}


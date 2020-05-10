package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowExecutionsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Information about the maintenance window executions.
    */
  var WindowExecutions: js.UndefOr[MaintenanceWindowExecutionList] = js.native
}

object DescribeMaintenanceWindowExecutionsResult {
  @scala.inline
  def apply(): DescribeMaintenanceWindowExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionsResult]
  }
  @scala.inline
  implicit class DescribeMaintenanceWindowExecutionsResultOps[Self <: DescribeMaintenanceWindowExecutionsResult] (val x: Self) extends AnyVal {
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
    def withWindowExecutions(value: MaintenanceWindowExecutionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowExecutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindowExecutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowExecutions")(js.undefined)
        ret
    }
  }
  
}


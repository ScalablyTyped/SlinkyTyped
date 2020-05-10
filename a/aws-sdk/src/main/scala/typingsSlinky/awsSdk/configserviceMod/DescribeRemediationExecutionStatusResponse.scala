package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationExecutionStatusResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Returns a list of remediation execution statuses objects.
    */
  var RemediationExecutionStatuses: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.RemediationExecutionStatuses] = js.native
}

object DescribeRemediationExecutionStatusResponse {
  @scala.inline
  def apply(): DescribeRemediationExecutionStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationExecutionStatusResponse]
  }
  @scala.inline
  implicit class DescribeRemediationExecutionStatusResponseOps[Self <: DescribeRemediationExecutionStatusResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
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
    def withRemediationExecutionStatuses(value: RemediationExecutionStatuses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationExecutionStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemediationExecutionStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemediationExecutionStatuses")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeActionTargetsResponse extends js.Object {
  /**
    * A list of ActionTarget objects. Each object includes the ActionTargetArn, Description, and Name of a custom action target available in Security Hub.
    */
  var ActionTargets: ActionTargetList = js.native
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.NextToken] = js.native
}

object DescribeActionTargetsResponse {
  @scala.inline
  def apply(ActionTargets: ActionTargetList): DescribeActionTargetsResponse = {
    val __obj = js.Dynamic.literal(ActionTargets = ActionTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeActionTargetsResponse]
  }
  @scala.inline
  implicit class DescribeActionTargetsResponseOps[Self <: DescribeActionTargetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionTargets(value: ActionTargetList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionTargets")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}


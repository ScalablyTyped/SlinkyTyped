package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAutomationExecutionsResult extends js.Object {
  /**
    * The list of details about each automation execution which has occurred which matches the filter specification, if any.
    */
  var AutomationExecutionMetadataList: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AutomationExecutionMetadataList] = js.native
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeAutomationExecutionsResult {
  @scala.inline
  def apply(): DescribeAutomationExecutionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutomationExecutionsResult]
  }
  @scala.inline
  implicit class DescribeAutomationExecutionsResultOps[Self <: DescribeAutomationExecutionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomationExecutionMetadataList(value: AutomationExecutionMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationExecutionMetadataList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationExecutionMetadataList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutomationExecutionMetadataList")(js.undefined)
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


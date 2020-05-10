package typingsSlinky.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContactFlowsResponse extends js.Object {
  /**
    * Information about the contact flows.
    */
  var ContactFlowSummaryList: js.UndefOr[typingsSlinky.awsSdk.connectMod.ContactFlowSummaryList] = js.native
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.connectMod.NextToken] = js.native
}

object ListContactFlowsResponse {
  @scala.inline
  def apply(): ListContactFlowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactFlowsResponse]
  }
  @scala.inline
  implicit class ListContactFlowsResponseOps[Self <: ListContactFlowsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactFlowSummaryList(value: ContactFlowSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactFlowSummaryList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactFlowSummaryList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContactFlowSummaryList")(js.undefined)
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


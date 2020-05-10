package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProposalsOutput extends js.Object {
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The summary of each proposal made on the network.
    */
  var Proposals: js.UndefOr[ProposalSummaryList] = js.native
}

object ListProposalsOutput {
  @scala.inline
  def apply(): ListProposalsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProposalsOutput]
  }
  @scala.inline
  implicit class ListProposalsOutputOps[Self <: ListProposalsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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
    def withProposals(value: ProposalSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Proposals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Proposals")(js.undefined)
        ret
    }
  }
  
}


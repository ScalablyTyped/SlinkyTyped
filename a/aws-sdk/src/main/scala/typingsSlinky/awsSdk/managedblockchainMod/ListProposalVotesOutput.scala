package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProposalVotesOutput extends js.Object {
  /**
    *  The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The listing of votes. 
    */
  var ProposalVotes: js.UndefOr[ProposalVoteList] = js.native
}

object ListProposalVotesOutput {
  @scala.inline
  def apply(): ListProposalVotesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProposalVotesOutput]
  }
  @scala.inline
  implicit class ListProposalVotesOutputOps[Self <: ListProposalVotesOutput] (val x: Self) extends AnyVal {
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
    def withProposalVotes(value: ProposalVoteList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposalVotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalVotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposalVotes")(js.undefined)
        ret
    }
  }
  
}


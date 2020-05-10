package typingsSlinky.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProposalOutput extends js.Object {
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.native
}

object CreateProposalOutput {
  @scala.inline
  def apply(): CreateProposalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProposalOutput]
  }
  @scala.inline
  implicit class CreateProposalOutputOps[Self <: CreateProposalOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProposalId(value: ResourceIdString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProposalId")(js.undefined)
        ret
    }
  }
  
}


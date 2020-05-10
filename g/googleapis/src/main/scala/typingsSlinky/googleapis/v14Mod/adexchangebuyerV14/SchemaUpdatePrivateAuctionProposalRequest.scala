package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUpdatePrivateAuctionProposalRequest extends js.Object {
  /**
    * The externalDealId of the deal to be updated.
    */
  var externalDealId: js.UndefOr[String] = js.native
  /**
    * Optional note to be added.
    */
  var note: js.UndefOr[SchemaMarketplaceNote] = js.native
  /**
    * The current revision number of the proposal to be updated.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /**
    * The proposed action on the private auction proposal.
    */
  var updateAction: js.UndefOr[String] = js.native
}

object SchemaUpdatePrivateAuctionProposalRequest {
  @scala.inline
  def apply(): SchemaUpdatePrivateAuctionProposalRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdatePrivateAuctionProposalRequest]
  }
  @scala.inline
  implicit class SchemaUpdatePrivateAuctionProposalRequestOps[Self <: SchemaUpdatePrivateAuctionProposalRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExternalDealId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDealId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalDealId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDealId")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: SchemaMarketplaceNote): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withProposalRevisionNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalRevisionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProposalRevisionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proposalRevisionNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAction")(js.undefined)
        ret
    }
  }
  
}


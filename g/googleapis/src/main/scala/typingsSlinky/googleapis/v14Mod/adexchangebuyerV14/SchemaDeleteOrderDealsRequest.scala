package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeleteOrderDealsRequest extends js.Object {
  /**
    * List of deals to delete for a given proposal
    */
  var dealIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The last known proposal revision number.
    */
  var proposalRevisionNumber: js.UndefOr[String] = js.native
  /**
    * Indicates an optional action to take on the proposal
    */
  var updateAction: js.UndefOr[String] = js.native
}

object SchemaDeleteOrderDealsRequest {
  @scala.inline
  def apply(): SchemaDeleteOrderDealsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteOrderDealsRequest]
  }
  @scala.inline
  implicit class SchemaDeleteOrderDealsRequestOps[Self <: SchemaDeleteOrderDealsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDealIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealIds")(js.undefined)
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


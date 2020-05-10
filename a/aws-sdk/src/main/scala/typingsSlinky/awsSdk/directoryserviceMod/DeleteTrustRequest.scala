package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrustRequest extends js.Object {
  /**
    * Delete a conditional forwarder as part of a DeleteTrustRequest.
    */
  var DeleteAssociatedConditionalForwarder: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DeleteAssociatedConditionalForwarder] = js.native
  /**
    * The Trust ID of the trust relationship to be deleted.
    */
  var TrustId: typingsSlinky.awsSdk.directoryserviceMod.TrustId = js.native
}

object DeleteTrustRequest {
  @scala.inline
  def apply(TrustId: TrustId): DeleteTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrustRequest]
  }
  @scala.inline
  implicit class DeleteTrustRequestOps[Self <: DeleteTrustRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrustId(value: TrustId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrustId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteAssociatedConditionalForwarder(value: DeleteAssociatedConditionalForwarder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteAssociatedConditionalForwarder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteAssociatedConditionalForwarder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteAssociatedConditionalForwarder")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateHITReviewStatusRequest extends js.Object {
  /**
    *  The ID of the HIT to update. 
    */
  var HITId: EntityId = js.native
  /**
    *  Specifies how to update the HIT status. Default is False.     Setting this to false will only transition a HIT from Reviewable to Reviewing     Setting this to true will only transition a HIT from Reviewing to Reviewable   
    */
  var Revert: js.UndefOr[Boolean] = js.native
}

object UpdateHITReviewStatusRequest {
  @scala.inline
  def apply(HITId: EntityId): UpdateHITReviewStatusRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHITReviewStatusRequest]
  }
  @scala.inline
  implicit class UpdateHITReviewStatusRequestOps[Self <: UpdateHITReviewStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHITId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevert(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revert")(js.undefined)
        ret
    }
  }
  
}


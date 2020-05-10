package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExpirationForHITRequest extends js.Object {
  /**
    *  The date and time at which you want the HIT to expire 
    */
  var ExpireAt: js.Date = js.native
  /**
    *  The HIT to update. 
    */
  var HITId: EntityId = js.native
}

object UpdateExpirationForHITRequest {
  @scala.inline
  def apply(ExpireAt: js.Date, HITId: EntityId): UpdateExpirationForHITRequest = {
    val __obj = js.Dynamic.literal(ExpireAt = ExpireAt.asInstanceOf[js.Any], HITId = HITId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpirationForHITRequest]
  }
  @scala.inline
  implicit class UpdateExpirationForHITRequestOps[Self <: UpdateExpirationForHITRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpireAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpireAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHITId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


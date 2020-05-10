package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateHITTypeOfHITRequest extends js.Object {
  /**
    * The HIT to update.
    */
  var HITId: EntityId = js.native
  /**
    * The ID of the new HIT type.
    */
  var HITTypeId: EntityId = js.native
}

object UpdateHITTypeOfHITRequest {
  @scala.inline
  def apply(HITId: EntityId, HITTypeId: EntityId): UpdateHITTypeOfHITRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId.asInstanceOf[js.Any], HITTypeId = HITTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHITTypeOfHITRequest]
  }
  @scala.inline
  implicit class UpdateHITTypeOfHITRequestOps[Self <: UpdateHITTypeOfHITRequest] (val x: Self) extends AnyVal {
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
    def withHITTypeId(value: EntityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HITTypeId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


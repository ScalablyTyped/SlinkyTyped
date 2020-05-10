package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteProtectionRequest extends js.Object {
  /**
    * The unique identifier (ID) for the Protection object to be deleted.
    */
  var ProtectionId: typingsSlinky.awsSdk.shieldMod.ProtectionId = js.native
}

object DeleteProtectionRequest {
  @scala.inline
  def apply(ProtectionId: ProtectionId): DeleteProtectionRequest = {
    val __obj = js.Dynamic.literal(ProtectionId = ProtectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProtectionRequest]
  }
  @scala.inline
  implicit class DeleteProtectionRequestOps[Self <: DeleteProtectionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProtectionId(value: ProtectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProtectionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


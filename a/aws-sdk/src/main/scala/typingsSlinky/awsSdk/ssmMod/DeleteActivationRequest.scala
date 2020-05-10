package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteActivationRequest extends js.Object {
  /**
    * The ID of the activation that you want to delete.
    */
  var ActivationId: typingsSlinky.awsSdk.ssmMod.ActivationId = js.native
}

object DeleteActivationRequest {
  @scala.inline
  def apply(ActivationId: ActivationId): DeleteActivationRequest = {
    val __obj = js.Dynamic.literal(ActivationId = ActivationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActivationRequest]
  }
  @scala.inline
  implicit class DeleteActivationRequestOps[Self <: DeleteActivationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationId(value: ActivationId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivationId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


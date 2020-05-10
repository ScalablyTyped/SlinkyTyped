package typingsSlinky.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHsmRequest extends js.Object {
  /**
    * The ARN of the HSM to delete.
    */
  var HsmArn: typingsSlinky.awsSdk.cloudhsmMod.HsmArn = js.native
}

object DeleteHsmRequest {
  @scala.inline
  def apply(HsmArn: HsmArn): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(HsmArn = HsmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmRequest]
  }
  @scala.inline
  implicit class DeleteHsmRequestOps[Self <: DeleteHsmRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHsmArn(value: HsmArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HsmArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


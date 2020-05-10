package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceCertificateParams extends js.Object {
  /**
    * The action that you want to apply to the device cerrtificate. The only supported value is DEACTIVATE.
    */
  var action: DeviceCertificateUpdateAction = js.native
}

object UpdateDeviceCertificateParams {
  @scala.inline
  def apply(action: DeviceCertificateUpdateAction): UpdateDeviceCertificateParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceCertificateParams]
  }
  @scala.inline
  implicit class UpdateDeviceCertificateParamsOps[Self <: UpdateDeviceCertificateParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: DeviceCertificateUpdateAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


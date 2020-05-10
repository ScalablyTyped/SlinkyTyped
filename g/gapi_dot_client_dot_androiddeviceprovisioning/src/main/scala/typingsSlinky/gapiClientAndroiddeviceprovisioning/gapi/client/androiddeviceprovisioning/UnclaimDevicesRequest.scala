package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnclaimDevicesRequest extends js.Object {
  /** List of devices to unclaim. */
  var unclaims: js.UndefOr[js.Array[PartnerUnclaim]] = js.native
}

object UnclaimDevicesRequest {
  @scala.inline
  def apply(): UnclaimDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnclaimDevicesRequest]
  }
  @scala.inline
  implicit class UnclaimDevicesRequestOps[Self <: UnclaimDevicesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnclaims(value: js.Array[PartnerUnclaim]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclaims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnclaims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclaims")(js.undefined)
        ret
    }
  }
  
}


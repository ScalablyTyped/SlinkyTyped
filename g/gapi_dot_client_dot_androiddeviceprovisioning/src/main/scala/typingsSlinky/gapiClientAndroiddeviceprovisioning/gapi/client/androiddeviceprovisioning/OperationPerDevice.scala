package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationPerDevice extends js.Object {
  /** Request to claim a device. */
  var claim: js.UndefOr[PartnerClaim] = js.native
  /** Processing result for every device. */
  var result: js.UndefOr[PerDeviceStatusInBatch] = js.native
  /** Request to unclaim a device. */
  var unclaim: js.UndefOr[PartnerUnclaim] = js.native
  /** Request to set metadata for a device. */
  var updateMetadata: js.UndefOr[UpdateMetadataArguments] = js.native
}

object OperationPerDevice {
  @scala.inline
  def apply(): OperationPerDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationPerDevice]
  }
  @scala.inline
  implicit class OperationPerDeviceOps[Self <: OperationPerDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaim(value: PartnerClaim): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claim")(js.undefined)
        ret
    }
    @scala.inline
    def withResult(value: PerDeviceStatusInBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
    @scala.inline
    def withUnclaim(value: PartnerUnclaim): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclaim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnclaim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unclaim")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateMetadata(value: UpdateMetadataArguments): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateMetadata")(js.undefined)
        ret
    }
  }
  
}


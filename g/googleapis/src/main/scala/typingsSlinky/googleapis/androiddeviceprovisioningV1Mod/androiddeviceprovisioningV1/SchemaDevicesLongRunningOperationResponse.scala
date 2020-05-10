package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tracks the status of a long-running operation to claim, unclaim, or attach
  * metadata to devices. To learn more, read [Long‑running batch
  * operations](/zero-touch/guides/how-it-works#operations).
  */
@js.native
trait SchemaDevicesLongRunningOperationResponse extends js.Object {
  /**
    * The processing status for each device in the operation. One
    * `PerDeviceStatus` per device. The list order matches the items in the
    * original request.
    */
  var perDeviceStatus: js.UndefOr[js.Array[SchemaOperationPerDevice]] = js.native
  /**
    * A summary of how many items in the operation the server processed
    * successfully. Updated as the operation progresses.
    */
  var successCount: js.UndefOr[Double] = js.native
}

object SchemaDevicesLongRunningOperationResponse {
  @scala.inline
  def apply(): SchemaDevicesLongRunningOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDevicesLongRunningOperationResponse]
  }
  @scala.inline
  implicit class SchemaDevicesLongRunningOperationResponseOps[Self <: SchemaDevicesLongRunningOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerDeviceStatus(value: js.Array[SchemaOperationPerDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perDeviceStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerDeviceStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perDeviceStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCount")(js.undefined)
        ret
    }
  }
  
}


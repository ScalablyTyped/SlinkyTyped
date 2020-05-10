package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevicesLongRunningOperationResponse extends js.Object {
  /**
    * Processing status for each device.
    * One `PerDeviceStatus` per device. The order is the same as in your requests.
    */
  var perDeviceStatus: js.UndefOr[js.Array[OperationPerDevice]] = js.native
  /** Number of succeesfully processed ones. */
  var successCount: js.UndefOr[Double] = js.native
}

object DevicesLongRunningOperationResponse {
  @scala.inline
  def apply(): DevicesLongRunningOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicesLongRunningOperationResponse]
  }
  @scala.inline
  implicit class DevicesLongRunningOperationResponseOps[Self <: DevicesLongRunningOperationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPerDeviceStatus(value: js.Array[OperationPerDevice]): Self = {
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


package typingsSlinky.gapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDeviceMetadataInBatchRequest extends js.Object {
  /** List of metadata updates. */
  var updates: js.UndefOr[js.Array[UpdateMetadataArguments]] = js.native
}

object UpdateDeviceMetadataInBatchRequest {
  @scala.inline
  def apply(): UpdateDeviceMetadataInBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceMetadataInBatchRequest]
  }
  @scala.inline
  implicit class UpdateDeviceMetadataInBatchRequestOps[Self <: UpdateDeviceMetadataInBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdates(value: js.Array[UpdateMetadataArguments]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updates")(js.undefined)
        ret
    }
  }
  
}


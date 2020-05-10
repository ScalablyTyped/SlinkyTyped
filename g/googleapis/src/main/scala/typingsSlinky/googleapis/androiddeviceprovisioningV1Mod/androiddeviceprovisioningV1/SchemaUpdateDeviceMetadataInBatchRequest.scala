package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to update device metadata in batch.
  */
@js.native
trait SchemaUpdateDeviceMetadataInBatchRequest extends js.Object {
  /**
    * Required. The list of metadata updates.
    */
  var updates: js.UndefOr[js.Array[SchemaUpdateMetadataArguments]] = js.native
}

object SchemaUpdateDeviceMetadataInBatchRequest {
  @scala.inline
  def apply(): SchemaUpdateDeviceMetadataInBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDeviceMetadataInBatchRequest]
  }
  @scala.inline
  implicit class SchemaUpdateDeviceMetadataInBatchRequestOps[Self <: SchemaUpdateDeviceMetadataInBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpdates(value: js.Array[SchemaUpdateMetadataArguments]): Self = {
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


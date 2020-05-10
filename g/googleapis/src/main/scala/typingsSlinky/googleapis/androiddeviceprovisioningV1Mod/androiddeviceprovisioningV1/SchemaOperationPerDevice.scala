package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task for each device in the operation. Corresponds to each device change
  * in the request.
  */
@js.native
trait SchemaOperationPerDevice extends js.Object {
  /**
    * A copy of the original device-claim request received by the server.
    */
  var claim: js.UndefOr[SchemaPartnerClaim] = js.native
  /**
    * The processing result for each device.
    */
  var result: js.UndefOr[SchemaPerDeviceStatusInBatch] = js.native
  /**
    * A copy of the original device-unclaim request received by the server.
    */
  var unclaim: js.UndefOr[SchemaPartnerUnclaim] = js.native
  /**
    * A copy of the original metadata-update request received by the server.
    */
  var updateMetadata: js.UndefOr[SchemaUpdateMetadataArguments] = js.native
}

object SchemaOperationPerDevice {
  @scala.inline
  def apply(): SchemaOperationPerDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationPerDevice]
  }
  @scala.inline
  implicit class SchemaOperationPerDeviceOps[Self <: SchemaOperationPerDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaim(value: SchemaPartnerClaim): Self = {
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
    def withResult(value: SchemaPerDeviceStatusInBatch): Self = {
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
    def withUnclaim(value: SchemaPartnerUnclaim): Self = {
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
    def withUpdateMetadata(value: SchemaUpdateMetadataArguments): Self = {
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


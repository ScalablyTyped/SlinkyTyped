package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Captures the processing status for each device in the operation.
  */
@js.native
trait SchemaPerDeviceStatusInBatch extends js.Object {
  /**
    * If processing succeeds, the device ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * If processing fails, the error type.
    */
  var errorIdentifier: js.UndefOr[String] = js.native
  /**
    * If processing fails, a developer message explaining what went wrong.
    */
  var errorMessage: js.UndefOr[String] = js.native
  /**
    * The result status of the device after processing.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaPerDeviceStatusInBatch {
  @scala.inline
  def apply(): SchemaPerDeviceStatusInBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerDeviceStatusInBatch]
  }
  @scala.inline
  implicit class SchemaPerDeviceStatusInBatchOps[Self <: SchemaPerDeviceStatusInBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies metdata updates to one device.
  */
@js.native
trait SchemaUpdateMetadataArguments extends js.Object {
  /**
    * Device ID of the device.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Device identifier.
    */
  var deviceIdentifier: js.UndefOr[SchemaDeviceIdentifier] = js.native
  /**
    * Required. The metadata to update.
    */
  var deviceMetadata: js.UndefOr[SchemaDeviceMetadata] = js.native
}

object SchemaUpdateMetadataArguments {
  @scala.inline
  def apply(): SchemaUpdateMetadataArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateMetadataArguments]
  }
  @scala.inline
  implicit class SchemaUpdateMetadataArgumentsOps[Self <: SchemaUpdateMetadataArguments] (val x: Self) extends AnyVal {
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
    def withDeviceIdentifier(value: SchemaDeviceIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceMetadata(value: SchemaDeviceMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceMetadata")(js.undefined)
        ret
    }
  }
  
}


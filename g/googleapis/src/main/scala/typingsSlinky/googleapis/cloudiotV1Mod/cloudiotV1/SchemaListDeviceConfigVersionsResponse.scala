package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceConfigVersions`.
  */
@js.native
trait SchemaListDeviceConfigVersionsResponse extends js.Object {
  /**
    * The device configuration for the last few versions. Versions are listed
    * in decreasing order, starting from the most recent one.
    */
  var deviceConfigs: js.UndefOr[js.Array[SchemaDeviceConfig]] = js.native
}

object SchemaListDeviceConfigVersionsResponse {
  @scala.inline
  def apply(): SchemaListDeviceConfigVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceConfigVersionsResponse]
  }
  @scala.inline
  implicit class SchemaListDeviceConfigVersionsResponseOps[Self <: SchemaListDeviceConfigVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceConfigs(value: js.Array[SchemaDeviceConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceConfigs")(js.undefined)
        ret
    }
  }
  
}


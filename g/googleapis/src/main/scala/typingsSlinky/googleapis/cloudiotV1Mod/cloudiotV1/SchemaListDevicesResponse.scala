package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDevices`.
  */
@js.native
trait SchemaListDevicesResponse extends js.Object {
  /**
    * The devices that match the request.
    */
  var devices: js.UndefOr[js.Array[SchemaDevice]] = js.native
  /**
    * If not empty, indicates that there may be more devices that match the
    * request; this value should be passed in a new `ListDevicesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDevicesResponse {
  @scala.inline
  def apply(): SchemaListDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDevicesResponse]
  }
  @scala.inline
  implicit class SchemaListDevicesResponseOps[Self <: SchemaListDevicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevices(value: js.Array[SchemaDevice]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devices")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}


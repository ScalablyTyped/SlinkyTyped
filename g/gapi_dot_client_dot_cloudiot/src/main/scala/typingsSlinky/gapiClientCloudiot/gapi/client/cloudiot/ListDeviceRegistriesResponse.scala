package typingsSlinky.gapiClientCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceRegistriesResponse extends js.Object {
  /** The registries that matched the query. */
  var deviceRegistries: js.UndefOr[js.Array[DeviceRegistry]] = js.native
  /**
    * If not empty, indicates that there may be more registries that match the
    * request; this value should be passed in a new
    * `ListDeviceRegistriesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListDeviceRegistriesResponse {
  @scala.inline
  def apply(): ListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceRegistriesResponse]
  }
  @scala.inline
  implicit class ListDeviceRegistriesResponseOps[Self <: ListDeviceRegistriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceRegistries(value: js.Array[DeviceRegistry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceRegistries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceRegistries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceRegistries")(js.undefined)
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


package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for `ListDeviceRegistries`.
  */
@js.native
trait SchemaListDeviceRegistriesResponse extends js.Object {
  /**
    * The registries that matched the query.
    */
  var deviceRegistries: js.UndefOr[js.Array[SchemaDeviceRegistry]] = js.native
  /**
    * If not empty, indicates that there may be more registries that match the
    * request; this value should be passed in a new
    * `ListDeviceRegistriesRequest`.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDeviceRegistriesResponse {
  @scala.inline
  def apply(): SchemaListDeviceRegistriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDeviceRegistriesResponse]
  }
  @scala.inline
  implicit class SchemaListDeviceRegistriesResponseOps[Self <: SchemaListDeviceRegistriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceRegistries(value: js.Array[SchemaDeviceRegistry]): Self = {
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


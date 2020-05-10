package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListLocationsResponse returns the list of all GKE locations and their
  * recommendation state.
  */
@js.native
trait SchemaListLocationsResponse extends js.Object {
  /**
    * A full list of GKE locations.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.native
  /**
    * Only return ListLocationsResponse that occur after the page_token. This
    * value should be populated from the ListLocationsResponse.next_page_token
    * if that response token was set (which happens when listing more Locations
    * than fit in a single ListLocationsResponse).
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListLocationsResponse {
  @scala.inline
  def apply(): SchemaListLocationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListLocationsResponse]
  }
  @scala.inline
  implicit class SchemaListLocationsResponseOps[Self <: SchemaListLocationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocations(value: js.Array[SchemaLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
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


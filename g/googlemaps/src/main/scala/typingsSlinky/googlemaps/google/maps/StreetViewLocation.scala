package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreetViewLocation extends js.Object {
  var description: js.UndefOr[String] = js.native
  var latLng: js.UndefOr[LatLng] = js.native
  var pano: js.UndefOr[String] = js.native
  var shortDescription: js.UndefOr[String] = js.native
}

object StreetViewLocation {
  @scala.inline
  def apply(): StreetViewLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewLocation]
  }
  @scala.inline
  implicit class StreetViewLocationOps[Self <: StreetViewLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withLatLng(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLng")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latLng")(js.undefined)
        ret
    }
    @scala.inline
    def withPano(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pano")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPano: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pano")(js.undefined)
        ret
    }
    @scala.inline
    def withShortDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(js.undefined)
        ret
    }
  }
  
}


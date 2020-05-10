package typingsSlinky.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaLocation extends js.Object {
  var address: String = js.native
  var coord: LatLng = js.native
  var panoId: String = js.native
  var photodate: String = js.native
  var title: String = js.native
}

object PanoramaLocation {
  @scala.inline
  def apply(address: String, coord: LatLng, panoId: String, photodate: String, title: String): PanoramaLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], coord = coord.asInstanceOf[js.Any], panoId = panoId.asInstanceOf[js.Any], photodate = photodate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaLocation]
  }
  @scala.inline
  implicit class PanoramaLocationOps[Self <: PanoramaLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoord(value: LatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhotodate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photodate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


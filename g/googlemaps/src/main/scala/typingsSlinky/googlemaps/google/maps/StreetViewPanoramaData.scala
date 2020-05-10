package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreetViewPanoramaData extends js.Object {
  var copyright: js.UndefOr[String] = js.native
  var imageDate: js.UndefOr[String] = js.native
  var links: js.UndefOr[js.Array[StreetViewLink]] = js.native
  var location: js.UndefOr[StreetViewLocation] = js.native
  var tiles: js.UndefOr[StreetViewTileData] = js.native
}

object StreetViewPanoramaData {
  @scala.inline
  def apply(): StreetViewPanoramaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewPanoramaData]
  }
  @scala.inline
  implicit class StreetViewPanoramaDataOps[Self <: StreetViewPanoramaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyright(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyright: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyright")(js.undefined)
        ret
    }
    @scala.inline
    def withImageDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[StreetViewLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: StreetViewLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withTiles(value: StreetViewTileData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiles")(js.undefined)
        ret
    }
  }
  
}


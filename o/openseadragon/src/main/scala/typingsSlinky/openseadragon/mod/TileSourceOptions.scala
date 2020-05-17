package typingsSlinky.openseadragon.mod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileSourceOptions extends js.Object {
  var ajaxHeaders: js.UndefOr[js.Object] = js.native
  var ajaxWithCredentials: js.UndefOr[Boolean] = js.native
  var getTileUrl: js.UndefOr[js.Function3[/* l */ Double, /* x */ Double, /* y */ Double, String]] = js.native
  var height: js.UndefOr[Double] = js.native
  var maxLevel: js.UndefOr[Double] = js.native
  var minLevel: js.UndefOr[Double] = js.native
  var referenceStripThumbnailUrl: js.UndefOr[String] = js.native
  var success: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var tileHeight: js.UndefOr[Double] = js.native
  var tileOverlap: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var tileWidth: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object TileSourceOptions {
  @scala.inline
  def apply(): TileSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileSourceOptions]
  }
  @scala.inline
  implicit class TileSourceOptionsOps[Self <: TileSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxWithCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxWithCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTileUrl(value: (/* l */ Double, /* x */ Double, /* y */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileUrl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetTileUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTileUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceStripThumbnailUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripThumbnailUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceStripThumbnailUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceStripThumbnailUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withTileHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTileOverlap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileOverlap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileOverlap")(js.undefined)
        ret
    }
    @scala.inline
    def withTileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTileWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}


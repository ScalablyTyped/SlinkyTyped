package typingsSlinky.amapJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectRetina extends js.Object {
  var detectRetina: js.UndefOr[Boolean] = js.native
  var errorUrl: js.UndefOr[String] = js.native
  var getTileUrl: js.UndefOr[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, String]] = js.native
  var map: typingsSlinky.amapJsSdk.AMap.Map = js.native
  var opacity: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
  var tileUrl: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zooms: js.UndefOr[js.Array[Double]] = js.native
}

object DetectRetina {
  @scala.inline
  def apply(map: typingsSlinky.amapJsSdk.AMap.Map): DetectRetina = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectRetina]
  }
  @scala.inline
  implicit class DetectRetinaOps[Self <: DetectRetina] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMap(value: typingsSlinky.amapJsSdk.AMap.Map): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetectRetina(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectRetina")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectRetina: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectRetina")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTileUrl(value: (/* x */ Double, /* y */ Double, /* z */ Double) => String): Self = {
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
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
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
    def withTileUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withZooms(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZooms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(js.undefined)
        ret
    }
  }
  
}


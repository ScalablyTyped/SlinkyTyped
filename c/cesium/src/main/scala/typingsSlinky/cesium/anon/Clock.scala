package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.TimeIntervalCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Clock extends js.Object {
  var clock: js.UndefOr[typingsSlinky.cesium.mod.Clock] = js.native
  var credit: js.UndefOr[typingsSlinky.cesium.mod.Credit | String] = js.native
  var dimensions: js.UndefOr[js.Any] = js.native
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  var format: js.UndefOr[String] = js.native
  var layer: String = js.native
  var maximumLevel: js.UndefOr[Double] = js.native
  var minimumLevel: js.UndefOr[Double] = js.native
  var rectangle: js.UndefOr[typingsSlinky.cesium.mod.Rectangle] = js.native
  var style: String = js.native
  var subdomains: js.UndefOr[String | js.Array[String]] = js.native
  var tileHeight: js.UndefOr[Double] = js.native
  var tileMatrixLabels: js.UndefOr[js.Array[_]] = js.native
  var tileMatrixSetID: String = js.native
  var tileWidth: js.UndefOr[Double] = js.native
  var tilingScheme: js.UndefOr[typingsSlinky.cesium.mod.TilingScheme] = js.native
  var times: js.UndefOr[TimeIntervalCollection] = js.native
  var url: String = js.native
}

object Clock {
  @scala.inline
  def apply(layer: String, style: String, tileMatrixSetID: String, url: String): Clock = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], tileMatrixSetID = tileMatrixSetID.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clock]
  }
  @scala.inline
  implicit class ClockOps[Self <: Clock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileMatrixSetID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMatrixSetID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClock(value: typingsSlinky.cesium.mod.Clock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clock")(js.undefined)
        ret
    }
    @scala.inline
    def withCredit(value: typingsSlinky.cesium.mod.Credit | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credit")(js.undefined)
        ret
    }
    @scala.inline
    def withDimensions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsoid")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withRectangle(value: typingsSlinky.cesium.mod.Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubdomains(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubdomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subdomains")(js.undefined)
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
    def withTileMatrixLabels(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMatrixLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileMatrixLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileMatrixLabels")(js.undefined)
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
    def withTilingScheme(value: typingsSlinky.cesium.mod.TilingScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilingScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilingScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilingScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withTimes(value: TimeIntervalCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("times")(js.undefined)
        ret
    }
  }
  
}


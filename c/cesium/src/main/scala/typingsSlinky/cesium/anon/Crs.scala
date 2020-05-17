package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.GetFeatureInfoFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crs extends js.Object {
  var credit: js.UndefOr[typingsSlinky.cesium.mod.Credit | String] = js.native
  var crs: js.UndefOr[String] = js.native
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  var enablePickFeatures: js.UndefOr[Boolean] = js.native
  var getFeatureInfoFormats: js.UndefOr[js.Array[GetFeatureInfoFormat]] = js.native
  var getFeatureInfoParameters: js.UndefOr[js.Any] = js.native
  var layers: String = js.native
  var maximumLevel: js.UndefOr[Double] = js.native
  var minimumLevel: js.UndefOr[Double] = js.native
  var parameters: js.UndefOr[js.Any] = js.native
  var rectangle: js.UndefOr[typingsSlinky.cesium.mod.Rectangle] = js.native
  var srs: js.UndefOr[String] = js.native
  var subdomains: js.UndefOr[String | js.Array[String]] = js.native
  var tileHeight: js.UndefOr[Double] = js.native
  var tileWidth: js.UndefOr[Double] = js.native
  var tilingScheme: js.UndefOr[typingsSlinky.cesium.mod.TilingScheme] = js.native
  var url: String = js.native
}

object Crs {
  @scala.inline
  def apply(layers: String, url: String): Crs = {
    val __obj = js.Dynamic.literal(layers = layers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crs]
  }
  @scala.inline
  implicit class CrsOps[Self <: Crs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
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
    def withCrs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crs")(js.undefined)
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
    def withEnablePickFeatures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePickFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePickFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePickFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFeatureInfoFormats(value: js.Array[GetFeatureInfoFormat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeatureInfoFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetFeatureInfoFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeatureInfoFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFeatureInfoParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeatureInfoParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetFeatureInfoParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeatureInfoParameters")(js.undefined)
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
    def withParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
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
    def withSrs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srs")(js.undefined)
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
  }
  
}


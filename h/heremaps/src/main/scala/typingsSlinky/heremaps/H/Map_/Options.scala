package typingsSlinky.heremaps.H.Map_

import typingsSlinky.heremaps.H.geo.IPoint
import typingsSlinky.heremaps.H.geo.Rect
import typingsSlinky.heremaps.H.map.ViewPort.Padding
import typingsSlinky.heremaps.H.map.layer.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type defines options which can be used to initialize the map.
  * @property center {H.geo.IPoint=} - The initial center of the map, default is {lat:0, lng: 0}
  * @property zoom {number=} - The initial zoom level of the map, default is 0 respectively the minimal zoom level of the base map
  * @property bounds {H.geo.Rect=} - The view bounds to be displayed on the map. If provided, it takes precedence over center and zoom. and zoom if provided)
  * @property layers {Array<H.map.layer.Layer>=} - A list of layers to render on top of the base map
  * @property engineType: {H.Map.EngineType=} - The initial engine type to use, default is P2D
  * @property pixelRatio {number} - The pixelRatio to use for over-sampling in cases of high-resolution displays, default is 1
  * @property imprint {H.map.Imprint.Options=} - The imprint options or null to suppress the imprint
  * @property renderBaseBackground {H.Map.BackgroundRange=} - Object describes how many cached zoom levels should be used as a base map background while base map tiles are loading.
  * Example: {lower: 3, higher: 2}
  * @property autoColor {boolean=} - Indicates whether the UI's colors should automatically adjusted to the base layer, default is true. Up to now only the copyright style will be adjusted.
  * See H.map.layer.Layer.Options#dark
  * @property margin {number=} - The size in pixel of the supplemental area to render for each side of the map
  * @property padding {H.map.ViewPort.Padding=} - The padding in pixels for each side of the map
  * @property fixedCenter {boolean=} - Indicates whether the center of the map should remain unchanged if the viewport's size or padding has been changed, default is true
  * @property noWrap {boolean=} - Indicates whether to wrap the world on longitude axes. When set to true, only one world will be rendered. Default is false, multiple worlds are rendered.
  */
@js.native
trait Options extends js.Object {
  var autoColor: js.UndefOr[Boolean] = js.native
  var bounds: js.UndefOr[Rect] = js.native
  var center: js.UndefOr[IPoint] = js.native
  var engineType: js.UndefOr[EngineType] = js.native
  var fixedCenter: js.UndefOr[Boolean] = js.native
  var imprint: js.UndefOr[typingsSlinky.heremaps.H.map.Imprint.Options] = js.native
  var layers: js.UndefOr[js.Array[Layer]] = js.native
  var margin: js.UndefOr[Double] = js.native
  var noWrap: js.UndefOr[Boolean] = js.native
  var padding: js.UndefOr[Padding] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var renderBaseBackground: js.UndefOr[BackgroundRange] = js.native
  var zoom: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoColor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBounds(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounds")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineType(value: EngineType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineType")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withImprint(value: typingsSlinky.heremaps.H.map.Imprint.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imprint")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withNoWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noWrap")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Padding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBaseBackground(value: BackgroundRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBaseBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderBaseBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBaseBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}


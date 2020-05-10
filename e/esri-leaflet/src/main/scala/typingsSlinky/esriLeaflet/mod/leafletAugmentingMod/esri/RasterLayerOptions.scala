package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import typingsSlinky.leaflet.mod.ImageOverlayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for RasterLayer
  */
@js.native
trait RasterLayerOptions extends ImageOverlayOptions {
  /**
    * Server response content type.
    * @default 'image'
    */
  var f: js.UndefOr[String] = js.native
  /**
    * 	Closest zoom level the layer will be displayed on the map.
    */
  var maxZoom: js.UndefOr[Double] = js.native
  /**
    * Furthest zoom level the layer will be displayed on the map.
    */
  var minZoom: js.UndefOr[Double] = js.native
  /**
    * Position of the layer relative to other overlays.
    * @default 'front'
    */
  var position: js.UndefOr[String] = js.native
}

object RasterLayerOptions {
  @scala.inline
  def apply(): RasterLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterLayerOptions]
  }
  @scala.inline
  implicit class RasterLayerOptionsOps[Self <: RasterLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withF(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
  }
  
}


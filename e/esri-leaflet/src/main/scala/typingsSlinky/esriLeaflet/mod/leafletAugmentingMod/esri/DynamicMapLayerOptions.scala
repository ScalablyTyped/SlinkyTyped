package typingsSlinky.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for `L.esri.DynamicMapLayer`
  */
@js.native
trait DynamicMapLayerOptions
  extends RasterLayerOptions
     with LayerOptionsBase {
  /**
    * If enabled, appends a timestamp to each request to ensure a fresh image is created server-side.
    */
  var disableCache: js.UndefOr[Boolean] = js.native
  /**
    * JSON object literal used to manipulate the layer symbology defined in the service itself. Requires a 10.1
    * (or above) map service which supports dynamicLayers requests.
    */
  var dynamicLayers: js.UndefOr[js.Any] = js.native
  /**
    * Output format of the image.
    * @default 'png24'
    */
  var format: js.UndefOr[String] = js.native
  /**
    * 	SQL filters to define what features will be included in the image rendered by the service. An object is
    * 	used with keys that map each query to its respective layer.
    *
    * { 3: "STATE_NAME='Kansas'", 9: "POP2007>25000" }
    */
  var layerDefs: js.UndefOr[js.Any] = js.native
  /**
    * An array of Layer IDs like [3,4,5] to show from the service.
    */
  var layers: js.UndefOr[js.Array[_]] = js.native
  /**
    * Allow the server to produce transparent images.
    */
  var transparent: js.UndefOr[Boolean] = js.native
}

object DynamicMapLayerOptions {
  @scala.inline
  def apply(url: String): DynamicMapLayerOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicMapLayerOptions]
  }
  @scala.inline
  implicit class DynamicMapLayerOptionsOps[Self <: DynamicMapLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCache")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicLayers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicLayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicLayers")(js.undefined)
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
    def withLayerDefs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerDefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDefs")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[_]): Self = {
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
    def withTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparent")(js.undefined)
        ret
    }
  }
  
}


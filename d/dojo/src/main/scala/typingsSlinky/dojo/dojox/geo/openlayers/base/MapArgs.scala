package typingsSlinky.dojo.dojox.geo.openlayers.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.__MapArgs.html
  *
  * The keyword arguments that can be passed in a Map constructor.
  *
  */
@js.native
trait MapArgs extends js.Object {
  /**
    * The name of the base layer.
    *
    */
  var baseLayerName: String = js.native
  /**
    * Additional specific options passed to OpensLayers layer, such as The list of layer to display, for Web Map Server layer.
    *
    */
  var baseLayerOptions: String = js.native
  /**
    * type of the base layer. Can be any of
    *
    * dojox.geo.openlayers.BaseLayerType.OSM: Open Street Map base layer
    * dojox.geo.openlayers.BaseLayerType.WMS: Web Map Service layer
    * dojox.geo.openlayers.BaseLayerType.GOOGLE: Google layer
    * dojox.geo.openlayers.BaseLayerType.VIRTUAL_EARTH: Virtual Earth layer
    * dojox.geo.openlayers.BaseLayerType.BING: Bing layer
    * dojox.geo.openlayers.BaseLayerType.YAHOO: Yahoo layer
    * dojox.geo.openlayers.BaseLayerType.ARCGIS: ESRI ArgGIS layer
    *
    */
  var baseLayerType: String = js.native
  /**
    * Some layer may need an url such as Web Map Server.
    *
    */
  var baseLayerUrl: String = js.native
}

object MapArgs {
  @scala.inline
  def apply(baseLayerName: String, baseLayerOptions: String, baseLayerType: String, baseLayerUrl: String): MapArgs = {
    val __obj = js.Dynamic.literal(baseLayerName = baseLayerName.asInstanceOf[js.Any], baseLayerOptions = baseLayerOptions.asInstanceOf[js.Any], baseLayerType = baseLayerType.asInstanceOf[js.Any], baseLayerUrl = baseLayerUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapArgs]
  }
  @scala.inline
  implicit class MapArgsOps[Self <: MapArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseLayerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLayerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseLayerOptions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLayerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseLayerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLayerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseLayerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseLayerUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


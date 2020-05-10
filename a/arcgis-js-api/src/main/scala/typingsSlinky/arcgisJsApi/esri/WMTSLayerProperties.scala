package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.KVP
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.RESTful
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSLayerProperties
  extends LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties {
  /**
    * Currently active sublayer. Defaults to the first sublayer in [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#activeLayer)
    */
  var activeLayer: js.UndefOr[WMTSSublayerProperties] = js.native
  /**
    * Copyright information for the WMTS service. This defaults to the value of the AccessConstraints property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * Use this to append different custom parameters to the WMTS tile requests. The custom layer parameters are applied to GetTile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.UndefOr[js.Any] = js.native
  /**
    * Use this to append custom parameters to all WMTS requests. The custom parameters are applied to GetCapabilities and GetTile. For example, if an access key is required, the key can be configured as a custom parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[js.Any] = js.native
  /**
    * The service mode for the WMTS layer. If not specified, the API will first make a getCapabilities request using `RESTful`. If that fails, it will try using `KVP`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#serviceMode)
    *
    * @default RESTful
    */
  var serviceMode: js.UndefOr[RESTful | KVP] = js.native
  /**
    * A collection of [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[WMTSSublayerProperties]] = js.native
  /**
    * The URL of the WMTS service. The URL for the GetCapabilities is created based on the url and serviceMode properties. For example https://gibs.earthdata.nasa.gov/wmts/epsg4326/best.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Version of the [WMTS specification](http://www.opengeospatial.org/standards/wmts) to use. Probably `1.0.0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#version)
    */
  var version: js.UndefOr[String] = js.native
}

object WMTSLayerProperties {
  @scala.inline
  def apply(): WMTSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMTSLayerProperties]
  }
  @scala.inline
  implicit class WMTSLayerPropertiesOps[Self <: WMTSLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveLayer(value: WMTSSublayerProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeLayer")(js.undefined)
        ret
    }
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
    def withCustomLayerParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLayerParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLayerParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLayerParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceMode(value: RESTful | KVP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSublayers(value: CollectionProperties[WMTSSublayerProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublayers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSublayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sublayers")(js.undefined)
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
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}


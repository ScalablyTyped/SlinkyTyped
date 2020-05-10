package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMSLayerProperties
  extends LayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties {
  /**
    * Copyright information for the WMS service. This defaults to the value of the AccessConstraints property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * Use this to append different custom parameters to the WMS map requests. The custom layer parameters are applied to GetMap and GetFeatureInfo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.UndefOr[js.Any] = js.native
  /**
    * Use this to append custom parameters to all WMS requests. The custom parameters are applied to GetCapabilities, GetMap and GetFeatureInfo. For example, if an access key is required, the key can be configured as a custom parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[js.Any] = js.native
  /**
    * Description for the WMS layer. This defaults to the value of the Abstract property from the WMS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Return format of feature information (MIME type).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoFormat)
    */
  var featureInfoFormat: js.UndefOr[String] = js.native
  /**
    * The URL for the WMS GetFeatureInfo call.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoUrl)
    */
  var featureInfoUrl: js.UndefOr[String] = js.native
  /**
    * All bounding boxes defined for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#fullExtents)
    */
  var fullExtents: js.UndefOr[js.Array[ExtentProperties]] = js.native
  /**
    * The map image format (MIME type) to request. Defaults to `image/png` if the WMS service supports it. If not, it defaults to the value of the first `<Format>` in `<GetMap>` in the GetCapabilities response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageFormat)
    */
  var imageFormat: js.UndefOr[String] = js.native
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxHeight)
    *
    * @default 2048
    */
  var imageMaxHeight: js.UndefOr[Double] = js.native
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxWidth)
    *
    * @default 2048
    */
  var imageMaxWidth: js.UndefOr[Double] = js.native
  /**
    * Indicates whether the background of the image exported by the service is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageTransparency)
    *
    * @default true
    */
  var imageTransparency: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * List of spatialReference well known ids derived from the CRS elements of the first layer in the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReferences)
    */
  var spatialReferences: js.UndefOr[js.Array[Double]] = js.native
  /**
    * A collection of [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[WMSSublayerProperties]] = js.native
  /**
    * The URL of the WMS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Version of the [WMS specification](http://www.opengeospatial.org/standards/wms) to use. For example, `1.3.0`, `1.1.1`, `1.1` or `1.0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#version)
    */
  var version: js.UndefOr[String] = js.native
}

object WMSLayerProperties {
  @scala.inline
  def apply(): WMSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMSLayerProperties]
  }
  @scala.inline
  implicit class WMSLayerPropertiesOps[Self <: WMSLayerProperties] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureInfoFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureInfoFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureInfoFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureInfoFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureInfoUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureInfoUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureInfoUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureInfoUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withFullExtents(value: js.Array[ExtentProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullExtents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullExtents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullExtents")(js.undefined)
        ret
    }
    @scala.inline
    def withImageFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withImageMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMaxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMaxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withImageMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMaxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageMaxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withImageTransparency(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTransparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageTransparency")(js.undefined)
        ret
    }
    @scala.inline
    def withLegendEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegendEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legendEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withSpatialReferences(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpatialReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialReferences")(js.undefined)
        ret
    }
    @scala.inline
    def withSublayers(value: CollectionProperties[WMSSublayerProperties]): Self = {
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


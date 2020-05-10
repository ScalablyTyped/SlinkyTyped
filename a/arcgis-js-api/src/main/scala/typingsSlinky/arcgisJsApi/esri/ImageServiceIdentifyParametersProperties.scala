package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageServiceIdentifyParametersProperties extends js.Object {
  /**
    * Input geometry that defines the location to be identified. The location can be a point or a polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#geometry)
    */
  var geometry: js.UndefOr[PointProperties | PolygonProperties] = js.native
  /**
    * Controls the maximum number of returned catalog items, set to 1 to return the top most raster only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#maxItemCount)
    */
  var maxItemCount: js.UndefOr[Double] = js.native
  /**
    * Specifies the mosaic rules defining the image sorting order. When a mosaic rule is not specified, `center` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.native
  /**
    * Specifies the pixel level being identified on the x and y axis. Defaults to the base resolution of the dataset when not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSize)
    */
  var pixelSize: js.UndefOr[PointProperties] = js.native
  /**
    * Specifies the rendering rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.native
  /**
    * An array the [rendering rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule) to retrieve multiple processed pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRules)
    */
  var renderingRules: js.UndefOr[RasterFunctionProperties] = js.native
  /**
    * If `true`, returns both geometry and attributes of the catalog items. Set to `false` when catalog items are not needed to significantly improve identify operation's performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnCatalogItems)
    */
  var returnCatalogItems: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, each feature in the catalog items includes the geometry. Set to `false` to not display the features on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the pixel values of all raster catalog items under the requested geometry. Set to `false` when catalog item values are not needed to significantly improve identify operation's performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnPixelValues)
    */
  var returnPixelValues: js.UndefOr[Boolean] = js.native
  /**
    * A time extent for a temporal data against [time-aware imagery layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#timeInfo). For example, it can be used to discover land cover changes by decade.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.native
}

object ImageServiceIdentifyParametersProperties {
  @scala.inline
  def apply(): ImageServiceIdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageServiceIdentifyParametersProperties]
  }
  @scala.inline
  implicit class ImageServiceIdentifyParametersPropertiesOps[Self <: ImageServiceIdentifyParametersProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: PointProperties | PolygonProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMosaicRule(value: MosaicRuleProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mosaicRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMosaicRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mosaicRule")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelSize(value: PointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelSize")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderingRule(value: RasterFunctionProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderingRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingRule")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderingRules(value: RasterFunctionProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderingRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderingRules")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnCatalogItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnCatalogItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnCatalogItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnCatalogItems")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnGeometry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnGeometry")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnPixelValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPixelValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnPixelValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnPixelValues")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeExtent(value: TimeExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeExtent")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.all
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.top
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifyParametersProperties extends js.Object {
  /**
    * Resolution of the current map view in dots per inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#dpi)
    *
    * @default 96
    */
  var dpi: js.UndefOr[Double] = js.native
  /**
    * The geometry used to select features during the Identify operation. The type of the geometry is specified by [Geometry.type](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#type). The most common geometry used with Identify is a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#geometry)
    */
  var geometry: js.UndefOr[GeometryProperties] = js.native
  /**
    * Specify the number of decimal places for the geometries returned by the task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#geometryPrecision)
    */
  var geometryPrecision: js.UndefOr[Double] = js.native
  /**
    * Height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#height)
    *
    * @default 400
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The layers on which to perform the identify operation. The layers are specified as a comma-separated list of layer IDs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Specifies which layers to use when using Identify.
    *
    * Possible values | Description
    * --------------- | -----------
    * top | Only the top-most visible layer on the service is identified.
    * visible | All visible layers on the service are identified.
    * all | All layers on the service are identified, even if they are not visible. If your service has many layers, a request using this option will not perform well. A visible layer means you can see it in the map at the current extent.  If a layer is turned off or not in range based on its scale dependency settings, it cannot be identified.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#layerOption)
    *
    * @default top
    */
  var layerOption: js.UndefOr[top | visible | all] = js.native
  /**
    * The Extent or bounding box of the current map view. The `mapExtent` property is assumed to be in the spatial reference of the map unless [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference) has been specified.  The values for [mapExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent), [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#height), [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#width), and [dpi](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#dpi) are used to determine the current map scale. Once the scale is known, the map service can exclude layers based on their scale dependency settings. The map service is not performing a spatial intersection based on the provided extent. These properties are also used to calculate the search distance on the map based on the tolerance in screen pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent)
    */
  var mapExtent: js.UndefOr[ExtentProperties] = js.native
  /**
    * The maximum allowable offset used for generalizing geometries returned by the identify operation. The offset is in the units of the [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference). If a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference) is not defined the spatial reference of the view is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#maxAllowableOffset)
    */
  var maxAllowableOffset: js.UndefOr[Double] = js.native
  /**
    * If `true`, field names will be returned instead of field aliases. Requires ArcGIS Server service 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnFieldName)
    *
    * @default false
    */
  var returnFieldName: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the result set includes the geometry associated with each result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, indicates that M values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnM)
    *
    * @default false
    */
  var returnM: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, the values in the result will not be formatted i.e. numbers will returned as is and dates will be returned as epoch values. Requires ArcGIS Server service 10.5 or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnUnformattedValues)
    *
    * @default false
    */
  var returnUnformattedValues: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, indicates that z-values will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#returnZ)
    *
    * @default false
    */
  var returnZ: js.UndefOr[Boolean] = js.native
  /**
    * The spatial reference of the input and output geometries as well as of the [mapExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#mapExtent). If the spatial reference is not specified, the geometry and the extent are assumed to be in the spatial reference of the view, and the output geometries will also be in the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The distance in screen pixels from the specified geometry within which the identify should be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#tolerance)
    */
  var tolerance: js.UndefOr[Double] = js.native
  /**
    * Width of the current map view in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-IdentifyParameters.html#width)
    *
    * @default 400
    */
  var width: js.UndefOr[Double] = js.native
}

object IdentifyParametersProperties {
  @scala.inline
  def apply(): IdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentifyParametersProperties]
  }
  @scala.inline
  implicit class IdentifyParametersPropertiesOps[Self <: IdentifyParametersProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDpi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDpi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dpi")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometry(value: GeometryProperties): Self = {
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
    def withGeometryPrecision(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryPrecision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryPrecision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryPrecision")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerIds")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerOption(value: top | visible | all): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerOption")(js.undefined)
        ret
    }
    @scala.inline
    def withMapExtent(value: ExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAllowableOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAllowableOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAllowableOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAllowableOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnFieldName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnFieldName")(js.undefined)
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
    def withReturnM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnM")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnUnformattedValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnUnformattedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnUnformattedValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnUnformattedValues")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnZ(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnZ")(js.undefined)
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
    def withTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}


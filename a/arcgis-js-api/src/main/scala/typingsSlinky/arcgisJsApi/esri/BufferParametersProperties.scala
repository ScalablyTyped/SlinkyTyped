package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferParametersProperties extends js.Object {
  /**
    * The spatial reference in which the geometries are buffered.  If `bufferSpatialReference` is not specified, the geometries are buffered in the spatial reference specified by `outSpatialReference`. If `outSpatialReference` is also not specified, they are buffered in the spatial reference of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#bufferSpatialReference)
    */
  var bufferSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The distances the input features are buffered. The distance units are specified by `unit`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#distances)
    */
  var distances: js.UndefOr[js.Array[Double]] = js.native
  /**
    * If the input geometries are in a geographic coordinate system, set geodesic to `true` to generate a buffer polygon using a geodesic distance. The `bufferSpatialReference` property is ignored when geodesic is set to `true`. Requires ArcGIS Server 10.1 or greater geometry service. For more information, see the ArcGIS REST API documentation on the GeometryService buffer operation and the geodesic property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  /**
    * The input geometries to buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.native
  /**
    * The spatial reference for the returned geometries.  If `outSpatialReference` is not specified, the output geometries are in the spatial reference specified by `bufferSpatialReference`. If `bufferSpatialReference` also is not specified, they are in the spatial reference of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * If `true`, all geometries buffered at a given distance are unioned into a single (possibly multipart) polygon, and the unioned geometry is placed in the output array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#unionResults)
    */
  var unionResults: js.UndefOr[Boolean] = js.native
  /**
    * The units for calculating each buffer distance. If `unit` is not specified, the units are derived from `bufferSpatialReference`. If `bufferSpatialReference` is not specified, the units are derived from the features.  For a list of valid units, see [esriSRUnitType Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnitType_Constants/000w00000042000000/) and [esriSRUnit2Type Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnit2Type_Constants/000w00000041000000/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#unit)
    */
  var unit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.native
}

object BufferParametersProperties {
  @scala.inline
  def apply(): BufferParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferParametersProperties]
  }
  @scala.inline
  implicit class BufferParametersPropertiesOps[Self <: BufferParametersProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSpatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSpatialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withDistances(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distances")(js.undefined)
        ret
    }
    @scala.inline
    def withGeodesic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeodesic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometries(value: js.Array[GeometryProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(js.undefined)
        ret
    }
    @scala.inline
    def withOutSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outSpatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outSpatialReference")(js.undefined)
        ret
    }
    @scala.inline
    def withUnionResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unionResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnionResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unionResults")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}


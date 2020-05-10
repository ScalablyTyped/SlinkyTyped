package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoprocessorProperties extends TaskProperties {
  /**
    * The spatial reference of the output geometries. If not specified, the output geometries will be in the spatial reference of the input geometries. If [processSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processSpatialReference) is specified and `outSpatialReference` is not specified, the output geometries will be in the spatial reference of the process spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#outSpatialReference)
    *
    * @default null
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * ProcessExtent, if specified, will only process features that overlap this extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processExtent)
    *
    * @default null
    */
  var processExtent: js.UndefOr[ExtentProperties] = js.native
  /**
    * The spatial reference that the model will use to perform geometry operations. If `processSpatialReference` is specified and [outputSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#outputSpatialReference) is not specified, the output geometries will be in the spatial reference of the process spatial reference.  A possible common scenario for using `processSpatialReference` and `outputSpatialReference` is that you would like to perform spatial operations like buffer or clip on a projected coordinate system such as web mercator. And you would like to recieve the output based on a geographic coordinates such as WGS84.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processSpatialReference)
    *
    * @default null
    */
  var processSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * If `true`, m-values will be included in the results if the features have m-values. Otherwise, m-values are not returned. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#returnM)
    *
    * @default false
    */
  var returnM: js.UndefOr[Boolean] = js.native
  /**
    * If `true`, z-values will be included in the results if the features have z-values. Otherwise, z-values are not returned. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#returnZ)
    *
    * @default false
    */
  var returnZ: js.UndefOr[Boolean] = js.native
}

object GeoprocessorProperties {
  @scala.inline
  def apply(): GeoprocessorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoprocessorProperties]
  }
  @scala.inline
  implicit class GeoprocessorPropertiesOps[Self <: GeoprocessorProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withProcessExtent(value: ExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessSpatialReference(value: SpatialReferenceProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processSpatialReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcessSpatialReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processSpatialReference")(js.undefined)
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
  }
  
}


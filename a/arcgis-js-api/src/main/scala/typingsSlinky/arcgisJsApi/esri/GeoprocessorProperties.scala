package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = this.set("outSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutSpatialReference: Self = this.set("outSpatialReference", js.undefined)
    
    @scala.inline
    def setProcessExtent(value: ExtentProperties): Self = this.set("processExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessExtent: Self = this.set("processExtent", js.undefined)
    
    @scala.inline
    def setProcessSpatialReference(value: SpatialReferenceProperties): Self = this.set("processSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessSpatialReference: Self = this.set("processSpatialReference", js.undefined)
    
    @scala.inline
    def setReturnM(value: Boolean): Self = this.set("returnM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnM: Self = this.set("returnM", js.undefined)
    
    @scala.inline
    def setReturnZ(value: Boolean): Self = this.set("returnZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnZ: Self = this.set("returnZ", js.undefined)
  }
}

package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneService extends js.Object {
  
  /**
    * The copyright text as defined by the scene service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * The layer ID, or layer index, of a Scene Service layer. This is particularly useful when loading a single layer with the [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#portalItem) property from a service containing multiple layers. You can specify this value in one of two scenarios:
    *   * When loading the layer via the [portalItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#portalItem) property.
    *   * When pointing the layer [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#url) directly to the Scene Service.
    *
    *
    * If a layerId is not specified in either of the above scenarios, then the first layer in the service (`layerId = 0`) is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId)
    */
  var layerId: Double = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * The URL of the REST endpoint of the layer or scene service. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.  The layer may be specified using the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId) property when the url points directly to a service and not a specific layer. If [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#layerId) is not specified, then it will default to the first layer in the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#url)
    */
  var url: String = js.native
  
  /**
    * The version of the scene service specification used for this service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#version)
    */
  val version: SceneServiceVersion = js.native
}
object SceneService {
  
  @scala.inline
  def apply(
    copyright: String,
    layerId: Double,
    spatialReference: SpatialReference,
    url: String,
    version: SceneServiceVersion
  ): SceneService = {
    val __obj = js.Dynamic.literal(copyright = copyright.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneService]
  }
  
  @scala.inline
  implicit class SceneServiceOps[Self <: SceneService] (val x: Self) extends AnyVal {
    
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
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerId(value: Double): Self = this.set("layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReference(value: SpatialReference): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: SceneServiceVersion): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}

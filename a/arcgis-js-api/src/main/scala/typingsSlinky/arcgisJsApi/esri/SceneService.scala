package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneService extends StObject {
  
  /**
    * The copyright text as defined by the scene service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-SceneService.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * The layer ID, or layer index, of a Scene Service layer.
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
    * The URL of the REST endpoint of the layer or scene service.
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
  implicit class SceneServiceMutableBuilder[Self <: SceneService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerId(value: Double): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: SceneServiceVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

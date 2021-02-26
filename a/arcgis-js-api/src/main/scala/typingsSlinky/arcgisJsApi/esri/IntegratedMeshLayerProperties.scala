package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegratedMeshLayerProperties
  extends LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  
  /**
    * Specifies how the mesh is placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[IntegratedMeshLayerElevationInfo] = js.native
  
  /**
    * A collection of [SceneModification](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html) with polygons and types to apply client-side modifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#modifications)
    */
  var modifications: js.UndefOr[SceneModificationsProperties] = js.native
}
object IntegratedMeshLayerProperties {
  
  @scala.inline
  def apply(): IntegratedMeshLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegratedMeshLayerProperties]
  }
  
  @scala.inline
  implicit class IntegratedMeshLayerPropertiesMutableBuilder[Self <: IntegratedMeshLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElevationInfo(value: IntegratedMeshLayerElevationInfo): Self = StObject.set(x, "elevationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationInfoUndefined: Self = StObject.set(x, "elevationInfo", js.undefined)
    
    @scala.inline
    def setModifications(value: SceneModificationsProperties): Self = StObject.set(x, "modifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationsUndefined: Self = StObject.set(x, "modifications", js.undefined)
  }
}

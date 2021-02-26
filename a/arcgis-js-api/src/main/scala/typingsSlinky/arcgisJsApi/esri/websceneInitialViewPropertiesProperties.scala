package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.global
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait websceneInitialViewPropertiesProperties extends StObject {
  
  /**
    * The initial environment settings of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#environment)
    */
  var environment: js.UndefOr[EnvironmentProperties] = js.native
  
  /**
    * The spatial reference of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * The viewing mode of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewingMode)
    */
  var viewingMode: js.UndefOr[global | local] = js.native
  
  /**
    * The initial viewpoint of the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-InitialViewProperties.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.native
}
object websceneInitialViewPropertiesProperties {
  
  @scala.inline
  def apply(): websceneInitialViewPropertiesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[websceneInitialViewPropertiesProperties]
  }
  
  @scala.inline
  implicit class websceneInitialViewPropertiesPropertiesMutableBuilder[Self <: websceneInitialViewPropertiesProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironment(value: EnvironmentProperties): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    @scala.inline
    def setViewingMode(value: global | local): Self = StObject.set(x, "viewingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewingModeUndefined: Self = StObject.set(x, "viewingMode", js.undefined)
    
    @scala.inline
    def setViewpoint(value: ViewpointProperties): Self = StObject.set(x, "viewpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewpointUndefined: Self = StObject.set(x, "viewpoint", js.undefined)
  }
}

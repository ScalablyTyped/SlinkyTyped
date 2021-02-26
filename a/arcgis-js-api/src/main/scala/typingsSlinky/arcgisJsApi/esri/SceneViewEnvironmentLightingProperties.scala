package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewEnvironmentLightingProperties extends Object {
  
  /**
    * Indicates whether to show ambient occlusion shading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var ambientOcclusionEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the date and time of the simulated sun is automatically updated to maintain the current time of day while the camera changes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var cameraTrackingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The current date and time of the simulated sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var date: js.UndefOr[DateProperties] = js.native
  
  /**
    * Indicates whether to show shadows cast by the sun.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether polygons that use [WaterSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WaterSymbol3DLayer.html) display reflections of surrounding terrain, buildings and other 3D objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var waterReflectionEnabled: js.UndefOr[Boolean] = js.native
}
object SceneViewEnvironmentLightingProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewEnvironmentLightingProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewEnvironmentLightingProperties]
  }
  
  @scala.inline
  implicit class SceneViewEnvironmentLightingPropertiesMutableBuilder[Self <: SceneViewEnvironmentLightingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmbientOcclusionEnabled(value: Boolean): Self = StObject.set(x, "ambientOcclusionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmbientOcclusionEnabledUndefined: Self = StObject.set(x, "ambientOcclusionEnabled", js.undefined)
    
    @scala.inline
    def setCameraTrackingEnabled(value: Boolean): Self = StObject.set(x, "cameraTrackingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCameraTrackingEnabledUndefined: Self = StObject.set(x, "cameraTrackingEnabled", js.undefined)
    
    @scala.inline
    def setDate(value: DateProperties): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDirectShadowsEnabled(value: Boolean): Self = StObject.set(x, "directShadowsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectShadowsEnabledUndefined: Self = StObject.set(x, "directShadowsEnabled", js.undefined)
    
    @scala.inline
    def setWaterReflectionEnabled(value: Boolean): Self = StObject.set(x, "waterReflectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaterReflectionEnabledUndefined: Self = StObject.set(x, "waterReflectionEnabled", js.undefined)
  }
}

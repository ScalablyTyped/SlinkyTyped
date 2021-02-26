package typingsSlinky.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CascadesEnabled extends StObject {
  
  var cascadesEnabled: js.UndefOr[Boolean] = js.native
  
  var darkness: js.UndefOr[Double] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var isPointLight: js.UndefOr[Boolean] = js.native
  
  var lightCamera: typingsSlinky.cesium.mod.Camera = js.native
  
  var maximumDistance: js.UndefOr[Double] = js.native
  
  var normalOffset: js.UndefOr[Boolean] = js.native
  
  var numberOfCascades: js.UndefOr[Double] = js.native
  
  var pointLightRadius: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var softShadows: js.UndefOr[Boolean] = js.native
}
object CascadesEnabled {
  
  @scala.inline
  def apply(lightCamera: typingsSlinky.cesium.mod.Camera): CascadesEnabled = {
    val __obj = js.Dynamic.literal(lightCamera = lightCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascadesEnabled]
  }
  
  @scala.inline
  implicit class CascadesEnabledMutableBuilder[Self <: CascadesEnabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCascadesEnabled(value: Boolean): Self = StObject.set(x, "cascadesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadesEnabledUndefined: Self = StObject.set(x, "cascadesEnabled", js.undefined)
    
    @scala.inline
    def setDarkness(value: Double): Self = StObject.set(x, "darkness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDarknessUndefined: Self = StObject.set(x, "darkness", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIsPointLight(value: Boolean): Self = StObject.set(x, "isPointLight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPointLightUndefined: Self = StObject.set(x, "isPointLight", js.undefined)
    
    @scala.inline
    def setLightCamera(value: typingsSlinky.cesium.mod.Camera): Self = StObject.set(x, "lightCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDistance(value: Double): Self = StObject.set(x, "maximumDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumDistanceUndefined: Self = StObject.set(x, "maximumDistance", js.undefined)
    
    @scala.inline
    def setNormalOffset(value: Boolean): Self = StObject.set(x, "normalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalOffsetUndefined: Self = StObject.set(x, "normalOffset", js.undefined)
    
    @scala.inline
    def setNumberOfCascades(value: Double): Self = StObject.set(x, "numberOfCascades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfCascadesUndefined: Self = StObject.set(x, "numberOfCascades", js.undefined)
    
    @scala.inline
    def setPointLightRadius(value: Double): Self = StObject.set(x, "pointLightRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointLightRadiusUndefined: Self = StObject.set(x, "pointLightRadius", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSoftShadows(value: Boolean): Self = StObject.set(x, "softShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftShadowsUndefined: Self = StObject.set(x, "softShadows", js.undefined)
  }
}

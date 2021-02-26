package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.MaterialProperty
import typingsSlinky.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceDisplayCondition extends StObject {
  
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  var leadTime: js.UndefOr[Property | Double] = js.native
  
  var material: js.UndefOr[MaterialProperty] = js.native
  
  var resolution: js.UndefOr[Property | Double] = js.native
  
  var show: js.UndefOr[Property | Boolean] = js.native
  
  var trailTime: js.UndefOr[Property | Double] = js.native
  
  var width: js.UndefOr[Property | Double] = js.native
}
object DistanceDisplayCondition {
  
  @scala.inline
  def apply(): DistanceDisplayCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceDisplayCondition]
  }
  
  @scala.inline
  implicit class DistanceDisplayConditionMutableBuilder[Self <: DistanceDisplayCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistanceDisplayCondition(value: Property): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setLeadTime(value: Property | Double): Self = StObject.set(x, "leadTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeadTimeUndefined: Self = StObject.set(x, "leadTime", js.undefined)
    
    @scala.inline
    def setMaterial(value: MaterialProperty): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setResolution(value: Property | Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setTrailTime(value: Property | Double): Self = StObject.set(x, "trailTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailTimeUndefined: Self = StObject.set(x, "trailTime", js.undefined)
    
    @scala.inline
    def setWidth(value: Property | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

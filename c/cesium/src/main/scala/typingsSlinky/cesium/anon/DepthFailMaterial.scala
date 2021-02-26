package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.MaterialProperty
import typingsSlinky.cesium.mod.Property
import typingsSlinky.cesium.mod.ShadowMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepthFailMaterial extends StObject {
  
  var arcType: js.UndefOr[Property | typingsSlinky.cesium.mod.ArcType] = js.native
  
  var clampToGround: js.UndefOr[Property | Boolean] = js.native
  
  var classificationType: js.UndefOr[Property | typingsSlinky.cesium.mod.ClassificationType] = js.native
  
  var depthFailMaterial: js.UndefOr[MaterialProperty] = js.native
  
  var distanceDisplayCondition: js.UndefOr[Property] = js.native
  
  var granularity: js.UndefOr[Property] = js.native
  
  var material: js.UndefOr[MaterialProperty | typingsSlinky.cesium.mod.Color] = js.native
  
  var positions: js.UndefOr[Property | js.Array[Cartesian3]] = js.native
  
  var shadows: js.UndefOr[Property | ShadowMode] = js.native
  
  var show: js.UndefOr[Property | Boolean] = js.native
  
  var width: js.UndefOr[Property | Double] = js.native
  
  var zIndex: js.UndefOr[Property | Double] = js.native
}
object DepthFailMaterial {
  
  @scala.inline
  def apply(): DepthFailMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepthFailMaterial]
  }
  
  @scala.inline
  implicit class DepthFailMaterialMutableBuilder[Self <: DepthFailMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArcType(value: Property | typingsSlinky.cesium.mod.ArcType): Self = StObject.set(x, "arcType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcTypeUndefined: Self = StObject.set(x, "arcType", js.undefined)
    
    @scala.inline
    def setClampToGround(value: Property | Boolean): Self = StObject.set(x, "clampToGround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClampToGroundUndefined: Self = StObject.set(x, "clampToGround", js.undefined)
    
    @scala.inline
    def setClassificationType(value: Property | typingsSlinky.cesium.mod.ClassificationType): Self = StObject.set(x, "classificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationTypeUndefined: Self = StObject.set(x, "classificationType", js.undefined)
    
    @scala.inline
    def setDepthFailMaterial(value: MaterialProperty): Self = StObject.set(x, "depthFailMaterial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthFailMaterialUndefined: Self = StObject.set(x, "depthFailMaterial", js.undefined)
    
    @scala.inline
    def setDistanceDisplayCondition(value: Property): Self = StObject.set(x, "distanceDisplayCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceDisplayConditionUndefined: Self = StObject.set(x, "distanceDisplayCondition", js.undefined)
    
    @scala.inline
    def setGranularity(value: Property): Self = StObject.set(x, "granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularityUndefined: Self = StObject.set(x, "granularity", js.undefined)
    
    @scala.inline
    def setMaterial(value: MaterialProperty | typingsSlinky.cesium.mod.Color): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setPositions(value: Property | js.Array[Cartesian3]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    @scala.inline
    def setPositionsVarargs(value: Cartesian3*): Self = StObject.set(x, "positions", js.Array(value :_*))
    
    @scala.inline
    def setShadows(value: Property | ShadowMode): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
    
    @scala.inline
    def setShow(value: Property | Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    @scala.inline
    def setWidth(value: Property | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZIndex(value: Property | Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}

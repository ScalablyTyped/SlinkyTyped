package typingsSlinky.babylonjs.anon

import typingsSlinky.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrontUVsRadius extends StObject {
  
  var arc: js.UndefOr[Double] = js.native
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var tessellation: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
}
object FrontUVsRadius {
  
  @scala.inline
  def apply(): FrontUVsRadius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrontUVsRadius]
  }
  
  @scala.inline
  implicit class FrontUVsRadiusMutableBuilder[Self <: FrontUVsRadius] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArc(value: Double): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTessellationUndefined: Self = StObject.set(x, "tessellation", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}

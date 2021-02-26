package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugShowBoundingVolume extends StObject {
  
  var center: js.UndefOr[Cartesian3] = js.native
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var material: js.UndefOr[typingsSlinky.cesium.mod.Material] = js.native
  
  var modelMatrix: js.UndefOr[Matrix4] = js.native
  
  var radii: js.UndefOr[Cartesian3] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
}
object DebugShowBoundingVolume {
  
  @scala.inline
  def apply(): DebugShowBoundingVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugShowBoundingVolume]
  }
  
  @scala.inline
  implicit class DebugShowBoundingVolumeMutableBuilder[Self <: DebugShowBoundingVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: Cartesian3): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMaterial(value: typingsSlinky.cesium.mod.Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    @scala.inline
    def setRadii(value: Cartesian3): Self = StObject.set(x, "radii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiiUndefined: Self = StObject.set(x, "radii", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}

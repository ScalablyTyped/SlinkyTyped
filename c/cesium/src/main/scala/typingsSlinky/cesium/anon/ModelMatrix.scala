package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Matrix4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelMatrix extends StObject {
  
  var blendOption: js.UndefOr[typingsSlinky.cesium.mod.BlendOption] = js.native
  
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  
  var modelMatrix: js.UndefOr[Matrix4] = js.native
}
object ModelMatrix {
  
  @scala.inline
  def apply(): ModelMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelMatrix]
  }
  
  @scala.inline
  implicit class ModelMatrixMutableBuilder[Self <: ModelMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlendOption(value: typingsSlinky.cesium.mod.BlendOption): Self = StObject.set(x, "blendOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendOptionUndefined: Self = StObject.set(x, "blendOption", js.undefined)
    
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = StObject.set(x, "debugShowBoundingVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugShowBoundingVolumeUndefined: Self = StObject.set(x, "debugShowBoundingVolume", js.undefined)
    
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
  }
}

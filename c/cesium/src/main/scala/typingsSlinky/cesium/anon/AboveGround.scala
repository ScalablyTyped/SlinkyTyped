package typingsSlinky.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AboveGround extends StObject {
  
  var aboveGround: js.UndefOr[Boolean] = js.native
  
  var faceForward: js.UndefOr[Boolean] = js.native
  
  var flat: js.UndefOr[Boolean] = js.native
  
  var fragmentShaderSource: js.UndefOr[String] = js.native
  
  var material: js.UndefOr[typingsSlinky.cesium.mod.Material] = js.native
  
  var renderState: js.UndefOr[typingsSlinky.cesium.mod.RenderState] = js.native
  
  var translucent: js.UndefOr[Boolean] = js.native
  
  var vertexShaderSource: js.UndefOr[String] = js.native
}
object AboveGround {
  
  @scala.inline
  def apply(): AboveGround = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AboveGround]
  }
  
  @scala.inline
  implicit class AboveGroundMutableBuilder[Self <: AboveGround] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAboveGround(value: Boolean): Self = StObject.set(x, "aboveGround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAboveGroundUndefined: Self = StObject.set(x, "aboveGround", js.undefined)
    
    @scala.inline
    def setFaceForward(value: Boolean): Self = StObject.set(x, "faceForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceForwardUndefined: Self = StObject.set(x, "faceForward", js.undefined)
    
    @scala.inline
    def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    @scala.inline
    def setFragmentShaderSource(value: String): Self = StObject.set(x, "fragmentShaderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentShaderSourceUndefined: Self = StObject.set(x, "fragmentShaderSource", js.undefined)
    
    @scala.inline
    def setMaterial(value: typingsSlinky.cesium.mod.Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setRenderState(value: typingsSlinky.cesium.mod.RenderState): Self = StObject.set(x, "renderState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderStateUndefined: Self = StObject.set(x, "renderState", js.undefined)
    
    @scala.inline
    def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
    
    @scala.inline
    def setVertexShaderSource(value: String): Self = StObject.set(x, "vertexShaderSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexShaderSourceUndefined: Self = StObject.set(x, "vertexShaderSource", js.undefined)
  }
}

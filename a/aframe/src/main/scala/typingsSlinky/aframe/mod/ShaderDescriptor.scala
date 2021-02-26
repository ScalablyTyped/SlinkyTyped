package typingsSlinky.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShaderDescriptor[T /* <: Shader */] extends StObject {
  
  var Shader: ShaderConstructor[T] = js.native
  
  var schema: Schema_[js.Object] = js.native
}
object ShaderDescriptor {
  
  @scala.inline
  def apply[T /* <: Shader */](Shader: ShaderConstructor[T], schema: Schema_[js.Object]): ShaderDescriptor[T] = {
    val __obj = js.Dynamic.literal(Shader = Shader.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDescriptor[T]]
  }
  
  @scala.inline
  implicit class ShaderDescriptorMutableBuilder[Self <: ShaderDescriptor[_], T /* <: Shader */] (val x: Self with ShaderDescriptor[T]) extends AnyVal {
    
    @scala.inline
    def setSchema(value: Schema_[js.Object]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShader(value: ShaderConstructor[T]): Self = StObject.set(x, "Shader", value.asInstanceOf[js.Any])
  }
}

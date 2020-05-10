package typingsSlinky.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShaderDescriptor[T /* <: Shader */] extends js.Object {
  var Shader: ShaderConstructor[T] = js.native
  var schema: Schema_[js.Object] = js.native
}

object ShaderDescriptor {
  @scala.inline
  def apply[T](Shader: ShaderConstructor[T], schema: Schema_[js.Object]): ShaderDescriptor[T] = {
    val __obj = js.Dynamic.literal(Shader = Shader.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderDescriptor[T]]
  }
  @scala.inline
  implicit class ShaderDescriptorOps[Self[t] <: ShaderDescriptor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withShader(value: ShaderConstructor[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: Schema_[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


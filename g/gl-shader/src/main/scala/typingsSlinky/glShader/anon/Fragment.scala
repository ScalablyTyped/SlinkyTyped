package typingsSlinky.glShader.anon

import typingsSlinky.glShader.mod.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fragment extends js.Object {
  var attributes: js.Array[Parameter] = js.native
  var fragment: String = js.native
  var uniforms: js.Array[Parameter] = js.native
  var vertex: String = js.native
}

object Fragment {
  @scala.inline
  def apply(attributes: js.Array[Parameter], fragment: String, uniforms: js.Array[Parameter], vertex: String): Fragment = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fragment]
  }
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: js.Array[Parameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniforms(value: js.Array[Parameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.glShader.anon

import typingsSlinky.glShader.mod.Parameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var attributes: js.UndefOr[js.Array[Parameter]] = js.native
  var fragment: String = js.native
  var uniforms: js.UndefOr[js.Array[Parameter]] = js.native
  var vertex: String = js.native
}

object Attributes {
  @scala.inline
  def apply(fragment: String, vertex: String): Attributes = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Array[Parameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withUniforms(value: js.Array[Parameter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUniforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uniforms")(js.undefined)
        ret
    }
  }
  
}


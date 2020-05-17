package typingsSlinky.glReact.anon

import typingsSlinky.glReact.mod.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlParent extends js.Object {
  var glParent: Surface[_] | typingsSlinky.glReact.mod.Node = js.native
  var glSurface: Surface[_] = js.native
}

object GlParent {
  @scala.inline
  def apply(glParent: Surface[_] | typingsSlinky.glReact.mod.Node, glSurface: Surface[_]): GlParent = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlParent]
  }
  @scala.inline
  implicit class GlParentOps[Self <: GlParent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlParent(value: Surface[_] | typingsSlinky.glReact.mod.Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlSurface(value: Surface[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glSurface")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


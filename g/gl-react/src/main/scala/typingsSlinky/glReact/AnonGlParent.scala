package typingsSlinky.glReact

import typingsSlinky.glReact.mod.Node
import typingsSlinky.glReact.mod.Surface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlParent extends js.Object {
  var glParent: Surface[_] | Node = js.native
  var glSurface: Surface[_] = js.native
}

object AnonGlParent {
  @scala.inline
  def apply(glParent: Surface[_] | Node, glSurface: Surface[_]): AnonGlParent = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlParent]
  }
  @scala.inline
  implicit class AnonGlParentOps[Self <: AnonGlParent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlParent(value: Surface[_] | Node): Self = {
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


package typingsSlinky.glReact.mod

import typingsSlinky.glReact.anon.GetGLSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurfaceContext extends js.Object {
  var glParent: Node | Surface[_] | Bus = js.native
  var glSizable: GetGLSize = js.native
  var glSurface: Surface[_] = js.native
}

object SurfaceContext {
  @scala.inline
  def apply(glParent: Node | Surface[_] | Bus, glSizable: GetGLSize, glSurface: Surface[_]): SurfaceContext = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSizable = glSizable.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceContext]
  }
  @scala.inline
  implicit class SurfaceContextOps[Self <: SurfaceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlParent(value: Node | Surface[_] | Bus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlSizable(value: GetGLSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glSizable")(value.asInstanceOf[js.Any])
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


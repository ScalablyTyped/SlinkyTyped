package typingsSlinky.glReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlSurface extends js.Object {
  var glParent: js.Any = js.native
  var glSurface: js.Any = js.native
}

object AnonGlSurface {
  @scala.inline
  def apply(glParent: js.Any, glSurface: js.Any): AnonGlSurface = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any], glSurface = glSurface.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlSurface]
  }
  @scala.inline
  implicit class AnonGlSurfaceOps[Self <: AnonGlSurface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGlSurface(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glSurface")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


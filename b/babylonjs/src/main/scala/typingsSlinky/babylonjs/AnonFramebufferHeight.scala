package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFramebufferHeight extends js.Object {
  var framebufferHeight: Double = js.native
  var framebufferWidth: Double = js.native
}

object AnonFramebufferHeight {
  @scala.inline
  def apply(framebufferHeight: Double, framebufferWidth: Double): AnonFramebufferHeight = {
    val __obj = js.Dynamic.literal(framebufferHeight = framebufferHeight.asInstanceOf[js.Any], framebufferWidth = framebufferWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFramebufferHeight]
  }
  @scala.inline
  implicit class AnonFramebufferHeightOps[Self <: AnonFramebufferHeight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFramebufferHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framebufferHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFramebufferWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framebufferWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


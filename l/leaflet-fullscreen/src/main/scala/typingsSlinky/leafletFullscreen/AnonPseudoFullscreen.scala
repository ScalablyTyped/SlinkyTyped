package typingsSlinky.leafletFullscreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPseudoFullscreen extends js.Object {
  var pseudoFullscreen: Boolean = js.native
}

object AnonPseudoFullscreen {
  @scala.inline
  def apply(pseudoFullscreen: Boolean): AnonPseudoFullscreen = {
    val __obj = js.Dynamic.literal(pseudoFullscreen = pseudoFullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPseudoFullscreen]
  }
  @scala.inline
  implicit class AnonPseudoFullscreenOps[Self <: AnonPseudoFullscreen] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPseudoFullscreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudoFullscreen")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


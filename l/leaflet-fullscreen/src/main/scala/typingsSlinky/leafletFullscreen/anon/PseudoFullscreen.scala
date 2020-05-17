package typingsSlinky.leafletFullscreen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PseudoFullscreen extends js.Object {
  var pseudoFullscreen: Boolean = js.native
}

object PseudoFullscreen {
  @scala.inline
  def apply(pseudoFullscreen: Boolean): PseudoFullscreen = {
    val __obj = js.Dynamic.literal(pseudoFullscreen = pseudoFullscreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoFullscreen]
  }
  @scala.inline
  implicit class PseudoFullscreenOps[Self <: PseudoFullscreen] (val x: Self) extends AnyVal {
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


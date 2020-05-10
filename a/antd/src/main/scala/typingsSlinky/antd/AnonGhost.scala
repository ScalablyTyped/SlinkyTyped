package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGhost extends js.Object {
  var ghost: Boolean = js.native
}

object AnonGhost {
  @scala.inline
  def apply(ghost: Boolean): AnonGhost = {
    val __obj = js.Dynamic.literal(ghost = ghost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGhost]
  }
  @scala.inline
  implicit class AnonGhostOps[Self <: AnonGhost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGhost(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ghost")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


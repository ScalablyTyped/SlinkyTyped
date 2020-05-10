package typingsSlinky.reactSelect

import typingsSlinky.reactSelect.menuMod.MenuState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetPortalPlacement extends js.Object {
  def getPortalPlacement(state: MenuState): Unit = js.native
}

object AnonGetPortalPlacement {
  @scala.inline
  def apply(getPortalPlacement: MenuState => Unit): AnonGetPortalPlacement = {
    val __obj = js.Dynamic.literal(getPortalPlacement = js.Any.fromFunction1(getPortalPlacement))
    __obj.asInstanceOf[AnonGetPortalPlacement]
  }
  @scala.inline
  implicit class AnonGetPortalPlacementOps[Self <: AnonGetPortalPlacement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPortalPlacement(value: MenuState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPortalPlacement")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


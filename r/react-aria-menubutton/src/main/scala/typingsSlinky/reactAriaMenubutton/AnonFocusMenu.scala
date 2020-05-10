package typingsSlinky.reactAriaMenubutton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFocusMenu extends js.Object {
  /**
  		 * If `true`, the menu's first item will receive focus when the
  		 * menu opens. Default: `false`.
  		 */
  var focusMenu: Boolean = js.native
}

object AnonFocusMenu {
  @scala.inline
  def apply(focusMenu: Boolean): AnonFocusMenu = {
    val __obj = js.Dynamic.literal(focusMenu = focusMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocusMenu]
  }
  @scala.inline
  implicit class AnonFocusMenuOps[Self <: AnonFocusMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusMenu")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


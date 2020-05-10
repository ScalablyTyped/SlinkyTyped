package typingsSlinky.leafletDraw.mod.Localization

import typingsSlinky.leafletDraw.AnonCancel
import typingsSlinky.leafletDraw.AnonEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditToolbar extends js.Object {
  var actions: AnonCancel = js.native
  var buttons: AnonEdit = js.native
}

object EditToolbar {
  @scala.inline
  def apply(actions: AnonCancel, buttons: AnonEdit): EditToolbar = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditToolbar]
  }
  @scala.inline
  implicit class EditToolbarOps[Self <: EditToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: AnonCancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: AnonEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.leafletDraw.mod.Localization

import typingsSlinky.leafletDraw.anon.Cancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditToolbar extends js.Object {
  var actions: Cancel = js.native
  var buttons: typingsSlinky.leafletDraw.anon.Edit = js.native
}

object EditToolbar {
  @scala.inline
  def apply(actions: Cancel, buttons: typingsSlinky.leafletDraw.anon.Edit): EditToolbar = {
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
    def withActions(value: Cancel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: typingsSlinky.leafletDraw.anon.Edit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


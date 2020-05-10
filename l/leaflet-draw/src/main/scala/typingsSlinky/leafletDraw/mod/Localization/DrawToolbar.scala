package typingsSlinky.leafletDraw.mod.Localization

import typingsSlinky.leafletDraw.AnonCircle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawToolbar extends js.Object {
  var actions: Action = js.native
  var buttons: AnonCircle = js.native
  var finish: Action = js.native
  var undo: Action = js.native
}

object DrawToolbar {
  @scala.inline
  def apply(actions: Action, buttons: AnonCircle, finish: Action, undo: Action): DrawToolbar = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawToolbar]
  }
  @scala.inline
  implicit class DrawToolbarOps[Self <: DrawToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtons(value: AnonCircle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinish(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndo(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


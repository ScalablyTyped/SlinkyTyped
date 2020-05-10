package typingsSlinky.leafletDraw

import typingsSlinky.leafletDraw.mod.Localization.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancel extends js.Object {
  var cancel: Action = js.native
  var clearAll: Action = js.native
  var save: Action = js.native
}

object AnonCancel {
  @scala.inline
  def apply(cancel: Action, clearAll: Action, save: Action): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], clearAll = clearAll.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
  @scala.inline
  implicit class AnonCancelOps[Self <: AnonCancel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearAll(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


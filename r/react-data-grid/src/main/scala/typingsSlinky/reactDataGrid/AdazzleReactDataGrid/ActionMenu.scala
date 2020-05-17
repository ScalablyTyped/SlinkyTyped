package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import typingsSlinky.reactDataGrid.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionMenu extends js.Object {
  var actions: js.Array[Callback] = js.native
  var icon: String = js.native
}

object ActionMenu {
  @scala.inline
  def apply(actions: js.Array[Callback], icon: String): ActionMenu = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMenu]
  }
  @scala.inline
  implicit class ActionMenuOps[Self <: ActionMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActions(value: js.Array[Callback]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


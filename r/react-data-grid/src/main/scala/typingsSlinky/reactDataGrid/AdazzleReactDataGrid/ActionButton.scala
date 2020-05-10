package typingsSlinky.reactDataGrid.AdazzleReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionButton extends js.Object {
  var icon: String = js.native
  def callback(): Unit = js.native
}

object ActionButton {
  @scala.inline
  def apply(callback: () => Unit, icon: String): ActionButton = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButton]
  }
  @scala.inline
  implicit class ActionButtonOps[Self <: ActionButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
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


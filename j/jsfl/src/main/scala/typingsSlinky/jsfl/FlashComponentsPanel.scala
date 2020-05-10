package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashComponentsPanel extends js.Object {
  def addItemToDocument(): js.Any = js.native
  def reload(): js.Any = js.native
}

object FlashComponentsPanel {
  @scala.inline
  def apply(addItemToDocument: () => js.Any, reload: () => js.Any): FlashComponentsPanel = {
    val __obj = js.Dynamic.literal(addItemToDocument = js.Any.fromFunction0(addItemToDocument), reload = js.Any.fromFunction0(reload))
    __obj.asInstanceOf[FlashComponentsPanel]
  }
  @scala.inline
  implicit class FlashComponentsPanelOps[Self <: FlashComponentsPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddItemToDocument(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addItemToDocument")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReload(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reload")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}


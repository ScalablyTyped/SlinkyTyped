package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.OlContextMenu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenu extends js.Object {
  val ContextMenu: OlContextMenu = js.native
}

object ContextMenu {
  @scala.inline
  def apply(ContextMenu: OlContextMenu): ContextMenu = {
    val __obj = js.Dynamic.literal(ContextMenu = ContextMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenu]
  }
  @scala.inline
  implicit class ContextMenuOps[Self <: ContextMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextMenu(value: OlContextMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenu extends js.Object {
  /** Defines the collection of context menu items
    * @Default {[]}
    */
  var items: js.UndefOr[js.Array[ContextMenuItem]] = js.native
  /** To set whether to display the default context menu items or not
    * @Default {false}
    */
  var showCustomMenuItemsOnly: js.UndefOr[Boolean] = js.native
}

object ContextMenu {
  @scala.inline
  def apply(): ContextMenu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenu]
  }
  @scala.inline
  implicit class ContextMenuOps[Self <: ContextMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[ContextMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCustomMenuItemsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomMenuItemsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCustomMenuItemsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCustomMenuItemsOnly")(js.undefined)
        ret
    }
  }
  
}


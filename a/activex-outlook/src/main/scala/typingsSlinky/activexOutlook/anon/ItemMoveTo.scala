package typingsSlinky.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemMoveTo extends js.Object {
  var Cancel: Boolean = js.native
  val Item: js.Any = js.native
  val MoveTo: typingsSlinky.activexOutlook.Outlook.Folder = js.native
}

object ItemMoveTo {
  @scala.inline
  def apply(Cancel: Boolean, Item: js.Any, MoveTo: typingsSlinky.activexOutlook.Outlook.Folder): ItemMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveTo]
  }
  @scala.inline
  implicit class ItemMoveToOps[Self <: ItemMoveTo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoveTo(value: typingsSlinky.activexOutlook.Outlook.Folder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoveTo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelItem extends js.Object {
  var Cancel: Boolean = js.native
  val Item: js.Any = js.native
}

object CancelItem {
  @scala.inline
  def apply(Cancel: Boolean, Item: js.Any): CancelItem = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelItem]
  }
  @scala.inline
  implicit class CancelItemOps[Self <: CancelItem] (val x: Self) extends AnyVal {
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
  }
  
}


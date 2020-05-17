package typingsSlinky.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemIndex extends js.Object {
  var itemIndex: Double = js.native
}

object ItemIndex {
  @scala.inline
  def apply(itemIndex: Double): ItemIndex = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemIndex]
  }
  @scala.inline
  implicit class ItemIndexOps[Self <: ItemIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyActiveItem extends js.Object {
  var copyActiveItem: js.UndefOr[Boolean] = js.native
  var items: js.UndefOr[js.Array[js.Object]] = js.native
}

object CopyActiveItem {
  @scala.inline
  def apply(): CopyActiveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyActiveItem]
  }
  @scala.inline
  implicit class CopyActiveItemOps[Self <: CopyActiveItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopyActiveItem(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyActiveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyActiveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyActiveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[js.Object]): Self = {
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
  }
  
}


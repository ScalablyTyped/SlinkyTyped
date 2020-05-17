package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemDataItemElement extends js.Object {
  var itemData: js.UndefOr[js.Any] = js.native
  var itemElement: js.UndefOr[dxElement] = js.native
}

object ItemDataItemElement {
  @scala.inline
  def apply(): ItemDataItemElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemDataItemElement]
  }
  @scala.inline
  implicit class ItemDataItemElementOps[Self <: ItemDataItemElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemData")(js.undefined)
        ret
    }
    @scala.inline
    def withItemElement(value: dxElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemElement")(js.undefined)
        ret
    }
  }
  
}


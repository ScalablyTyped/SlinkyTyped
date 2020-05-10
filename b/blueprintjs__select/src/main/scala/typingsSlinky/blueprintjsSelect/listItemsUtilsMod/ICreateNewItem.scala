package typingsSlinky.blueprintjsSelect.listItemsUtilsMod

import typingsSlinky.blueprintjsSelect.blueprintjsSelectStrings.`blueprint-create-new-item`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateNewItem extends js.Object {
  var __blueprintCreateNewItemBrand: `blueprint-create-new-item` = js.native
}

object ICreateNewItem {
  @scala.inline
  def apply(__blueprintCreateNewItemBrand: `blueprint-create-new-item`): ICreateNewItem = {
    val __obj = js.Dynamic.literal(__blueprintCreateNewItemBrand = __blueprintCreateNewItemBrand.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateNewItem]
  }
  @scala.inline
  implicit class ICreateNewItemOps[Self <: ICreateNewItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__blueprintCreateNewItemBrand(value: `blueprint-create-new-item`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__blueprintCreateNewItemBrand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.officeUiFabricReact.dropdownControlledMultiExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownControlledMultiExampleState extends js.Object {
  var selectedItems: js.Array[String] = js.native
}

object IDropdownControlledMultiExampleState {
  @scala.inline
  def apply(selectedItems: js.Array[String]): IDropdownControlledMultiExampleState = {
    val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownControlledMultiExampleState]
  }
  @scala.inline
  implicit class IDropdownControlledMultiExampleStateOps[Self <: IDropdownControlledMultiExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedItems(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


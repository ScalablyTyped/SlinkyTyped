package typingsSlinky.officeUiFabricReact.dropdownControlledExampleMod

import typingsSlinky.officeUiFabricReact.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownControlledExampleState extends js.Object {
  var selectedItem: js.UndefOr[Key] = js.native
}

object IDropdownControlledExampleState {
  @scala.inline
  def apply(): IDropdownControlledExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownControlledExampleState]
  }
  @scala.inline
  implicit class IDropdownControlledExampleStateOps[Self <: IDropdownControlledExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedItem(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItem")(js.undefined)
        ret
    }
  }
  
}


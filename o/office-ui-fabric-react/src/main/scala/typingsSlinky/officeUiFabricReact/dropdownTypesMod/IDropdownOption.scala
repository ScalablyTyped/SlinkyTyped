package typingsSlinky.officeUiFabricReact.dropdownTypesMod

import typingsSlinky.officeUiFabricReact.selectableOptionTypesMod.ISelectableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownOption extends ISelectableOption {
  /**
    * Deprecated at v.65.1, use `selected` instead.
    * @deprecated Use `selected` instead.
    */
  var isSelected: js.UndefOr[Boolean] = js.native
}

object IDropdownOption {
  @scala.inline
  def apply(key: String | Double, text: String): IDropdownOption = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownOption]
  }
  @scala.inline
  implicit class IDropdownOptionOps[Self <: IDropdownOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(js.undefined)
        ret
    }
  }
  
}


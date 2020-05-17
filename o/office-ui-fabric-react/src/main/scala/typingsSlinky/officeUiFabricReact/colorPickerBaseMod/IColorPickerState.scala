package typingsSlinky.officeUiFabricReact.colorPickerBaseMod

import typingsSlinky.officeUiFabricReact.anon.Component
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPickerState extends js.Object {
  var color: IColor = js.native
  var editingColor: js.UndefOr[Component] = js.native
}

object IColorPickerState {
  @scala.inline
  def apply(color: IColor): IColorPickerState = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorPickerState]
  }
  @scala.inline
  implicit class IColorPickerStateOps[Self <: IColorPickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: IColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditingColor(value: Component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editingColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditingColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editingColor")(js.undefined)
        ret
    }
  }
  
}


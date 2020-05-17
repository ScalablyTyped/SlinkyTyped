package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base.IColorPickerState> */
@js.native
trait ReadonlyIColorPickerState extends js.Object {
  val color: IColor = js.native
  val editingColor: js.UndefOr[Component] = js.native
}

object ReadonlyIColorPickerState {
  @scala.inline
  def apply(color: IColor): ReadonlyIColorPickerState = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIColorPickerState]
  }
  @scala.inline
  implicit class ReadonlyIColorPickerStateOps[Self <: ReadonlyIColorPickerState] (val x: Self) extends AnyVal {
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


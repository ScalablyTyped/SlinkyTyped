package typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPickerGridCellStyles extends js.Object {
  /**
    * Style to apply to a colorCell in the color picker.
    */
  var colorCell: IStyle = js.native
  /**
    * Style to apply to the svg element that renders the color.
    */
  var svg: IStyle = js.native
}

object IColorPickerGridCellStyles {
  @scala.inline
  def apply(): IColorPickerGridCellStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorPickerGridCellStyles]
  }
  @scala.inline
  implicit class IColorPickerGridCellStylesOps[Self <: IColorPickerGridCellStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorCell(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCell")(js.undefined)
        ret
    }
    @scala.inline
    def withColorCellNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCell")(null)
        ret
    }
    @scala.inline
    def withSvg(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(null)
        ret
    }
  }
  
}


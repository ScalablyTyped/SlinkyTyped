package typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISwatchColorPickerStyles extends js.Object {
  /**
    * Style for the FocusZone container for the grid.
    */
  var focusedContainer: js.UndefOr[IStyle] = js.native
  /**
    * Style applied to the container grid.
    */
  var root: IStyle = js.native
  /**
    * Style for the table cells of the grid.
    */
  var tableCell: IStyle = js.native
}

object ISwatchColorPickerStyles {
  @scala.inline
  def apply(): ISwatchColorPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISwatchColorPickerStyles]
  }
  @scala.inline
  implicit class ISwatchColorPickerStylesOps[Self <: ISwatchColorPickerStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFocusedContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusedContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusedContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusedContainer")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withTableCell(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCell")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCellNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCell")(null)
        ret
    }
  }
  
}


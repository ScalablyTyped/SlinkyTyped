package typingsSlinky.officeUiFabricReact.colorPickerTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColorPickerStyles extends js.Object {
  /**
    * Style set for the panel element that contains the color rectangle
    */
  var colorRectangle: js.UndefOr[IStyle] = js.native
  /**
    * Color Square
    */
  var colorSquare: js.UndefOr[IStyle] = js.native
  /**
    * flexContainer
    */
  var flexContainer: js.UndefOr[IStyle] = js.native
  /**
    * flexPreviewBox
    */
  var flexPreviewBox: js.UndefOr[IStyle] = js.native
  /**
    * flexSlider
    */
  var flexSlider: js.UndefOr[IStyle] = js.native
  /**
    * Style set for each text field input.
    */
  var input: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the panel element that contains the color rectangle, color sliders and inputs .
    */
  var panel: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the table element that contains the color sliders and inputs.
    */
  var table: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the table header that contains the labels.
    */
  var tableHeader: js.UndefOr[IStyle] = js.native
  /**
    * Style set for the table cell that contains the hex label.
    */
  var tableHexCell: js.UndefOr[IStyle] = js.native
}

object IColorPickerStyles {
  @scala.inline
  def apply(): IColorPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorPickerStyles]
  }
  @scala.inline
  implicit class IColorPickerStylesOps[Self <: IColorPickerStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorRectangle(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRectangle")(js.undefined)
        ret
    }
    @scala.inline
    def withColorRectangleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorRectangle")(null)
        ret
    }
    @scala.inline
    def withColorSquare(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSquare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorSquare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSquare")(js.undefined)
        ret
    }
    @scala.inline
    def withColorSquareNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorSquare")(null)
        ret
    }
    @scala.inline
    def withFlexContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexContainer")(null)
        ret
    }
    @scala.inline
    def withFlexPreviewBox(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexPreviewBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexPreviewBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexPreviewBox")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexPreviewBoxNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexPreviewBox")(null)
        ret
    }
    @scala.inline
    def withFlexSlider(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexSlider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlexSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexSlider")(js.undefined)
        ret
    }
    @scala.inline
    def withFlexSliderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flexSlider")(null)
        ret
    }
    @scala.inline
    def withInput(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withInputNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(null)
        ret
    }
    @scala.inline
    def withPanel(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(null)
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
    def withTable(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(js.undefined)
        ret
    }
    @scala.inline
    def withTableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(null)
        ret
    }
    @scala.inline
    def withTableHeader(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeader")(null)
        ret
    }
    @scala.inline
    def withTableHexCell(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHexCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableHexCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHexCell")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHexCellNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHexCell")(null)
        ret
    }
  }
  
}


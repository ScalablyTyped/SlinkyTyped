package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ArrowheadLength
import typingsSlinky.officeJsPreview.Excel.ArrowheadStyle
import typingsSlinky.officeJsPreview.Excel.ArrowheadWidth
import typingsSlinky.officeJsPreview.Excel.ConnectorType
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Curve
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Diamond
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Elbow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Long
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Medium
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Narrow
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Open
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Oval
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Short
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Stealth
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Straight
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Triangle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Wide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Line object, for use in `line.set({ ... })`. */
@js.native
trait LineUpdateData extends js.Object {
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.native
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.native
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.native
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[ConnectorType | Straight | Elbow | Curve] = js.native
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[ArrowheadLength | Short | Medium | Long] = js.native
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open] = js.native
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[ArrowheadWidth | Narrow | Medium | Wide] = js.native
}

object LineUpdateData {
  @scala.inline
  def apply(): LineUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineUpdateData]
  }
  @scala.inline
  implicit class LineUpdateDataOps[Self <: LineUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginArrowheadLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadLength")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginArrowheadStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginArrowheadWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginArrowheadWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectorType(value: ConnectorType | Straight | Elbow | Curve): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectorType")(js.undefined)
        ret
    }
    @scala.inline
    def withEndArrowheadLength(value: ArrowheadLength | Short | Medium | Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndArrowheadLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadLength")(js.undefined)
        ret
    }
    @scala.inline
    def withEndArrowheadStyle(value: ArrowheadStyle | None | Triangle | Stealth | Diamond | Oval | Open): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndArrowheadStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withEndArrowheadWidth(value: ArrowheadWidth | Narrow | Medium | Wide): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndArrowheadWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endArrowheadWidth")(js.undefined)
        ret
    }
  }
  
}


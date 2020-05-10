package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ArrowheadLength
import typingsSlinky.officeJs.Excel.ArrowheadStyle
import typingsSlinky.officeJs.Excel.ArrowheadWidth
import typingsSlinky.officeJs.Excel.ConnectorType
import typingsSlinky.officeJs.officeJsStrings.Curve
import typingsSlinky.officeJs.officeJsStrings.Diamond
import typingsSlinky.officeJs.officeJsStrings.Elbow
import typingsSlinky.officeJs.officeJsStrings.Long
import typingsSlinky.officeJs.officeJsStrings.Medium
import typingsSlinky.officeJs.officeJsStrings.Narrow
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.Open
import typingsSlinky.officeJs.officeJsStrings.Oval
import typingsSlinky.officeJs.officeJsStrings.Short
import typingsSlinky.officeJs.officeJsStrings.Stealth
import typingsSlinky.officeJs.officeJsStrings.Straight
import typingsSlinky.officeJs.officeJsStrings.Triangle
import typingsSlinky.officeJs.officeJsStrings.Wide
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


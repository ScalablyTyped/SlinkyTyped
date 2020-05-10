package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartGridlines.toJSON()`. */
@js.native
trait ChartGridlinesData extends js.Object {
  /**
    *
    * Represents the formatting of chart gridlines. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartGridlinesFormatData] = js.native
  /**
    *
    * Boolean value representing if the axis gridlines are visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ChartGridlinesData {
  @scala.inline
  def apply(): ChartGridlinesData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlinesData]
  }
  @scala.inline
  implicit class ChartGridlinesDataOps[Self <: ChartGridlinesData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: ChartGridlinesFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ChartErrorBarsInclude
import typingsSlinky.officeJs.Excel.ChartErrorBarsType
import typingsSlinky.officeJs.officeJsStrings.Both
import typingsSlinky.officeJs.officeJsStrings.Custom
import typingsSlinky.officeJs.officeJsStrings.FixedValue
import typingsSlinky.officeJs.officeJsStrings.MinusValues
import typingsSlinky.officeJs.officeJsStrings.Percent
import typingsSlinky.officeJs.officeJsStrings.PlusValues
import typingsSlinky.officeJs.officeJsStrings.StDev
import typingsSlinky.officeJs.officeJsStrings.StError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartErrorBars.toJSON()`. */
@js.native
trait ChartErrorBarsData extends js.Object {
  /**
    *
    * Specifies whether or not the error bars have an end style cap.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endStyleCap: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the formatting type of the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var format: js.UndefOr[ChartErrorBarsFormatData] = js.native
  /**
    *
    * Specifies which parts of the error bars to include.
    *
    * [Api set: ExcelApi 1.9]
    */
  var include: js.UndefOr[ChartErrorBarsInclude | Both | MinusValues | PlusValues] = js.native
  /**
    *
    * The type of range marked by the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: js.UndefOr[ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom] = js.native
  /**
    *
    * Specifies whether or not the error bars are displayed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object ChartErrorBarsData {
  @scala.inline
  def apply(): ChartErrorBarsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartErrorBarsData]
  }
  @scala.inline
  implicit class ChartErrorBarsDataOps[Self <: ChartErrorBarsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndStyleCap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endStyleCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndStyleCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endStyleCap")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: ChartErrorBarsFormatData): Self = {
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
    def withInclude(value: ChartErrorBarsInclude | Both | MinusValues | PlusValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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


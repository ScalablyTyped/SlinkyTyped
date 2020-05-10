package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ConditionalDataBarAxisFormat
import typingsSlinky.officeJs.Excel.ConditionalDataBarDirection
import typingsSlinky.officeJs.Excel.ConditionalDataBarRule
import typingsSlinky.officeJs.officeJsStrings.Automatic
import typingsSlinky.officeJs.officeJsStrings.CellMidPoint
import typingsSlinky.officeJs.officeJsStrings.Context
import typingsSlinky.officeJs.officeJsStrings.LeftToRight
import typingsSlinky.officeJs.officeJsStrings.None
import typingsSlinky.officeJs.officeJsStrings.RightToLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DataBarConditionalFormat object, for use in `dataBarConditionalFormat.set({ ... })`. */
@js.native
trait DataBarConditionalFormatUpdateData extends js.Object {
  /**
    *
    * HTML color code representing the color of the Axis line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    "" (empty string) if no axis is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisColor: js.UndefOr[String] = js.native
  /**
    *
    * Representation of how the axis is determined for an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisFormat: js.UndefOr[ConditionalDataBarAxisFormat | Automatic | None | CellMidPoint] = js.native
  /**
    *
    * Represents the direction that the data bar graphic should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var barDirection: js.UndefOr[ConditionalDataBarDirection | Context | LeftToRight | RightToLeft] = js.native
  /**
    *
    * The rule for what consistutes the lower bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.lowerBoundRule = {...}` instead of `x.lowerBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var lowerBoundRule: js.UndefOr[ConditionalDataBarRule] = js.native
  /**
    *
    * Representation of all values to the left of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var negativeFormat: js.UndefOr[ConditionalDataBarNegativeFormatUpdateData] = js.native
  /**
    *
    * Representation of all values to the right of the axis in an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var positiveFormat: js.UndefOr[ConditionalDataBarPositiveFormatUpdateData] = js.native
  /**
    *
    * If true, hides the values from the cells where the data bar is applied.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showDataBarOnly: js.UndefOr[Boolean] = js.native
  /**
    *
    * The rule for what constitutes the upper bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.upperBoundRule = {...}` instead of `x.upperBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var upperBoundRule: js.UndefOr[ConditionalDataBarRule] = js.native
}

object DataBarConditionalFormatUpdateData {
  @scala.inline
  def apply(): DataBarConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataBarConditionalFormatUpdateData]
  }
  @scala.inline
  implicit class DataBarConditionalFormatUpdateDataOps[Self <: DataBarConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisColor")(js.undefined)
        ret
    }
    @scala.inline
    def withAxisFormat(value: ConditionalDataBarAxisFormat | Automatic | None | CellMidPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxisFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axisFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withBarDirection(value: ConditionalDataBarDirection | Context | LeftToRight | RightToLeft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBarDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerBoundRule(value: ConditionalDataBarRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBoundRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerBoundRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBoundRule")(js.undefined)
        ret
    }
    @scala.inline
    def withNegativeFormat(value: ConditionalDataBarNegativeFormatUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNegativeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negativeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPositiveFormat(value: ConditionalDataBarPositiveFormatUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositiveFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positiveFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDataBarOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataBarOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDataBarOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDataBarOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withUpperBoundRule(value: ConditionalDataBarRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBoundRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpperBoundRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBoundRule")(js.undefined)
        ret
    }
  }
  
}


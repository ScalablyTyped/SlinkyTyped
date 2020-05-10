package typingsSlinky.officeJs.Excel.Interfaces

import typingsSlinky.officeJs.Excel.ConditionalFormatType
import typingsSlinky.officeJs.officeJsStrings.CellValue
import typingsSlinky.officeJs.officeJsStrings.ColorScale
import typingsSlinky.officeJs.officeJsStrings.ContainsText
import typingsSlinky.officeJs.officeJsStrings.Custom
import typingsSlinky.officeJs.officeJsStrings.DataBar
import typingsSlinky.officeJs.officeJsStrings.IconSet
import typingsSlinky.officeJs.officeJsStrings.PresetCriteria
import typingsSlinky.officeJs.officeJsStrings.TopBottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `conditionalFormat.toJSON()`. */
@js.native
trait ConditionalFormatData extends js.Object {
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValue: js.UndefOr[CellValueConditionalFormatData] = js.native
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValueOrNullObject: js.UndefOr[CellValueConditionalFormatData] = js.native
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScale: js.UndefOr[ColorScaleConditionalFormatData] = js.native
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScaleOrNullObject: js.UndefOr[ColorScaleConditionalFormatData] = js.native
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var custom: js.UndefOr[CustomConditionalFormatData] = js.native
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var customOrNullObject: js.UndefOr[CustomConditionalFormatData] = js.native
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBar: js.UndefOr[DataBarConditionalFormatData] = js.native
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBarOrNullObject: js.UndefOr[DataBarConditionalFormatData] = js.native
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSet: js.UndefOr[IconSetConditionalFormatData] = js.native
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSetOrNullObject: js.UndefOr[IconSetConditionalFormatData] = js.native
  /**
    *
    * The Priority of the Conditional Format within the current ConditionalFormatCollection. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var preset: js.UndefOr[PresetCriteriaConditionalFormatData] = js.native
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var presetOrNullObject: js.UndefOr[PresetCriteriaConditionalFormatData] = js.native
  /**
    *
    * The priority (or index) within the conditional format collection that this conditional format currently exists in. Changing this also
    changes other conditional formats' priorities, to allow for a contiguous priority order.
    Use a negative priority to begin from the back.
    Priorities greater than than bounds will get and set to the maximum (or minimum if negative) priority.
    Also note that if you change the priority, you have to re-fetch a new copy of the object at that new priority location if you want to make further changes to it. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    *
    * If the conditions of this conditional format are met, no lower-priority formats shall take effect on that cell.
    Null on databars, icon sets, and colorscales as there's no concept of StopIfTrue for these
    *
    * [Api set: ExcelApi 1.6]
    */
  var stopIfTrue: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text". Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparison: js.UndefOr[TextConditionalFormatData] = js.native
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text". Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparisonOrNullObject: js.UndefOr[TextConditionalFormatData] = js.native
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottom: js.UndefOr[TopBottomConditionalFormatData] = js.native
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottomOrNullObject: js.UndefOr[TopBottomConditionalFormatData] = js.native
  /**
    *
    * A type of conditional format. Only one can be set at a time. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var `type`: js.UndefOr[
    ConditionalFormatType | Custom | DataBar | ColorScale | IconSet | TopBottom | PresetCriteria | ContainsText | CellValue
  ] = js.native
}

object ConditionalFormatData {
  @scala.inline
  def apply(): ConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatData]
  }
  @scala.inline
  implicit class ConditionalFormatDataOps[Self <: ConditionalFormatData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellValue(value: CellValueConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValue")(js.undefined)
        ret
    }
    @scala.inline
    def withCellValueOrNullObject(value: CellValueConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValueOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellValueOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellValueOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withColorScale(value: ColorScaleConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScale")(js.undefined)
        ret
    }
    @scala.inline
    def withColorScaleOrNullObject(value: ColorScaleConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScaleOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorScaleOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorScaleOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: CustomConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomOrNullObject(value: CustomConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBar(value: DataBarConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBar")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBarOrNullObject(value: DataBarConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBarOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBarOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBarOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSet(value: IconSetConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSet")(js.undefined)
        ret
    }
    @scala.inline
    def withIconSetOrNullObject(value: IconSetConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSetOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconSetOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconSetOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPreset(value: PresetCriteriaConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(js.undefined)
        ret
    }
    @scala.inline
    def withPresetOrNullObject(value: PresetCriteriaConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presetOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresetOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presetOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withStopIfTrue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopIfTrue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopIfTrue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopIfTrue")(js.undefined)
        ret
    }
    @scala.inline
    def withTextComparison(value: TextConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComparison")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextComparison: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComparison")(js.undefined)
        ret
    }
    @scala.inline
    def withTextComparisonOrNullObject(value: TextConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComparisonOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextComparisonOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textComparisonOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withTopBottom(value: TopBottomConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withTopBottomOrNullObject(value: TopBottomConditionalFormatData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBottomOrNullObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopBottomOrNullObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topBottomOrNullObject")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: ConditionalFormatType | Custom | DataBar | ColorScale | IconSet | TopBottom | PresetCriteria | ContainsText | CellValue
    ): Self = {
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
  }
  
}


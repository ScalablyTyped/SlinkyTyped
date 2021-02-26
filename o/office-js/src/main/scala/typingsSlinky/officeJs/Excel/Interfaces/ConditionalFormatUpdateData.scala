package typingsSlinky.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalFormat object, for use in `conditionalFormat.set({ ... })`. */
@js.native
trait ConditionalFormatUpdateData extends StObject {
  
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValue: js.UndefOr[CellValueConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the cell value conditional format properties if the current conditional format is a CellValue type.
    For example to format all cells between 5 and 10.
    *
    * [Api set: ExcelApi 1.6]
    */
  var cellValueOrNullObject: js.UndefOr[CellValueConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScale: js.UndefOr[ColorScaleConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the ColorScale conditional format properties if the current conditional format is an ColorScale type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var colorScaleOrNullObject: js.UndefOr[ColorScaleConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var custom: js.UndefOr[CustomConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the custom conditional format properties if the current conditional format is a custom type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var customOrNullObject: js.UndefOr[CustomConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBar: js.UndefOr[DataBarConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the data bar properties if the current conditional format is a data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var dataBarOrNullObject: js.UndefOr[DataBarConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSet: js.UndefOr[IconSetConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the IconSet conditional format properties if the current conditional format is an IconSet type.
    *
    * [Api set: ExcelApi 1.6]
    */
  var iconSetOrNullObject: js.UndefOr[IconSetConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var preset: js.UndefOr[PresetCriteriaConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the preset criteria conditional format. See Excel.PresetCriteriaConditionalFormat for more details.
    *
    * [Api set: ExcelApi 1.6]
    */
  var presetOrNullObject: js.UndefOr[PresetCriteriaConditionalFormatUpdateData] = js.native
  
  /**
    *
    * The priority (or index) within the conditional format collection that this conditional format currently exists in. Changing this also
    changes other conditional formats' priorities, to allow for a contiguous priority order.
    Use a negative priority to begin from the back.
    Priorities greater than than bounds will get and set to the maximum (or minimum if negative) priority.
    Also note that if you change the priority, you have to re-fetch a new copy of the object at that new priority location if you want to make further changes to it.
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
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparison: js.UndefOr[TextConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the specific text conditional format properties if the current conditional format is a text type.
    For example to format cells matching the word "Text".
    *
    * [Api set: ExcelApi 1.6]
    */
  var textComparisonOrNullObject: js.UndefOr[TextConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottom: js.UndefOr[TopBottomConditionalFormatUpdateData] = js.native
  
  /**
    *
    * Returns the Top/Bottom conditional format properties if the current conditional format is an TopBottom type.
    For example to format the top 10% or bottom 10 items.
    *
    * [Api set: ExcelApi 1.6]
    */
  var topBottomOrNullObject: js.UndefOr[TopBottomConditionalFormatUpdateData] = js.native
}
object ConditionalFormatUpdateData {
  
  @scala.inline
  def apply(): ConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormatUpdateData]
  }
  
  @scala.inline
  implicit class ConditionalFormatUpdateDataMutableBuilder[Self <: ConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellValue(value: CellValueConditionalFormatUpdateData): Self = StObject.set(x, "cellValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellValueOrNullObject(value: CellValueConditionalFormatUpdateData): Self = StObject.set(x, "cellValueOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellValueOrNullObjectUndefined: Self = StObject.set(x, "cellValueOrNullObject", js.undefined)
    
    @scala.inline
    def setCellValueUndefined: Self = StObject.set(x, "cellValue", js.undefined)
    
    @scala.inline
    def setColorScale(value: ColorScaleConditionalFormatUpdateData): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScaleOrNullObject(value: ColorScaleConditionalFormatUpdateData): Self = StObject.set(x, "colorScaleOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScaleOrNullObjectUndefined: Self = StObject.set(x, "colorScaleOrNullObject", js.undefined)
    
    @scala.inline
    def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
    
    @scala.inline
    def setCustom(value: CustomConditionalFormatUpdateData): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomOrNullObject(value: CustomConditionalFormatUpdateData): Self = StObject.set(x, "customOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomOrNullObjectUndefined: Self = StObject.set(x, "customOrNullObject", js.undefined)
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setDataBar(value: DataBarConditionalFormatUpdateData): Self = StObject.set(x, "dataBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBarOrNullObject(value: DataBarConditionalFormatUpdateData): Self = StObject.set(x, "dataBarOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBarOrNullObjectUndefined: Self = StObject.set(x, "dataBarOrNullObject", js.undefined)
    
    @scala.inline
    def setDataBarUndefined: Self = StObject.set(x, "dataBar", js.undefined)
    
    @scala.inline
    def setIconSet(value: IconSetConditionalFormatUpdateData): Self = StObject.set(x, "iconSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSetOrNullObject(value: IconSetConditionalFormatUpdateData): Self = StObject.set(x, "iconSetOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconSetOrNullObjectUndefined: Self = StObject.set(x, "iconSetOrNullObject", js.undefined)
    
    @scala.inline
    def setIconSetUndefined: Self = StObject.set(x, "iconSet", js.undefined)
    
    @scala.inline
    def setPreset(value: PresetCriteriaConditionalFormatUpdateData): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetOrNullObject(value: PresetCriteriaConditionalFormatUpdateData): Self = StObject.set(x, "presetOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetOrNullObjectUndefined: Self = StObject.set(x, "presetOrNullObject", js.undefined)
    
    @scala.inline
    def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setStopIfTrue(value: Boolean): Self = StObject.set(x, "stopIfTrue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopIfTrueUndefined: Self = StObject.set(x, "stopIfTrue", js.undefined)
    
    @scala.inline
    def setTextComparison(value: TextConditionalFormatUpdateData): Self = StObject.set(x, "textComparison", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextComparisonOrNullObject(value: TextConditionalFormatUpdateData): Self = StObject.set(x, "textComparisonOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextComparisonOrNullObjectUndefined: Self = StObject.set(x, "textComparisonOrNullObject", js.undefined)
    
    @scala.inline
    def setTextComparisonUndefined: Self = StObject.set(x, "textComparison", js.undefined)
    
    @scala.inline
    def setTopBottom(value: TopBottomConditionalFormatUpdateData): Self = StObject.set(x, "topBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBottomOrNullObject(value: TopBottomConditionalFormatUpdateData): Self = StObject.set(x, "topBottomOrNullObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBottomOrNullObjectUndefined: Self = StObject.set(x, "topBottomOrNullObject", js.undefined)
    
    @scala.inline
    def setTopBottomUndefined: Self = StObject.set(x, "topBottom", js.undefined)
  }
}

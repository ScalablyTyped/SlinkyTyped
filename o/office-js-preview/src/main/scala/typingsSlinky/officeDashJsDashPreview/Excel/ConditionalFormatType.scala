package typingsSlinky.officeDashJsDashPreview.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConditionalFormatType extends js.Object

/**
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.ConditionalFormatType")
@js.native
object ConditionalFormatType extends js.Object {
  @js.native
  sealed trait cellValue extends ConditionalFormatType
  
  @js.native
  sealed trait colorScale extends ConditionalFormatType
  
  @js.native
  sealed trait containsText extends ConditionalFormatType
  
  @js.native
  sealed trait custom extends ConditionalFormatType
  
  @js.native
  sealed trait dataBar extends ConditionalFormatType
  
  @js.native
  sealed trait iconSet extends ConditionalFormatType
  
  @js.native
  sealed trait presetCriteria extends ConditionalFormatType
  
  @js.native
  sealed trait topBottom extends ConditionalFormatType
  
  /* "CellValue" */ val cellValue: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatType.cellValue with String = js.native
  /* "ColorScale" */ val colorScale: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatType.colorScale with String = js.native
  /* "ContainsText" */ val containsText: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatType.containsText with String = js.native
  /* "Custom" */ val custom: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatType.custom with String = js.native
  /* "DataBar" */ val dataBar: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatType.dataBar with String = js.native
  /* "IconSet" */ val iconSet: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatType.iconSet with String = js.native
  /* "PresetCriteria" */ val presetCriteria: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatType.presetCriteria with String = js.native
  /* "TopBottom" */ val topBottom: typingsSlinky.officeDashJsDashPreview.Excel.ConditionalFormatType.topBottom with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ConditionalFormatType with String] = js.native
}


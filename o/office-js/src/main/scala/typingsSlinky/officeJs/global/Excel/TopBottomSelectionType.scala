package typingsSlinky.officeJs.global.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A simple enum for Top/Bottom filters to select whether to filter by the top N or bottom N percent, number, or sum of values.
  *
  * [Api set: ExcelApi 1.12]
  */
@JSGlobal("Excel.TopBottomSelectionType")
@js.native
object TopBottomSelectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsSlinky.officeJs.Excel.TopBottomSelectionType with String] = js.native
  
  /* "Items" */ val items: typingsSlinky.officeJs.Excel.TopBottomSelectionType.items with String = js.native
  
  /* "Percent" */ val percent: typingsSlinky.officeJs.Excel.TopBottomSelectionType.percent with String = js.native
  
  /* "Sum" */ val sum: typingsSlinky.officeJs.Excel.TopBottomSelectionType.sum with String = js.native
}

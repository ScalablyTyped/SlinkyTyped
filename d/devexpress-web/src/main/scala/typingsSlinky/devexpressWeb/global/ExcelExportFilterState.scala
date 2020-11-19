package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values that specify the filter state&amp;#39;s location in the exported Excel file.
  */
@JSGlobal("ExcelExportFilterState")
@js.native
class ExcelExportFilterState ()
  extends typingsSlinky.devexpressWeb.ExcelExportFilterState
/* static members */
@JSGlobal("ExcelExportFilterState")
@js.native
object ExcelExportFilterState extends js.Object {
  
  /**
    * The filter state is placed below in the exported document.
    */
  val below: String = js.native
  
  /**
    * The filter state is not included in the exported document.
    */
  val none: String = js.native
  
  /**
    * The filter state is placed on a separate sheet in the exported workbook.
    */
  val separatePage: String = js.native
}

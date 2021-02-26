package typingsSlinky.agGrid.iExcelCreatorMod

import typingsSlinky.agGrid.exportParamsMod.ExportParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExcelExportParams
  extends ExportParams[js.Array[js.Array[ExcelCell]]] {
  
  var sheetName: js.UndefOr[String] = js.native
  
  var suppressTextAsCDATA: js.UndefOr[Boolean] = js.native
}
object ExcelExportParams {
  
  @scala.inline
  def apply(): ExcelExportParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcelExportParams]
  }
  
  @scala.inline
  implicit class ExcelExportParamsMutableBuilder[Self <: ExcelExportParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
    
    @scala.inline
    def setSuppressTextAsCDATA(value: Boolean): Self = StObject.set(x, "suppressTextAsCDATA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressTextAsCDATAUndefined: Self = StObject.set(x, "suppressTextAsCDATA", js.undefined)
  }
}

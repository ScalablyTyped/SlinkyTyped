package typingsSlinky.googleAdwordsScripts

import typingsSlinky.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Reports
@js.native
trait AdWordsReport extends StObject {
  
  def exportToSheet(sheet: Sheet): Unit = js.native
  
  def getColumnHeader(awqlColumnName: String): AdWordsReportColumnHeader = js.native
  
  def rows(): AdWordsReportRowIterator = js.native
}
object AdWordsReport {
  
  @scala.inline
  def apply(
    exportToSheet: Sheet => Unit,
    getColumnHeader: String => AdWordsReportColumnHeader,
    rows: () => AdWordsReportRowIterator
  ): AdWordsReport = {
    val __obj = js.Dynamic.literal(exportToSheet = js.Any.fromFunction1(exportToSheet), getColumnHeader = js.Any.fromFunction1(getColumnHeader), rows = js.Any.fromFunction0(rows))
    __obj.asInstanceOf[AdWordsReport]
  }
  
  @scala.inline
  implicit class AdWordsReportMutableBuilder[Self <: AdWordsReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportToSheet(value: Sheet => Unit): Self = StObject.set(x, "exportToSheet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetColumnHeader(value: String => AdWordsReportColumnHeader): Self = StObject.set(x, "getColumnHeader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRows(value: () => AdWordsReportRowIterator): Self = StObject.set(x, "rows", js.Any.fromFunction0(value))
  }
}

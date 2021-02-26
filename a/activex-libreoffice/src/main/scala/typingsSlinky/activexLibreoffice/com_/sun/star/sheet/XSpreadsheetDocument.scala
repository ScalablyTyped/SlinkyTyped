package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a collection of spreadsheets.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
@js.native
trait XSpreadsheetDocument extends XInterface {
  
  /**
    * returns the collection of sheets in the document.
    * @see com.sun.star.sheet.Spreadsheets
    */
  val Sheets: XSpreadsheets = js.native
  
  /**
    * returns the collection of sheets in the document.
    * @see com.sun.star.sheet.Spreadsheets
    */
  def getSheets(): XSpreadsheets = js.native
}
object XSpreadsheetDocument {
  
  @scala.inline
  def apply(
    Sheets: XSpreadsheets,
    acquire: () => Unit,
    getSheets: () => XSpreadsheets,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSpreadsheetDocument = {
    val __obj = js.Dynamic.literal(Sheets = Sheets.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSheets = js.Any.fromFunction0(getSheets), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSpreadsheetDocument]
  }
  
  @scala.inline
  implicit class XSpreadsheetDocumentMutableBuilder[Self <: XSpreadsheetDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetSheets(value: () => XSpreadsheets): Self = StObject.set(x, "getSheets", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSheets(value: XSpreadsheets): Self = StObject.set(x, "Sheets", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * extends {@link XSpreadsheets} interface to import external sheets.
  * @see com.sun.star.sheet.Spreadsheets
  */
@js.native
trait XSpreadsheets2 extends XSpreadsheets {
  
  /**
    * copies a sheet from a source document.
    * @param srcDoc a valid {@link XSpreadsheetDocument} reference to source doc
    * @param srcName the source sheet name. Throw IllegalArgumentException if not valid
    * @param nDestPosition the destination sheet position. Throw IndexOutOfBoundsException if not valid
    * @returns the position of the imported sheet
    * @since LibreOffice 3.5
    * @throws com::sun::star::lang::IllegalArgumentException
    * @throws com::sun::star::lang::IndexOutOfBoundsException
    */
  def importSheet(srcDoc: XSpreadsheetDocument, srcName: String, nDestPosition: Double): Double = js.native
}
object XSpreadsheets2 {
  
  @scala.inline
  def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    copyByName: (String, String, Double) => Unit,
    getByName: String => js.Any,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    importSheet: (XSpreadsheetDocument, String, Double) => Double,
    insertByName: (String, js.Any) => Unit,
    insertNewByName: (String, Double) => Unit,
    moveByName: (String, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeByName: String => Unit,
    replaceByName: (String, js.Any) => Unit
  ): XSpreadsheets2 = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), copyByName = js.Any.fromFunction3(copyByName), getByName = js.Any.fromFunction1(getByName), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), importSheet = js.Any.fromFunction3(importSheet), insertByName = js.Any.fromFunction2(insertByName), insertNewByName = js.Any.fromFunction2(insertNewByName), moveByName = js.Any.fromFunction2(moveByName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeByName = js.Any.fromFunction1(removeByName), replaceByName = js.Any.fromFunction2(replaceByName))
    __obj.asInstanceOf[XSpreadsheets2]
  }
  
  @scala.inline
  implicit class XSpreadsheets2Ops[Self <: XSpreadsheets2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setImportSheet(value: (XSpreadsheetDocument, String, Double) => Double): Self = this.set("importSheet", js.Any.fromFunction3(value))
  }
}

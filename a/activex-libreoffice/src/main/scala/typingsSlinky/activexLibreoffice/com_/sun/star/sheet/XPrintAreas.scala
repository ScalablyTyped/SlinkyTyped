package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a sheet which has print areas. */
@js.native
trait XPrintAreas extends XInterface {
  
  /** returns a sequence containing all print areas of the sheet. */
  var PrintAreas: SafeArray[CellRangeAddress] = js.native
  
  /** returns, whether the title columns are repeated on all subsequent print pages to the right. */
  var PrintTitleColumns: Boolean = js.native
  
  /** returns, whether the title rows are repeated on all subsequent print pages to the bottom. */
  var PrintTitleRows: Boolean = js.native
  
  /**
    * returns the range that is specified as title columns range.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @returns the range of columns that is specified as title columns range.
    */
  var TitleColumns: CellRangeAddress = js.native
  
  /**
    * returns the range that is specified as title rows range.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @returns the range of rows that is specified as title rows range.
    */
  var TitleRows: CellRangeAddress = js.native
  
  /** returns a sequence containing all print areas of the sheet. */
  def getPrintAreas(): SafeArray[CellRangeAddress] = js.native
  
  /** returns, whether the title columns are repeated on all subsequent print pages to the right. */
  def getPrintTitleColumns(): Boolean = js.native
  
  /** returns, whether the title rows are repeated on all subsequent print pages to the bottom. */
  def getPrintTitleRows(): Boolean = js.native
  
  /**
    * returns the range that is specified as title columns range.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @returns the range of columns that is specified as title columns range.
    */
  def getTitleColumns(): CellRangeAddress = js.native
  
  /**
    * returns the range that is specified as title rows range.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @returns the range of rows that is specified as title rows range.
    */
  def getTitleRows(): CellRangeAddress = js.native
  
  /**
    * sets the print areas of the sheet.
    *
    * If none of the sheets in a document have print areas, the whole sheets are printed. If any sheet contains print areas, other sheets without print
    * areas are not printed.
    * @param aPrintAreas a sequence containing all print areas for this sheet.
    */
  def setPrintAreas(aPrintAreas: SeqEquiv[CellRangeAddress]): Unit = js.native
  
  /**
    * specifies whether the title columns are repeated on all subsequent print pages to the right.
    * @param bPrintTitleColumns if `TRUE` , title columns are repeated on each page.
    */
  def setPrintTitleColumns(bPrintTitleColumns: Boolean): Unit = js.native
  
  /**
    * specifies whether the title rows are repeated on all subsequent print pages to the bottom.
    * @param bPrintTitleRows if `TRUE` , title rows are repeated on each page.
    */
  def setPrintTitleRows(bPrintTitleRows: Boolean): Unit = js.native
  
  /**
    * specifies a range of columns as title columns range.
    *
    * The rows of the passed range are ignored.
    *
    * Title columns can be automatically repeated on all subsequent print pages to the right, using {@link XPrintAreas.setPrintTitleColumns()} .
    * @param aTitleColumns the title columns range.
    */
  def setTitleColumns(aTitleColumns: CellRangeAddress): Unit = js.native
  
  /**
    * specifies a range of rows as title rows range.
    *
    * The columns of the passed range are ignored.
    *
    * Title rows can be automatically repeated on all subsequent print pages to the bottom, using {@link XPrintAreas.setPrintTitleRows()} .
    * @param aTitleRows the title rows range.
    */
  def setTitleRows(aTitleRows: CellRangeAddress): Unit = js.native
}
object XPrintAreas {
  
  @scala.inline
  def apply(
    PrintAreas: SafeArray[CellRangeAddress],
    PrintTitleColumns: Boolean,
    PrintTitleRows: Boolean,
    TitleColumns: CellRangeAddress,
    TitleRows: CellRangeAddress,
    acquire: () => Unit,
    getPrintAreas: () => SafeArray[CellRangeAddress],
    getPrintTitleColumns: () => Boolean,
    getPrintTitleRows: () => Boolean,
    getTitleColumns: () => CellRangeAddress,
    getTitleRows: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setPrintAreas: SeqEquiv[CellRangeAddress] => Unit,
    setPrintTitleColumns: Boolean => Unit,
    setPrintTitleRows: Boolean => Unit,
    setTitleColumns: CellRangeAddress => Unit,
    setTitleRows: CellRangeAddress => Unit
  ): XPrintAreas = {
    val __obj = js.Dynamic.literal(PrintAreas = PrintAreas.asInstanceOf[js.Any], PrintTitleColumns = PrintTitleColumns.asInstanceOf[js.Any], PrintTitleRows = PrintTitleRows.asInstanceOf[js.Any], TitleColumns = TitleColumns.asInstanceOf[js.Any], TitleRows = TitleRows.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPrintAreas = js.Any.fromFunction0(getPrintAreas), getPrintTitleColumns = js.Any.fromFunction0(getPrintTitleColumns), getPrintTitleRows = js.Any.fromFunction0(getPrintTitleRows), getTitleColumns = js.Any.fromFunction0(getTitleColumns), getTitleRows = js.Any.fromFunction0(getTitleRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setPrintAreas = js.Any.fromFunction1(setPrintAreas), setPrintTitleColumns = js.Any.fromFunction1(setPrintTitleColumns), setPrintTitleRows = js.Any.fromFunction1(setPrintTitleRows), setTitleColumns = js.Any.fromFunction1(setTitleColumns), setTitleRows = js.Any.fromFunction1(setTitleRows))
    __obj.asInstanceOf[XPrintAreas]
  }
  
  @scala.inline
  implicit class XPrintAreasOps[Self <: XPrintAreas] (val x: Self) extends AnyVal {
    
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
    def setPrintAreas(value: SafeArray[CellRangeAddress]): Self = this.set("PrintAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintTitleColumns(value: Boolean): Self = this.set("PrintTitleColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintTitleRows(value: Boolean): Self = this.set("PrintTitleRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleColumns(value: CellRangeAddress): Self = this.set("TitleColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleRows(value: CellRangeAddress): Self = this.set("TitleRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPrintAreas(value: () => SafeArray[CellRangeAddress]): Self = this.set("getPrintAreas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrintTitleColumns(value: () => Boolean): Self = this.set("getPrintTitleColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrintTitleRows(value: () => Boolean): Self = this.set("getPrintTitleRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitleColumns(value: () => CellRangeAddress): Self = this.set("getTitleColumns", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTitleRows(value: () => CellRangeAddress): Self = this.set("getTitleRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPrintAreas(value: SeqEquiv[CellRangeAddress] => Unit): Self = this.set("setPrintAreas", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPrintTitleColumns(value: Boolean => Unit): Self = this.set("setPrintTitleColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPrintTitleRows(value: Boolean => Unit): Self = this.set("setPrintTitleRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleColumns(value: CellRangeAddress => Unit): Self = this.set("setTitleColumns", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTitleRows(value: CellRangeAddress => Unit): Self = this.set("setTitleRows", js.Any.fromFunction1(value))
  }
}

package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.XCellRange
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshable
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a database range in a spreadsheet document.
  *
  * A database range is a name for a cell range that also stores filtering, sorting, subtotal and data import settings and options.
  * @see com.sun.star.sheet.DatabaseRanges
  */
@js.native
trait DatabaseRange
  extends XDatabaseRange
     with XCellRangeReferrer
     with XPropertySet
     with XNamed
     with XRefreshable {
  
  /**
    * specifies whether the AutoFilter is enabled or not.
    * @since OOo 1.1.2
    */
  var AutoFilter: Boolean = js.native
  
  /**
    * specifies whether this range includes a top row of headers.
    * @since LibreOffice 5.0
    */
  var ContainsHeader: Boolean = js.native
  
  /**
    * specifies the range where the filter can find the filter criteria.
    *
    * This is only used if SheetFilterDescriptor::UseFilterCriteriaSource is `TRUE` .
    * @since OOo 1.1.2
    */
  var FilterCriteriaSource: CellRangeAddress = js.native
  
  /**
    * specifies whether the imported data is only a selection of the database.
    * @since OOo 2.0
    */
  var FromSelection: Boolean = js.native
  
  /** if this property is set, cell formats are extended when the size of the range is changed by an update operation. */
  var KeepFormats: Boolean = js.native
  
  /** if this property is set, columns or rows are inserted or deleted when the size of the range is changed by an update operation. */
  var MoveCells: Boolean = js.native
  
  /**
    * specifies the time between two refresh actions in seconds.
    * @since OOo 2.0
    */
  var RefreshPeriod: Double = js.native
  
  /** if this property is set, the cell contents within the database range are left out when the document is saved. */
  var StripData: Boolean = js.native
  
  /**
    * returns the index used to refer to this range in token arrays.
    *
    * A token describing a database range shall contain the op-code obtained from the {@link FormulaMapGroupSpecialOffset.DB_AREA} and this index as data
    * part.
    * @see com.sun.star.sheet.FormulaToken
    * @see com.sun.star.sheet.FormulaMapGroupSpecialOffset.DB_AREA
    * @since OOo 3.0
    */
  var TokenIndex: Double = js.native
  
  /**
    * specifies whether this range includes a bottom row of totals.
    * @since LibreOffice 5.0
    */
  var TotalsRow: Boolean = js.native
  
  /**
    * specifies whether the filter criteria should be taken from a CellRange.
    * @since OOo 1.1.2
    */
  var UseFilterCriteriaSource: Boolean = js.native
  
  /** executes the stored import, filter, sorting, and subtotals descriptors again. */
  /* InferMemberOverrides */
  override def refresh(): Unit = js.native
}
object DatabaseRange {
  
  @scala.inline
  def apply(
    AutoFilter: Boolean,
    ContainsHeader: Boolean,
    DataArea: CellRangeAddress,
    FilterCriteriaSource: CellRangeAddress,
    FilterDescriptor: XSheetFilterDescriptor,
    FromSelection: Boolean,
    ImportDescriptor: SafeArray[PropertyValue],
    KeepFormats: Boolean,
    MoveCells: Boolean,
    Name: String,
    PropertySetInfo: XPropertySetInfo,
    ReferredCells: XCellRange,
    RefreshPeriod: Double,
    SortDescriptor: SafeArray[PropertyValue],
    StripData: Boolean,
    SubTotalDescriptor: XSubTotalDescriptor,
    TokenIndex: Double,
    TotalsRow: Boolean,
    UseFilterCriteriaSource: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRefreshListener: XRefreshListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getDataArea: () => CellRangeAddress,
    getFilterDescriptor: () => XSheetFilterDescriptor,
    getImportDescriptor: () => SafeArray[PropertyValue],
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getReferredCells: () => XCellRange,
    getSortDescriptor: () => SafeArray[PropertyValue],
    getSubTotalDescriptor: () => XSubTotalDescriptor,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setDataArea: CellRangeAddress => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DatabaseRange = {
    val __obj = js.Dynamic.literal(AutoFilter = AutoFilter.asInstanceOf[js.Any], ContainsHeader = ContainsHeader.asInstanceOf[js.Any], DataArea = DataArea.asInstanceOf[js.Any], FilterCriteriaSource = FilterCriteriaSource.asInstanceOf[js.Any], FilterDescriptor = FilterDescriptor.asInstanceOf[js.Any], FromSelection = FromSelection.asInstanceOf[js.Any], ImportDescriptor = ImportDescriptor.asInstanceOf[js.Any], KeepFormats = KeepFormats.asInstanceOf[js.Any], MoveCells = MoveCells.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReferredCells = ReferredCells.asInstanceOf[js.Any], RefreshPeriod = RefreshPeriod.asInstanceOf[js.Any], SortDescriptor = SortDescriptor.asInstanceOf[js.Any], StripData = StripData.asInstanceOf[js.Any], SubTotalDescriptor = SubTotalDescriptor.asInstanceOf[js.Any], TokenIndex = TokenIndex.asInstanceOf[js.Any], TotalsRow = TotalsRow.asInstanceOf[js.Any], UseFilterCriteriaSource = UseFilterCriteriaSource.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getDataArea = js.Any.fromFunction0(getDataArea), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getImportDescriptor = js.Any.fromFunction0(getImportDescriptor), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReferredCells = js.Any.fromFunction0(getReferredCells), getSortDescriptor = js.Any.fromFunction0(getSortDescriptor), getSubTotalDescriptor = js.Any.fromFunction0(getSubTotalDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setDataArea = js.Any.fromFunction1(setDataArea), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DatabaseRange]
  }
  
  @scala.inline
  implicit class DatabaseRangeOps[Self <: DatabaseRange] (val x: Self) extends AnyVal {
    
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
    def setAutoFilter(value: Boolean): Self = this.set("AutoFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsHeader(value: Boolean): Self = this.set("ContainsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterCriteriaSource(value: CellRangeAddress): Self = this.set("FilterCriteriaSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromSelection(value: Boolean): Self = this.set("FromSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepFormats(value: Boolean): Self = this.set("KeepFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveCells(value: Boolean): Self = this.set("MoveCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshPeriod(value: Double): Self = this.set("RefreshPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripData(value: Boolean): Self = this.set("StripData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenIndex(value: Double): Self = this.set("TokenIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsRow(value: Boolean): Self = this.set("TotalsRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseFilterCriteriaSource(value: Boolean): Self = this.set("UseFilterCriteriaSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
  }
}

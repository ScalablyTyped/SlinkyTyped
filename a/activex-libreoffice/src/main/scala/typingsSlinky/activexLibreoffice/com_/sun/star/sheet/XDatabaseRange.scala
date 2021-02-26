package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings and options of a database range.
  * @see com.sun.star.sheet.DatabaseRange
  */
@js.native
trait XDatabaseRange extends XInterface {
  
  /** returns the data area of the database range in the spreadsheet document. */
  var DataArea: CellRangeAddress = js.native
  
  /**
    * returns the filter descriptor stored with the database range.
    *
    * If the filter descriptor is modified, the new filtering is carried out when {@link XDatabaseRange.refresh()} is called.
    * @see SheetFilterDescriptor
    */
  val FilterDescriptor: XSheetFilterDescriptor = js.native
  
  /**
    * returns the database import descriptor stored with this database range.
    * @see DatabaseImportDescriptor
    */
  val ImportDescriptor: SafeArray[PropertyValue] = js.native
  
  /**
    * returns the sort descriptor stored with the database range.
    * @see SheetSortDescriptor2
    */
  val SortDescriptor: SafeArray[PropertyValue] = js.native
  
  /**
    * returns the subtotal descriptor stored with the database range.
    *
    * If the subtotal descriptor is modified, the new subtotals are inserted when {@link XDatabaseRange.refresh()} is called.
    * @see SubTotalDescriptor
    */
  val SubTotalDescriptor: XSubTotalDescriptor = js.native
  
  /** returns the data area of the database range in the spreadsheet document. */
  def getDataArea(): CellRangeAddress = js.native
  
  /**
    * returns the filter descriptor stored with the database range.
    *
    * If the filter descriptor is modified, the new filtering is carried out when {@link XDatabaseRange.refresh()} is called.
    * @see SheetFilterDescriptor
    */
  def getFilterDescriptor(): XSheetFilterDescriptor = js.native
  
  /**
    * returns the database import descriptor stored with this database range.
    * @see DatabaseImportDescriptor
    */
  def getImportDescriptor(): SafeArray[PropertyValue] = js.native
  
  /**
    * returns the sort descriptor stored with the database range.
    * @see SheetSortDescriptor2
    */
  def getSortDescriptor(): SafeArray[PropertyValue] = js.native
  
  /**
    * returns the subtotal descriptor stored with the database range.
    *
    * If the subtotal descriptor is modified, the new subtotals are inserted when {@link XDatabaseRange.refresh()} is called.
    * @see SubTotalDescriptor
    */
  def getSubTotalDescriptor(): XSubTotalDescriptor = js.native
  
  /** executes the stored import, filter, sorting, and subtotals descriptors again. */
  def refresh(): Unit = js.native
  
  /** sets the data area of the database range. */
  def setDataArea(aDataArea: CellRangeAddress): Unit = js.native
}
object XDatabaseRange {
  
  @scala.inline
  def apply(
    DataArea: CellRangeAddress,
    FilterDescriptor: XSheetFilterDescriptor,
    ImportDescriptor: SafeArray[PropertyValue],
    SortDescriptor: SafeArray[PropertyValue],
    SubTotalDescriptor: XSubTotalDescriptor,
    acquire: () => Unit,
    getDataArea: () => CellRangeAddress,
    getFilterDescriptor: () => XSheetFilterDescriptor,
    getImportDescriptor: () => SafeArray[PropertyValue],
    getSortDescriptor: () => SafeArray[PropertyValue],
    getSubTotalDescriptor: () => XSubTotalDescriptor,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    setDataArea: CellRangeAddress => Unit
  ): XDatabaseRange = {
    val __obj = js.Dynamic.literal(DataArea = DataArea.asInstanceOf[js.Any], FilterDescriptor = FilterDescriptor.asInstanceOf[js.Any], ImportDescriptor = ImportDescriptor.asInstanceOf[js.Any], SortDescriptor = SortDescriptor.asInstanceOf[js.Any], SubTotalDescriptor = SubTotalDescriptor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataArea = js.Any.fromFunction0(getDataArea), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getImportDescriptor = js.Any.fromFunction0(getImportDescriptor), getSortDescriptor = js.Any.fromFunction0(getSortDescriptor), getSubTotalDescriptor = js.Any.fromFunction0(getSubTotalDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), setDataArea = js.Any.fromFunction1(setDataArea))
    __obj.asInstanceOf[XDatabaseRange]
  }
  
  @scala.inline
  implicit class XDatabaseRangeMutableBuilder[Self <: XDatabaseRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataArea(value: CellRangeAddress): Self = StObject.set(x, "DataArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterDescriptor(value: XSheetFilterDescriptor): Self = StObject.set(x, "FilterDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDataArea(value: () => CellRangeAddress): Self = StObject.set(x, "getDataArea", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilterDescriptor(value: () => XSheetFilterDescriptor): Self = StObject.set(x, "getFilterDescriptor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetImportDescriptor(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getImportDescriptor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSortDescriptor(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getSortDescriptor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubTotalDescriptor(value: () => XSubTotalDescriptor): Self = StObject.set(x, "getSubTotalDescriptor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImportDescriptor(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ImportDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDataArea(value: CellRangeAddress => Unit): Self = StObject.set(x, "setDataArea", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortDescriptor(value: SafeArray[PropertyValue]): Self = StObject.set(x, "SortDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTotalDescriptor(value: XSubTotalDescriptor): Self = StObject.set(x, "SubTotalDescriptor", value.asInstanceOf[js.Any])
  }
}

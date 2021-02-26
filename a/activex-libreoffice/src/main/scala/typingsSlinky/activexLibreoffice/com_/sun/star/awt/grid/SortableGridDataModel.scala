package typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.Pair
import typingsSlinky.activexLibreoffice.com_.sun.star.i18n.XCollator
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides a default implementation of a {@link XSortableGridData} .
  *
  * This service must be created with a secondary grid data model, which all actual data requests are delegated to. But before providing this data to the
  * service's own clients, it is sorted, according to the sort order defined via the `XSortableGridData` interface.
  *
  * The service implementation is able to compare the default scalar types, plus strings.
  *
  * For determining the data type of a column which the data should be sorted by, the first non- `VOID` data encountered in this column is taken into
  * account. Further read requests to this column will assume that all non- `VOID` data is of the same type.
  *
  * Consequently, you cannot use this service with data sets containing heterogeneous data in a given column.
  *
  * All requests made via the {@link XMutableGridDataModel} are delegated to the `XMutableGridDataModel` instance passed in the service constructor.
  *
  * Note that changing the data might result in the sort order being destroyed. If you want to ensure that the data represented by the model is still
  * sorted after your modifications, you should call {@link XSortableGridData.sortByColumn()} , again.
  */
@js.native
trait SortableGridDataModel extends XSortableMutableGridDataModel {
  
  /**
    * creates a new instance of the `SortableGridDataModel`
    *
    * For string comparison, a default {@link com.sun.star.i18n.Collator} , based on the system's locale, will be used.
    * @param DelegatorModel the data model to which read requests are delegated.
    * @throws com::sun::star::lang::IllegalArgumentException if the given `DelegatorModel` is `NULL`
    */
  def create(DelegatorModel: XMutableGridDataModel): Unit = js.native
  
  /**
    * creates a new instance of the ScortableDefaultGridDataModel, passing a collator to be used for string comparison.
    * @param DelegatorModel is the data model to which read requests are delegated
    * @param Collator is the collator to be used for string comparison
    * @throws com::sun::star::lang::IllegalArgumentException if the given `DelegatorModel` is `NULL`
    */
  def createWithCollator(DelegatorModel: XMutableGridDataModel, Collator: XCollator): Unit = js.native
}
object SortableGridDataModel {
  
  @scala.inline
  def apply(
    ColumnCount: Double,
    CurrentSortOrder: Pair[Double, Boolean],
    RowCount: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addGridDataListener: XGridDataListener => Unit,
    addRow: (js.Any, SeqEquiv[_]) => Unit,
    addRows: (SeqEquiv[_], SeqEquiv[SeqEquiv[_]]) => Unit,
    create: XMutableGridDataModel => Unit,
    createClone: () => XCloneable,
    createWithCollator: (XMutableGridDataModel, XCollator) => Unit,
    dispose: () => Unit,
    getCellData: (Double, Double) => js.Any,
    getCellToolTip: (Double, Double) => js.Any,
    getCurrentSortOrder: () => Pair[Double, Boolean],
    getRowData: Double => SafeArray[_],
    getRowHeading: Double => js.Any,
    insertRow: (Double, js.Any, SeqEquiv[_]) => Unit,
    insertRows: (Double, SeqEquiv[_], SeqEquiv[SeqEquiv[_]]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAllRows: () => Unit,
    removeColumnSort: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeGridDataListener: XGridDataListener => Unit,
    removeRow: Double => Unit,
    sortByColumn: (Double, Boolean) => Unit,
    updateCellData: (Double, Double, js.Any) => Unit,
    updateCellToolTip: (Double, Double, js.Any) => Unit,
    updateRowData: (SeqEquiv[Double], Double, SeqEquiv[_]) => Unit,
    updateRowHeading: (Double, js.Any) => Unit,
    updateRowToolTip: (Double, js.Any) => Unit
  ): SortableGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], CurrentSortOrder = CurrentSortOrder.asInstanceOf[js.Any], RowCount = RowCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addGridDataListener = js.Any.fromFunction1(addGridDataListener), addRow = js.Any.fromFunction2(addRow), addRows = js.Any.fromFunction2(addRows), create = js.Any.fromFunction1(create), createClone = js.Any.fromFunction0(createClone), createWithCollator = js.Any.fromFunction2(createWithCollator), dispose = js.Any.fromFunction0(dispose), getCellData = js.Any.fromFunction2(getCellData), getCellToolTip = js.Any.fromFunction2(getCellToolTip), getCurrentSortOrder = js.Any.fromFunction0(getCurrentSortOrder), getRowData = js.Any.fromFunction1(getRowData), getRowHeading = js.Any.fromFunction1(getRowHeading), insertRow = js.Any.fromFunction3(insertRow), insertRows = js.Any.fromFunction3(insertRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAllRows = js.Any.fromFunction0(removeAllRows), removeColumnSort = js.Any.fromFunction0(removeColumnSort), removeEventListener = js.Any.fromFunction1(removeEventListener), removeGridDataListener = js.Any.fromFunction1(removeGridDataListener), removeRow = js.Any.fromFunction1(removeRow), sortByColumn = js.Any.fromFunction2(sortByColumn), updateCellData = js.Any.fromFunction3(updateCellData), updateCellToolTip = js.Any.fromFunction3(updateCellToolTip), updateRowData = js.Any.fromFunction3(updateRowData), updateRowHeading = js.Any.fromFunction2(updateRowHeading), updateRowToolTip = js.Any.fromFunction2(updateRowToolTip))
    __obj.asInstanceOf[SortableGridDataModel]
  }
  
  @scala.inline
  implicit class SortableGridDataModelMutableBuilder[Self <: SortableGridDataModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: XMutableGridDataModel => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWithCollator(value: (XMutableGridDataModel, XCollator) => Unit): Self = StObject.set(x, "createWithCollator", js.Any.fromFunction2(value))
  }
}

package typingsSlinky.activexLibreoffice.com_.sun.star.awt.grid

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to sort the data represented by a {@link XGridDataModel} */
@js.native
trait XSortableGridData extends js.Object {
  /**
    * returns the current sort order.
    * @returns a structure describing the current sort order. com::sun::star::beans::Pair::First denotes the column by which the data is sorted, or -1 if the da
    */
  val CurrentSortOrder: Pair[Double, Boolean] = js.native
  /**
    * returns the current sort order.
    * @returns a structure describing the current sort order. com::sun::star::beans::Pair::First denotes the column by which the data is sorted, or -1 if the da
    */
  def getCurrentSortOrder(): Pair[Double, Boolean] = js.native
  /** removes any possibly present sorting of the grid data */
  def removeColumnSort(): Unit = js.native
  /**
    * sorts the rows represented by the model by a given column's data.
    * @param ColumnIndex the index of the column whose data should be used as sort key
    * @param SortAscending is `TRUE` if the data should be sorted ascending, `FALSE` otherwise.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `ColumnIndex` does not denote a valid column.
    */
  def sortByColumn(ColumnIndex: Double, SortAscending: Boolean): Unit = js.native
}

object XSortableGridData {
  @scala.inline
  def apply(
    CurrentSortOrder: Pair[Double, Boolean],
    getCurrentSortOrder: () => Pair[Double, Boolean],
    removeColumnSort: () => Unit,
    sortByColumn: (Double, Boolean) => Unit
  ): XSortableGridData = {
    val __obj = js.Dynamic.literal(CurrentSortOrder = CurrentSortOrder.asInstanceOf[js.Any], getCurrentSortOrder = js.Any.fromFunction0(getCurrentSortOrder), removeColumnSort = js.Any.fromFunction0(removeColumnSort), sortByColumn = js.Any.fromFunction2(sortByColumn))
    __obj.asInstanceOf[XSortableGridData]
  }
  @scala.inline
  implicit class XSortableGridDataOps[Self <: XSortableGridData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentSortOrder(value: Pair[Double, Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetCurrentSortOrder(value: () => Pair[Double, Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentSortOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveColumnSort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeColumnSort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSortByColumn(value: (Double, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByColumn")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}


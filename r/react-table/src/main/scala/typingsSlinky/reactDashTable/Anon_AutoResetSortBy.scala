package typingsSlinky.reactDashTable

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactDashTable.reactDashTableMod.Row
import typingsSlinky.reactDashTable.reactDashTableMod.SortByFn
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoResetSortBy[D /* <: js.Object */] extends js.Object {
  var autoResetSortBy: js.UndefOr[Boolean] = js.undefined
  var defaultCanSort: Boolean
  var disableMultiSort: Boolean
  var disableSortBy: Boolean
  var disableSortRemove: Boolean
  var disabledMultiRemove: Boolean
  var manualSortBy: Boolean
  var maxMultiSortColCount: Double
  var sortTypes: Record[String, SortByFn[D]]
  def isMultiSortEvent(e: SyntheticMouseEvent[Element]): Boolean
  def orderByFn(rows: js.Array[Row[D]], sortFns: js.Array[SortByFn[D]], directions: js.Array[Boolean]): js.Array[Row[D]]
}

object Anon_AutoResetSortBy {
  @scala.inline
  def apply[D /* <: js.Object */](
    defaultCanSort: Boolean,
    disableMultiSort: Boolean,
    disableSortBy: Boolean,
    disableSortRemove: Boolean,
    disabledMultiRemove: Boolean,
    isMultiSortEvent: SyntheticMouseEvent[Element] => Boolean,
    manualSortBy: Boolean,
    maxMultiSortColCount: Double,
    orderByFn: (js.Array[Row[D]], js.Array[SortByFn[D]], js.Array[Boolean]) => js.Array[Row[D]],
    sortTypes: Record[String, SortByFn[D]],
    autoResetSortBy: js.UndefOr[Boolean] = js.undefined
  ): Anon_AutoResetSortBy[D] = {
    val __obj = js.Dynamic.literal(defaultCanSort = defaultCanSort.asInstanceOf[js.Any], disableMultiSort = disableMultiSort.asInstanceOf[js.Any], disableSortBy = disableSortBy.asInstanceOf[js.Any], disableSortRemove = disableSortRemove.asInstanceOf[js.Any], disabledMultiRemove = disabledMultiRemove.asInstanceOf[js.Any], isMultiSortEvent = js.Any.fromFunction1(isMultiSortEvent), manualSortBy = manualSortBy.asInstanceOf[js.Any], maxMultiSortColCount = maxMultiSortColCount.asInstanceOf[js.Any], orderByFn = js.Any.fromFunction3(orderByFn), sortTypes = sortTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResetSortBy)) __obj.updateDynamic("autoResetSortBy")(autoResetSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoResetSortBy[D]]
  }
}


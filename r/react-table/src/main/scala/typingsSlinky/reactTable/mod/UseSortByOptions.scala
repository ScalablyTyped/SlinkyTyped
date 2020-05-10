package typingsSlinky.reactTable.mod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualSortBy  :boolean,   disableSortBy  :boolean,   defaultCanSort  :boolean,   disableMultiSort  :boolean, isMultiSortEvent (e : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): boolean,   maxMultiSortColCount  :number,   disableSortRemove  :boolean,   disabledMultiRemove  :boolean, orderByFn (rows : std.Array<react-table.react-table.Row<D>>, sortFns : std.Array<react-table.react-table.SortByFn<D>>, directions : std.Array<boolean>): std.Array<react-table.react-table.Row<D>>,   sortTypes  :std.Record<string, react-table.react-table.SortByFn<D>>,   autoResetSortBy ? :boolean}> */
@js.native
trait UseSortByOptions[D /* <: js.Object */] extends js.Object {
  var autoResetSortBy: js.UndefOr[Boolean] = js.native
  var defaultCanSort: js.UndefOr[Boolean] = js.native
  var disableMultiSort: js.UndefOr[Boolean] = js.native
  var disableSortBy: js.UndefOr[Boolean] = js.native
  var disableSortRemove: js.UndefOr[Boolean] = js.native
  var disabledMultiRemove: js.UndefOr[Boolean] = js.native
  var isMultiSortEvent: js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[Element], Boolean]] = js.native
  var manualSortBy: js.UndefOr[Boolean] = js.native
  var maxMultiSortColCount: js.UndefOr[Double] = js.native
  var orderByFn: js.UndefOr[
    js.Function3[
      /* rows */ js.Array[Row[D]], 
      /* sortFns */ js.Array[SortByFn[D]], 
      /* directions */ js.Array[Boolean], 
      js.Array[Row[D]]
    ]
  ] = js.native
  var sortTypes: js.UndefOr[Record[String, SortByFn[D]]] = js.native
}

object UseSortByOptions {
  @scala.inline
  def apply[D](): UseSortByOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseSortByOptions[D]]
  }
  @scala.inline
  implicit class UseSortByOptionsOps[Self[d] <: UseSortByOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAutoResetSortBy(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetSortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResetSortBy: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetSortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCanSort(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCanSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCanSort: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCanSort")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMultiSort(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMultiSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMultiSort: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMultiSort")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSortBy(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSortBy: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSortRemove(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSortRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSortRemove: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSortRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledMultiRemove(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMultiRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledMultiRemove: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledMultiRemove")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMultiSortEvent(value: /* e */ SyntheticMouseEvent[Element] => Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiSortEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsMultiSortEvent: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiSortEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withManualSortBy(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualSortBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualSortBy: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualSortBy")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxMultiSortColCount(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMultiSortColCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxMultiSortColCount: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxMultiSortColCount")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderByFn(
      value: (/* rows */ js.Array[Row[D]], /* sortFns */ js.Array[SortByFn[D]], /* directions */ js.Array[Boolean]) => js.Array[Row[D]]
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderByFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOrderByFn: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderByFn")(js.undefined)
        ret
    }
    @scala.inline
    def withSortTypes(value: Record[String, SortByFn[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortTypes: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortTypes")(js.undefined)
        ret
    }
  }
  
}


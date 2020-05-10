package typingsSlinky.reactTable.mod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  aggregate  :react-table.react-table.Aggregator<D>,   Aggregated  :react-table.react-table.Renderer<react-table.react-table.CellProps<D, any>>,   disableGroupBy  :boolean,   defaultCanGroupBy  :boolean,   groupByBoundary  :boolean}> */
@js.native
trait UseGroupByColumnOptions[D /* <: js.Object */] extends js.Object {
  var Aggregated: js.UndefOr[Renderer[CellProps[D, _]]] = js.native
  var aggregate: js.UndefOr[Aggregator[D]] = js.native
  var defaultCanGroupBy: js.UndefOr[Boolean] = js.native
  var disableGroupBy: js.UndefOr[Boolean] = js.native
  var groupByBoundary: js.UndefOr[Boolean] = js.native
}

object UseGroupByColumnOptions {
  @scala.inline
  def apply[D](): UseGroupByColumnOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGroupByColumnOptions[D]]
  }
  @scala.inline
  implicit class UseGroupByColumnOptionsOps[Self[d] <: UseGroupByColumnOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAggregatedReactElement(value: ReactElement): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregatedFunctionComponent(value: ReactComponentClass[CellProps[D, _]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregatedComponentClass(value: ReactComponentClass[CellProps[D, _]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggregated(value: Renderer[CellProps[D, _]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregated: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Aggregated")(js.undefined)
        ret
    }
    @scala.inline
    def withAggregateFunction3(
      value: (/* columnValues */ js.Array[CellValue[js.Any]], /* rows */ js.Array[Row[D]], /* isAggregated */ Boolean) => AggregatedValue
    ): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAggregate(value: Aggregator[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregate: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultCanGroupBy(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCanGroupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCanGroupBy: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCanGroupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableGroupBy(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGroupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableGroupBy: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGroupBy")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupByBoundary(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByBoundary: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByBoundary")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.reactTable.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  manualGroupBy  :boolean,   disableGroupBy  :boolean,   defaultCanGroupBy  :boolean,   aggregations  :std.Record<string, react-table.react-table.AggregatorFn<D>>, groupByFn (rows : std.Array<react-table.react-table.Row<D>>, columnId : react-table.react-table.IdType<D>): std.Record<string, react-table.react-table.Row<D>>,   autoResetGroupBy ? :boolean}> */
@js.native
trait UseGroupByOptions[D /* <: js.Object */] extends js.Object {
  var aggregations: js.UndefOr[Record[String, AggregatorFn[D]]] = js.native
  var autoResetGroupBy: js.UndefOr[Boolean] = js.native
  var defaultCanGroupBy: js.UndefOr[Boolean] = js.native
  var disableGroupBy: js.UndefOr[Boolean] = js.native
  var groupByFn: js.UndefOr[
    js.Function2[/* rows */ js.Array[Row[D]], /* columnId */ IdType[D], Record[String, Row[D]]]
  ] = js.native
  var manualGroupBy: js.UndefOr[Boolean] = js.native
}

object UseGroupByOptions {
  @scala.inline
  def apply[D](): UseGroupByOptions[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseGroupByOptions[D]]
  }
  @scala.inline
  implicit class UseGroupByOptionsOps[Self[d] <: UseGroupByOptions[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withAggregations(value: Record[String, AggregatorFn[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregations: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregations")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoResetGroupBy(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetGroupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResetGroupBy: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResetGroupBy")(js.undefined)
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
    def withGroupByFn(value: (/* rows */ js.Array[Row[D]], /* columnId */ IdType[D]) => Record[String, Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGroupByFn: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByFn")(js.undefined)
        ret
    }
    @scala.inline
    def withManualGroupBy(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualGroupBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManualGroupBy: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manualGroupBy")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceOptions extends js.Object {
  var aggregate: js.UndefOr[js.Array[DataSourceAggregateItem]] = js.native
  var autoSync: js.UndefOr[Boolean] = js.native
  var batch: js.UndefOr[Boolean] = js.native
  var change: js.UndefOr[js.Function1[/* e */ DataSourceChangeEvent, Unit]] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var error: js.UndefOr[js.Function1[/* e */ DataSourceErrorEvent, Unit]] = js.native
  var filter: js.UndefOr[js.Any] = js.native
  var group: js.UndefOr[DataSourceGroupItem | js.Array[DataSourceGroupItem]] = js.native
  var inPlaceSort: js.UndefOr[Boolean] = js.native
  var offlineStorage: js.UndefOr[js.Any] = js.native
  var page: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var push: js.UndefOr[js.Function1[/* e */ DataSourcePushEvent, Unit]] = js.native
  var requestEnd: js.UndefOr[js.Function1[/* e */ DataSourceRequestEndEvent, Unit]] = js.native
  var requestStart: js.UndefOr[js.Function1[/* e */ DataSourceRequestStartEvent, Unit]] = js.native
  var schema: js.UndefOr[DataSourceSchema] = js.native
  var serverAggregates: js.UndefOr[Boolean] = js.native
  var serverFiltering: js.UndefOr[Boolean] = js.native
  var serverGrouping: js.UndefOr[Boolean] = js.native
  var serverPaging: js.UndefOr[Boolean] = js.native
  var serverSorting: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[js.Any] = js.native
  var sync: js.UndefOr[js.Function1[/* e */ DataSourceEvent, Unit]] = js.native
  var transport: js.UndefOr[DataSourceTransport] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object DataSourceOptions {
  @scala.inline
  def apply(): DataSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceOptions]
  }
  @scala.inline
  implicit class DataSourceOptionsOps[Self <: DataSourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregate(value: js.Array[DataSourceAggregateItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSync")(js.undefined)
        ret
    }
    @scala.inline
    def withBatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
        ret
    }
    @scala.inline
    def withChange(value: /* e */ DataSourceChangeEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* e */ DataSourceErrorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: DataSourceGroupItem | js.Array[DataSourceGroupItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withInPlaceSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPlaceSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInPlaceSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inPlaceSort")(js.undefined)
        ret
    }
    @scala.inline
    def withOfflineStorage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineStorage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: /* e */ DataSourcePushEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestEnd(value: /* e */ DataSourceRequestEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestStart(value: /* e */ DataSourceRequestStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequestStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestStart")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: DataSourceSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withServerAggregates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverAggregates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerAggregates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverAggregates")(js.undefined)
        ret
    }
    @scala.inline
    def withServerFiltering(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverFiltering")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerFiltering: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverFiltering")(js.undefined)
        ret
    }
    @scala.inline
    def withServerGrouping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withServerPaging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPaging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerPaging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPaging")(js.undefined)
        ret
    }
    @scala.inline
    def withServerSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSorting")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withSync(value: /* e */ DataSourceEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sync")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: DataSourceTransport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}


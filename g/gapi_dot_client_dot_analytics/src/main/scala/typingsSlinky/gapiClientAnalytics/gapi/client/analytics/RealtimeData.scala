package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClientAnalytics.anon.AccountId
import typingsSlinky.gapiClientAnalytics.anon.ColumnType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealtimeData extends js.Object {
  /** Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request. */
  var columnHeaders: js.UndefOr[js.Array[ColumnType]] = js.native
  /** Unique ID for this data response. */
  var id: js.UndefOr[String] = js.native
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** Information for the view (profile), for which the real time data was requested. */
  var profileInfo: js.UndefOr[AccountId] = js.native
  /** Real time data request query parameters. */
  var query: js.UndefOr[typingsSlinky.gapiClientAnalytics.anon.Filters] = js.native
  /**
    * Real time data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as
    * specified in the request.
    */
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.native
  /** Link to this page. */
  var selfLink: js.UndefOr[String] = js.native
  /** The total number of rows for the query, regardless of the number of rows in the response. */
  var totalResults: js.UndefOr[Double] = js.native
  /**
    * Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as
    * the metric order specified in the request.
    */
  var totalsForAllResults: js.UndefOr[Record[String, String]] = js.native
}

object RealtimeData {
  @scala.inline
  def apply(): RealtimeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealtimeData]
  }
  @scala.inline
  implicit class RealtimeDataOps[Self <: RealtimeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnHeaders(value: js.Array[ColumnType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileInfo(value: AccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: typingsSlinky.gapiClientAnalytics.anon.Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalResults")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalsForAllResults(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsForAllResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalsForAllResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsForAllResults")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.gapiClientSpanner.gapi.client.spanner

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSetStats extends js.Object {
  /** QueryPlan for the query associated with this result. */
  var queryPlan: js.UndefOr[QueryPlan] = js.native
  /**
    * Aggregated statistics from the execution of the query. Only present when
    * the query is profiled. For example, a query could return the statistics as
    * follows:
    *
    * {
    * "rows_returned": "3",
    * "elapsed_time": "1.22 secs",
    * "cpu_time": "1.19 secs"
    * }
    */
  var queryStats: js.UndefOr[Record[String, _]] = js.native
}

object ResultSetStats {
  @scala.inline
  def apply(): ResultSetStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetStats]
  }
  @scala.inline
  implicit class ResultSetStatsOps[Self <: ResultSetStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryPlan(value: QueryPlan): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPlan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryPlan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryPlan")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryStats(value: Record[String, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryStats")(js.undefined)
        ret
    }
  }
  
}


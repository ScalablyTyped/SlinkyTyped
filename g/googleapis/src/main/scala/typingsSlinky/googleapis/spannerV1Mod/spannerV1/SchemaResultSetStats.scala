package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional statistics about a ResultSet or PartialResultSet.
  */
@js.native
trait SchemaResultSetStats extends js.Object {
  /**
    * QueryPlan for the query associated with this result.
    */
  var queryPlan: js.UndefOr[SchemaQueryPlan] = js.native
  /**
    * Aggregated statistics from the execution of the query. Only present when
    * the query is profiled. For example, a query could return the statistics
    * as follows:      {       &quot;rows_returned&quot;: &quot;3&quot;,
    * &quot;elapsed_time&quot;: &quot;1.22 secs&quot;, &quot;cpu_time&quot;:
    * &quot;1.19 secs&quot;     }
    */
  var queryStats: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Standard DML returns an exact count of rows that were modified.
    */
  var rowCountExact: js.UndefOr[String] = js.native
  /**
    * Partitioned DML does not offer exactly-once semantics, so it returns a
    * lower bound of the rows modified.
    */
  var rowCountLowerBound: js.UndefOr[String] = js.native
}

object SchemaResultSetStats {
  @scala.inline
  def apply(): SchemaResultSetStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultSetStats]
  }
  @scala.inline
  implicit class SchemaResultSetStatsOps[Self <: SchemaResultSetStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryPlan(value: SchemaQueryPlan): Self = {
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
    def withQueryStats(value: StringDictionary[js.Any]): Self = {
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
    @scala.inline
    def withRowCountExact(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCountExact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCountExact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCountExact")(js.undefined)
        ret
    }
    @scala.inline
    def withRowCountLowerBound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCountLowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowCountLowerBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCountLowerBound")(js.undefined)
        ret
    }
  }
  
}


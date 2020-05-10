package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/find.html#execution-statistics
@js.native
trait MangoExecutionStats extends js.Object {
  // Total execution time in milliseconds as measured by the database.
  var execution_time_ms: Double = js.native
  // Number of results returned from the query.
  var results_returned: Double = js.native
  // Number of documents fetched from the database / index, equivalent to using include_docs = true in a view.
  var total_docs_examined: Double = js.native
  // Number of index keys examined. Currently always 0.
  var total_keys_examined: Double = js.native
  // Number of documents fetched from the database using an out - of - band document fetch.
  // This is only non - zero when read quorum > 1 is specified in the query parameters.
  var total_quorum_docs_examined: Double = js.native
}

object MangoExecutionStats {
  @scala.inline
  def apply(
    execution_time_ms: Double,
    results_returned: Double,
    total_docs_examined: Double,
    total_keys_examined: Double,
    total_quorum_docs_examined: Double
  ): MangoExecutionStats = {
    val __obj = js.Dynamic.literal(execution_time_ms = execution_time_ms.asInstanceOf[js.Any], results_returned = results_returned.asInstanceOf[js.Any], total_docs_examined = total_docs_examined.asInstanceOf[js.Any], total_keys_examined = total_keys_examined.asInstanceOf[js.Any], total_quorum_docs_examined = total_quorum_docs_examined.asInstanceOf[js.Any])
    __obj.asInstanceOf[MangoExecutionStats]
  }
  @scala.inline
  implicit class MangoExecutionStatsOps[Self <: MangoExecutionStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecution_time_ms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_time_ms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults_returned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results_returned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_docs_examined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_docs_examined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_keys_examined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_keys_examined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_quorum_docs_examined(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_quorum_docs_examined")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


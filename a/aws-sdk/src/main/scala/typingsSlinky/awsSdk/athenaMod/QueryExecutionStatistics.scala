package typingsSlinky.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecutionStatistics extends js.Object {
  /**
    * The location and file name of a data manifest file. The manifest file is saved to the Athena query results location in Amazon S3. The manifest file tracks files that the query wrote to Amazon S3. If the query fails, the manifest file also tracks files that the query intended to write. The manifest is useful for identifying orphaned files resulting from a failed query. For more information, see Working with Query Results, Output Files, and Query History in the Amazon Athena User Guide.
    */
  var DataManifestLocation: js.UndefOr[String] = js.native
  /**
    * The number of bytes in the data that was queried.
    */
  var DataScannedInBytes: js.UndefOr[Long] = js.native
  /**
    * The number of milliseconds that the query took to execute.
    */
  var EngineExecutionTimeInMillis: js.UndefOr[Long] = js.native
  /**
    * The number of milliseconds that Athena took to plan the query processing flow. This includes the time spent retrieving table partitions from the data source. Note that because the query engine performs the query planning, query planning time is a subset of engine processing time.
    */
  var QueryPlanningTimeInMillis: js.UndefOr[Long] = js.native
  /**
    * The number of milliseconds that the query was in your query queue waiting for resources. Note that if transient errors occur, Athena might automatically add the query back to the queue.
    */
  var QueryQueueTimeInMillis: js.UndefOr[Long] = js.native
  /**
    * The number of milliseconds that Athena took to finalize and publish the query results after the query engine finished running the query.
    */
  var ServiceProcessingTimeInMillis: js.UndefOr[Long] = js.native
  /**
    * The number of milliseconds that Athena took to run the query.
    */
  var TotalExecutionTimeInMillis: js.UndefOr[Long] = js.native
}

object QueryExecutionStatistics {
  @scala.inline
  def apply(): QueryExecutionStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecutionStatistics]
  }
  @scala.inline
  implicit class QueryExecutionStatisticsOps[Self <: QueryExecutionStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataManifestLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataManifestLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataManifestLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataManifestLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withDataScannedInBytes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataScannedInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataScannedInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataScannedInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineExecutionTimeInMillis(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineExecutionTimeInMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineExecutionTimeInMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineExecutionTimeInMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryPlanningTimeInMillis(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryPlanningTimeInMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryPlanningTimeInMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryPlanningTimeInMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryQueueTimeInMillis(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryQueueTimeInMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryQueueTimeInMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryQueueTimeInMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceProcessingTimeInMillis(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceProcessingTimeInMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceProcessingTimeInMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceProcessingTimeInMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalExecutionTimeInMillis(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalExecutionTimeInMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalExecutionTimeInMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalExecutionTimeInMillis")(js.undefined)
        ret
    }
  }
  
}


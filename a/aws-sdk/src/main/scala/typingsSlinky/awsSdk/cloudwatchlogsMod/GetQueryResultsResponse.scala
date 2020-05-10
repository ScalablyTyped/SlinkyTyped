package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQueryResultsResponse extends js.Object {
  /**
    * The log events that matched the query criteria during the most recent time it ran. The results value is an array of arrays. Each log event is one object in the top-level array. Each of these log event objects is an array of field/value pairs.
    */
  var results: js.UndefOr[QueryResults] = js.native
  /**
    * Includes the number of log events scanned by the query, the number of log events that matched the query criteria, and the total number of bytes in the log events that were scanned.
    */
  var statistics: js.UndefOr[QueryStatistics] = js.native
  /**
    * The status of the most recent running of the query. Possible values are Cancelled, Complete, Failed, Running, Scheduled, Timeout, and Unknown. Queries time out after 15 minutes of execution. To avoid having your queries time out, reduce the time range being searched, or partition your query into a number of queries.
    */
  var status: js.UndefOr[QueryStatus] = js.native
}

object GetQueryResultsResponse {
  @scala.inline
  def apply(): GetQueryResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryResultsResponse]
  }
  @scala.inline
  implicit class GetQueryResultsResponseOps[Self <: GetQueryResultsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResults(value: QueryResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(js.undefined)
        ret
    }
    @scala.inline
    def withStatistics(value: QueryStatistics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatistics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statistics")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: QueryStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}


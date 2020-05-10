package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryStatistics extends js.Object {
  /**
    * The total number of bytes in the log events scanned during the query.
    */
  var bytesScanned: js.UndefOr[StatsValue] = js.native
  /**
    * The number of log events that matched the query string.
    */
  var recordsMatched: js.UndefOr[StatsValue] = js.native
  /**
    * The total number of log events scanned during the query.
    */
  var recordsScanned: js.UndefOr[StatsValue] = js.native
}

object QueryStatistics {
  @scala.inline
  def apply(): QueryStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStatistics]
  }
  @scala.inline
  implicit class QueryStatisticsOps[Self <: QueryStatistics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytesScanned(value: StatsValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesScanned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesScanned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesScanned")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordsMatched(value: StatsValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsMatched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordsMatched: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsMatched")(js.undefined)
        ret
    }
    @scala.inline
    def withRecordsScanned(value: StatsValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsScanned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecordsScanned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordsScanned")(js.undefined)
        ret
    }
  }
  
}


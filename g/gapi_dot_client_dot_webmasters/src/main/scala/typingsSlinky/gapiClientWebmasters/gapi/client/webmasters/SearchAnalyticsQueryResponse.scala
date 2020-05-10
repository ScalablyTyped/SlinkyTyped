package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAnalyticsQueryResponse extends js.Object {
  /** How the results were aggregated. */
  var responseAggregationType: js.UndefOr[String] = js.native
  /** A list of rows grouped by the key values in the order given in the query. */
  var rows: js.UndefOr[js.Array[ApiDataRow]] = js.native
}

object SearchAnalyticsQueryResponse {
  @scala.inline
  def apply(): SearchAnalyticsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAnalyticsQueryResponse]
  }
  @scala.inline
  implicit class SearchAnalyticsQueryResponseOps[Self <: SearchAnalyticsQueryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseAggregationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseAggregationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseAggregationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseAggregationType")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: js.Array[ApiDataRow]): Self = {
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
  }
  
}


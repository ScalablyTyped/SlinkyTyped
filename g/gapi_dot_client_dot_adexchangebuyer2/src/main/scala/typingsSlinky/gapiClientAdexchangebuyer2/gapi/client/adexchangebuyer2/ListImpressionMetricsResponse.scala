package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImpressionMetricsResponse extends js.Object {
  /** List of rows, each containing a set of impression metrics. */
  var impressionMetricsRows: js.UndefOr[js.Array[ImpressionMetricsRow]] = js.native
  /**
    * A token to retrieve the next page of results.
    * Pass this value in the
    * ListImpressionMetricsRequest.pageToken
    * field in the subsequent call to the
    * accounts.filterSets.impressionMetrics.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object ListImpressionMetricsResponse {
  @scala.inline
  def apply(): ListImpressionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImpressionMetricsResponse]
  }
  @scala.inline
  implicit class ListImpressionMetricsResponseOps[Self <: ListImpressionMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImpressionMetricsRows(value: js.Array[ImpressionMetricsRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionMetricsRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpressionMetricsRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impressionMetricsRows")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}


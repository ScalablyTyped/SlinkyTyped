package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing the metrics that are measured in number of
  * bids.
  */
@js.native
trait SchemaListBidMetricsResponse extends js.Object {
  /**
    * List of rows, each containing a set of bid metrics.
    */
  var bidMetricsRows: js.UndefOr[js.Array[SchemaBidMetricsRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListBidMetricsRequest.pageToken field in the subsequent call to the
    * bidMetrics.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListBidMetricsResponse {
  @scala.inline
  def apply(): SchemaListBidMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBidMetricsResponse]
  }
  @scala.inline
  implicit class SchemaListBidMetricsResponseOps[Self <: SchemaListBidMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBidMetricsRows(value: js.Array[SchemaBidMetricsRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidMetricsRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBidMetricsRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bidMetricsRows")(js.undefined)
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


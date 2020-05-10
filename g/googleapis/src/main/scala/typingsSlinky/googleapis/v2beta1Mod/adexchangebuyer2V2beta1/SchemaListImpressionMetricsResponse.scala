package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing the metrics that are measured in number of
  * impressions.
  */
@js.native
trait SchemaListImpressionMetricsResponse extends js.Object {
  /**
    * List of rows, each containing a set of impression metrics.
    */
  var impressionMetricsRows: js.UndefOr[js.Array[SchemaImpressionMetricsRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListImpressionMetricsRequest.pageToken field in the subsequent call to
    * the impressionMetrics.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListImpressionMetricsResponse {
  @scala.inline
  def apply(): SchemaListImpressionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListImpressionMetricsResponse]
  }
  @scala.inline
  implicit class SchemaListImpressionMetricsResponseOps[Self <: SchemaListImpressionMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImpressionMetricsRows(value: js.Array[SchemaImpressionMetricsRow]): Self = {
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


package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCrawlerMetricsResponse extends js.Object {
  /**
    * A list of metrics for the specified crawler.
    */
  var CrawlerMetricsList: js.UndefOr[typingsSlinky.awsSdk.glueMod.CrawlerMetricsList] = js.native
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetCrawlerMetricsResponse {
  @scala.inline
  def apply(): GetCrawlerMetricsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlerMetricsResponse]
  }
  @scala.inline
  implicit class GetCrawlerMetricsResponseOps[Self <: GetCrawlerMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrawlerMetricsList(value: CrawlerMetricsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerMetricsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlerMetricsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerMetricsList")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}


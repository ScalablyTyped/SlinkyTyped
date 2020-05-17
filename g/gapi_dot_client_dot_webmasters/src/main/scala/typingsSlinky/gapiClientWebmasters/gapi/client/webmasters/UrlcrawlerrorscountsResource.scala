package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientWebmasters.anon.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlcrawlerrorscountsResource extends js.Object {
  /** Retrieves a time series of the number of URL crawl errors per error category and platform. */
  def query(request: Category): Request[UrlCrawlErrorsCountsQueryResponse] = js.native
}

object UrlcrawlerrorscountsResource {
  @scala.inline
  def apply(query: Category => Request[UrlCrawlErrorsCountsQueryResponse]): UrlcrawlerrorscountsResource = {
    val __obj = js.Dynamic.literal(query = js.Any.fromFunction1(query))
    __obj.asInstanceOf[UrlcrawlerrorscountsResource]
  }
  @scala.inline
  implicit class UrlcrawlerrorscountsResourceOps[Self <: UrlcrawlerrorscountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: Category => Request[UrlCrawlErrorsCountsQueryResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


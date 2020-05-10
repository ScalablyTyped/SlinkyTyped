package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlCrawlErrorsCountsQueryResponse extends js.Object {
  /** The time series of the number of URL crawl errors per error category and platform. */
  var countPerTypes: js.UndefOr[js.Array[UrlCrawlErrorCountsPerType]] = js.native
}

object UrlCrawlErrorsCountsQueryResponse {
  @scala.inline
  def apply(): UrlCrawlErrorsCountsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlCrawlErrorsCountsQueryResponse]
  }
  @scala.inline
  implicit class UrlCrawlErrorsCountsQueryResponseOps[Self <: UrlCrawlErrorsCountsQueryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountPerTypes(value: js.Array[UrlCrawlErrorCountsPerType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countPerTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountPerTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countPerTypes")(js.undefined)
        ret
    }
  }
  
}


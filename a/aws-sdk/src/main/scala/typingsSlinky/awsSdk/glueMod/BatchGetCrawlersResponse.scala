package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetCrawlersResponse extends js.Object {
  /**
    * A list of crawler definitions.
    */
  var Crawlers: js.UndefOr[CrawlerList] = js.native
  /**
    * A list of names of crawlers that were not found.
    */
  var CrawlersNotFound: js.UndefOr[CrawlerNameList] = js.native
}

object BatchGetCrawlersResponse {
  @scala.inline
  def apply(): BatchGetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCrawlersResponse]
  }
  @scala.inline
  implicit class BatchGetCrawlersResponseOps[Self <: BatchGetCrawlersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrawlers(value: CrawlerList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crawlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crawlers")(js.undefined)
        ret
    }
    @scala.inline
    def withCrawlersNotFound(value: CrawlerNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlersNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlersNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlersNotFound")(js.undefined)
        ret
    }
  }
  
}


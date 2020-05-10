package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerNodeDetails extends js.Object {
  /**
    * A list of crawls represented by the crawl node.
    */
  var Crawls: js.UndefOr[CrawlList] = js.native
}

object CrawlerNodeDetails {
  @scala.inline
  def apply(): CrawlerNodeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerNodeDetails]
  }
  @scala.inline
  implicit class CrawlerNodeDetailsOps[Self <: CrawlerNodeDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrawls(value: CrawlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crawls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crawls")(js.undefined)
        ret
    }
  }
  
}


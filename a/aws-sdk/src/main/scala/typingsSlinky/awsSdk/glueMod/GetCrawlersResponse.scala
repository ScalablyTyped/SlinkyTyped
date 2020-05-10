package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCrawlersResponse extends js.Object {
  /**
    * A list of crawler metadata.
    */
  var Crawlers: js.UndefOr[CrawlerList] = js.native
  /**
    * A continuation token, if the returned list has not reached the end of those defined in this customer account.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetCrawlersResponse {
  @scala.inline
  def apply(): GetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlersResponse]
  }
  @scala.inline
  implicit class GetCrawlersResponseOps[Self <: GetCrawlersResponse] (val x: Self) extends AnyVal {
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


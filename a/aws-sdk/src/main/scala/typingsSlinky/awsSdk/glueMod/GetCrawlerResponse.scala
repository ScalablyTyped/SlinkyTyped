package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCrawlerResponse extends js.Object {
  /**
    * The metadata for the specified crawler.
    */
  var Crawler: js.UndefOr[typingsSlinky.awsSdk.glueMod.Crawler] = js.native
}

object GetCrawlerResponse {
  @scala.inline
  def apply(): GetCrawlerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCrawlerResponse]
  }
  @scala.inline
  implicit class GetCrawlerResponseOps[Self <: GetCrawlerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrawler(value: Crawler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crawler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Crawler")(js.undefined)
        ret
    }
  }
  
}


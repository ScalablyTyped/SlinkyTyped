package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of crawl error samples.
  */
@js.native
trait SchemaUrlCrawlErrorsSamplesListResponse extends js.Object {
  /**
    * Information about the sample URL and its crawl error.
    */
  var urlCrawlErrorSample: js.UndefOr[js.Array[SchemaUrlCrawlErrorsSample]] = js.native
}

object SchemaUrlCrawlErrorsSamplesListResponse {
  @scala.inline
  def apply(): SchemaUrlCrawlErrorsSamplesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorsSamplesListResponse]
  }
  @scala.inline
  implicit class SchemaUrlCrawlErrorsSamplesListResponseOps[Self <: SchemaUrlCrawlErrorsSamplesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrlCrawlErrorSample(value: js.Array[SchemaUrlCrawlErrorsSample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlCrawlErrorSample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlCrawlErrorSample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlCrawlErrorSample")(js.undefined)
        ret
    }
  }
  
}


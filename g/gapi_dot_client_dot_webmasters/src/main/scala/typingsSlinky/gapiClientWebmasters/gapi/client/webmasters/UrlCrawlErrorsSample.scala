package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlCrawlErrorsSample extends js.Object {
  /** The time the error was first detected, in RFC 3339 format. */
  var first_detected: js.UndefOr[String] = js.native
  /** The time when the URL was last crawled, in RFC 3339 format. */
  var last_crawled: js.UndefOr[String] = js.native
  /** The URL of an error, relative to the site. */
  var pageUrl: js.UndefOr[String] = js.native
  /** The HTTP response code, if any. */
  var responseCode: js.UndefOr[Double] = js.native
  /** Additional details about the URL, set only when calling get(). */
  var urlDetails: js.UndefOr[UrlSampleDetails] = js.native
}

object UrlCrawlErrorsSample {
  @scala.inline
  def apply(): UrlCrawlErrorsSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlCrawlErrorsSample]
  }
  @scala.inline
  implicit class UrlCrawlErrorsSampleOps[Self <: UrlCrawlErrorsSample] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirst_detected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_detected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst_detected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_detected")(js.undefined)
        ret
    }
    @scala.inline
    def withLast_crawled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_crawled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast_crawled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_crawled")(js.undefined)
        ret
    }
    @scala.inline
    def withPageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlDetails(value: UrlSampleDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlDetails")(js.undefined)
        ret
    }
  }
  
}


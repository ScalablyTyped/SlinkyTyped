package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientWebmasters.anon.Oauthtoken
import typingsSlinky.gapiClientWebmasters.anon.Platform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlcrawlerrorssamplesResource extends js.Object {
  /** Retrieves details about crawl errors for a site's sample URL. */
  def get(request: Oauthtoken): Request[UrlCrawlErrorsSample] = js.native
  /** Lists a site's sample URLs for the specified crawl error category and platform. */
  def list(request: Platform): Request[UrlCrawlErrorsSamplesListResponse] = js.native
  /** Marks the provided site's sample URL as fixed, and removes it from the samples list. */
  def markAsFixed(request: Oauthtoken): Request[Unit] = js.native
}

object UrlcrawlerrorssamplesResource {
  @scala.inline
  def apply(
    get: Oauthtoken => Request[UrlCrawlErrorsSample],
    list: Platform => Request[UrlCrawlErrorsSamplesListResponse],
    markAsFixed: Oauthtoken => Request[Unit]
  ): UrlcrawlerrorssamplesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), markAsFixed = js.Any.fromFunction1(markAsFixed))
    __obj.asInstanceOf[UrlcrawlerrorssamplesResource]
  }
  @scala.inline
  implicit class UrlcrawlerrorssamplesResourceOps[Self <: UrlcrawlerrorssamplesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: Oauthtoken => Request[UrlCrawlErrorsSample]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Platform => Request[UrlCrawlErrorsSamplesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMarkAsFixed(value: Oauthtoken => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markAsFixed")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientWebmasters.AnonFeedpath
import typingsSlinky.gapiClientWebmasters.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitemapsResource extends js.Object {
  /** Deletes a sitemap from this site. */
  def delete(request: AnonFeedpath): Request_[Unit] = js.native
  /** Retrieves information about a specific sitemap. */
  def get(request: AnonFeedpath): Request_[WmxSitemap] = js.native
  /** Lists the sitemaps-entries submitted for this site, or included in the sitemap index file (if sitemapIndex is specified in the request). */
  def list(request: AnonFields): Request_[SitemapsListResponse] = js.native
  /** Submits a sitemap for a site. */
  def submit(request: AnonFeedpath): Request_[Unit] = js.native
}

object SitemapsResource {
  @scala.inline
  def apply(
    delete: AnonFeedpath => Request_[Unit],
    get: AnonFeedpath => Request_[WmxSitemap],
    list: AnonFields => Request_[SitemapsListResponse],
    submit: AnonFeedpath => Request_[Unit]
  ): SitemapsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), submit = js.Any.fromFunction1(submit))
    __obj.asInstanceOf[SitemapsResource]
  }
  @scala.inline
  implicit class SitemapsResourceOps[Self <: SitemapsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonFeedpath => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFeedpath => Request_[WmxSitemap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[SitemapsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubmit(value: AnonFeedpath => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


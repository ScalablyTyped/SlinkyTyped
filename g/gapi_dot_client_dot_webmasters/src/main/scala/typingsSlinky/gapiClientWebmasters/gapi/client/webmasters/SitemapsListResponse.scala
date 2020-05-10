package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitemapsListResponse extends js.Object {
  /** Contains detailed information about a specific URL submitted as a sitemap. */
  var sitemap: js.UndefOr[js.Array[WmxSitemap]] = js.native
}

object SitemapsListResponse {
  @scala.inline
  def apply(): SitemapsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitemapsListResponse]
  }
  @scala.inline
  implicit class SitemapsListResponseOps[Self <: SitemapsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSitemap(value: js.Array[WmxSitemap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSitemap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sitemap")(js.undefined)
        ret
    }
  }
  
}


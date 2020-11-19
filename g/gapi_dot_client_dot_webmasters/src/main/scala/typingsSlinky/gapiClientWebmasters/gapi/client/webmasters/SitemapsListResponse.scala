package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSitemapVarargs(value: WmxSitemap*): Self = this.set("sitemap", js.Array(value :_*))
    
    @scala.inline
    def setSitemap(value: js.Array[WmxSitemap]): Self = this.set("sitemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSitemap: Self = this.set("sitemap", js.undefined)
  }
}

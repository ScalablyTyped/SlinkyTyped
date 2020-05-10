package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SitesListResponse extends js.Object {
  /** Contains permission level information about a Search Console site. For more information, see Permissions in Search Console. */
  var siteEntry: js.UndefOr[js.Array[WmxSite]] = js.native
}

object SitesListResponse {
  @scala.inline
  def apply(): SitesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SitesListResponse]
  }
  @scala.inline
  implicit class SitesListResponseOps[Self <: SitesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSiteEntry(value: js.Array[WmxSite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteEntry")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WmxSite extends js.Object {
  /** The user's permission level for the site. */
  var permissionLevel: js.UndefOr[String] = js.native
  /** The URL of the site. */
  var siteUrl: js.UndefOr[String] = js.native
}

object WmxSite {
  @scala.inline
  def apply(): WmxSite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WmxSite]
  }
  @scala.inline
  implicit class WmxSiteOps[Self <: WmxSite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPermissionLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissionLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissionLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteUrl")(js.undefined)
        ret
    }
  }
  
}


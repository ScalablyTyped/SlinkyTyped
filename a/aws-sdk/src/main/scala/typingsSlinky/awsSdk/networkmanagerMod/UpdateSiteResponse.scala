package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSiteResponse extends js.Object {
  /**
    * Information about the site.
    */
  var Site: js.UndefOr[typingsSlinky.awsSdk.networkmanagerMod.Site] = js.native
}

object UpdateSiteResponse {
  @scala.inline
  def apply(): UpdateSiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSiteResponse]
  }
  @scala.inline
  implicit class UpdateSiteResponseOps[Self <: UpdateSiteResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSite(value: Site): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Site")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Site")(js.undefined)
        ret
    }
  }
  
}


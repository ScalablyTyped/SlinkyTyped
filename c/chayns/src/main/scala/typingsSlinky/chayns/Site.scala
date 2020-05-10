package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.findSite()
@js.native
trait Site extends js.Object {
  var appstoreName: String = js.native
  var facebookId: String = js.native
  var locationId: Double = js.native
  var siteId: String = js.native
}

object Site {
  @scala.inline
  def apply(appstoreName: String, facebookId: String, locationId: Double, siteId: String): Site = {
    val __obj = js.Dynamic.literal(appstoreName = appstoreName.asInstanceOf[js.Any], facebookId = facebookId.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any], siteId = siteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
  @scala.inline
  implicit class SiteOps[Self <: Site] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppstoreName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appstoreName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacebookId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facebookId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


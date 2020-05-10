package typingsSlinky.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSiteurl extends js.Object {
  var site_url: String = js.native
}

object AnonSiteurl {
  @scala.inline
  def apply(site_url: String): AnonSiteurl = {
    val __obj = js.Dynamic.literal(site_url = site_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSiteurl]
  }
  @scala.inline
  implicit class AnonSiteurlOps[Self <: AnonSiteurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSite_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("site_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


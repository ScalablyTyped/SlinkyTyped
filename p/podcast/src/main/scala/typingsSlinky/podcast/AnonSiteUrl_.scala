package typingsSlinky.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSiteUrl_ extends js.Object {
  var siteUrl: String = js.native
}

object AnonSiteUrl_ {
  @scala.inline
  def apply(siteUrl: String): AnonSiteUrl_ = {
    val __obj = js.Dynamic.literal(siteUrl = siteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSiteUrl_]
  }
  @scala.inline
  implicit class AnonSiteUrl_Ops[Self <: AnonSiteUrl_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


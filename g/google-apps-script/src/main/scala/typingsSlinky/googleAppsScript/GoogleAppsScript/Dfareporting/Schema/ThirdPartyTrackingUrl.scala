package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThirdPartyTrackingUrl extends js.Object {
  var thirdPartyUrlType: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object ThirdPartyTrackingUrl {
  @scala.inline
  def apply(): ThirdPartyTrackingUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyTrackingUrl]
  }
  @scala.inline
  implicit class ThirdPartyTrackingUrlOps[Self <: ThirdPartyTrackingUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThirdPartyUrlType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyUrlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThirdPartyUrlType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyUrlType")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}


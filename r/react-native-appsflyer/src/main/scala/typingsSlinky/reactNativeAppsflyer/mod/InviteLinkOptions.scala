package typingsSlinky.reactNativeAppsflyer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteLinkOptions extends js.Object {
  var baseDeeplink: js.UndefOr[String] = js.native
  var campaign: js.UndefOr[String] = js.native
  var channel: js.UndefOr[String] = js.native
  var customerID: js.UndefOr[String] = js.native
  var deeplinkPath: js.UndefOr[String] = js.native
  var referrerImageUrl: js.UndefOr[String] = js.native
  var referrerName: js.UndefOr[String] = js.native
  var userParams: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object InviteLinkOptions {
  @scala.inline
  def apply(): InviteLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteLinkOptions]
  }
  @scala.inline
  implicit class InviteLinkOptionsOps[Self <: InviteLinkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseDeeplink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDeeplink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseDeeplink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseDeeplink")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaign")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerID")(js.undefined)
        ret
    }
    @scala.inline
    def withDeeplinkPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deeplinkPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeeplinkPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deeplinkPath")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrerImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrerImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerImageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withReferrerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferrerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrerName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserParams(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userParams")(js.undefined)
        ret
    }
  }
  
}


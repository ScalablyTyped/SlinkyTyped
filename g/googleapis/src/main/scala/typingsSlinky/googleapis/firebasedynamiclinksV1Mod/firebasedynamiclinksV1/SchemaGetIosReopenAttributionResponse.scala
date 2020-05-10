package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for iSDK to get reopen attribution for app universal link open
  * deeplinking. This endpoint is meant for only iOS requests.
  */
@js.native
trait SchemaGetIosReopenAttributionResponse extends js.Object {
  /**
    * The deep-link attributed the app universal link open. For both regular
    * FDL links and invite FDL links.
    */
  var deepLink: js.UndefOr[String] = js.native
  /**
    * Optional invitation ID, for only invite typed requested FDL links.
    */
  var invitationId: js.UndefOr[String] = js.native
  /**
    * FDL input value of the &quot;&amp;imv=&quot; parameter, minimum app
    * version to be returned to Google Firebase SDK running on iOS-9.
    */
  var iosMinAppVersion: js.UndefOr[String] = js.native
  /**
    * The entire FDL, expanded from a short link. It is the same as the
    * requested_link, if it is long.
    */
  var resolvedLink: js.UndefOr[String] = js.native
  /**
    * Scion campaign value to be propagated by iSDK to Scion at app-reopen.
    */
  var utmCampaign: js.UndefOr[String] = js.native
  /**
    * Scion medium value to be propagated by iSDK to Scion at app-reopen.
    */
  var utmMedium: js.UndefOr[String] = js.native
  /**
    * Scion source value to be propagated by iSDK to Scion at app-reopen.
    */
  var utmSource: js.UndefOr[String] = js.native
}

object SchemaGetIosReopenAttributionResponse {
  @scala.inline
  def apply(): SchemaGetIosReopenAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIosReopenAttributionResponse]
  }
  @scala.inline
  implicit class SchemaGetIosReopenAttributionResponseOps[Self <: SchemaGetIosReopenAttributionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeepLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLink")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationId")(js.undefined)
        ret
    }
    @scala.inline
    def withIosMinAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosMinAppVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosMinAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosMinAppVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedLink")(js.undefined)
        ret
    }
    @scala.inline
    def withUtmCampaign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmCampaign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtmCampaign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmCampaign")(js.undefined)
        ret
    }
    @scala.inline
    def withUtmMedium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtmMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmMedium")(js.undefined)
        ret
    }
    @scala.inline
    def withUtmSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtmSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmSource")(js.undefined)
        ret
    }
  }
  
}


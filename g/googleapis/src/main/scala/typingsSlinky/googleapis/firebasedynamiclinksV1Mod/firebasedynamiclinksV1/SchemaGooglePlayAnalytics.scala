package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for Google Play Campaign Measurements. [Learn
  * more](https://developers.google.com/analytics/devguides/collection/android/v4/campaigns#campaign-params)
  */
@js.native
trait SchemaGooglePlayAnalytics extends js.Object {
  /**
    * [AdWords autotagging
    * parameter](https://support.google.com/analytics/answer/1033981?hl=en);
    * used to measure Google AdWords ads. This value is generated dynamically
    * and should never be modified.
    */
  var gclid: js.UndefOr[String] = js.native
  /**
    * Campaign name; used for keyword analysis to identify a specific product
    * promotion or strategic campaign.
    */
  var utmCampaign: js.UndefOr[String] = js.native
  /**
    * Campaign content; used for A/B testing and content-targeted ads to
    * differentiate ads or links that point to the same URL.
    */
  var utmContent: js.UndefOr[String] = js.native
  /**
    * Campaign medium; used to identify a medium such as email or
    * cost-per-click.
    */
  var utmMedium: js.UndefOr[String] = js.native
  /**
    * Campaign source; used to identify a search engine, newsletter, or other
    * source.
    */
  var utmSource: js.UndefOr[String] = js.native
  /**
    * Campaign term; used with paid search to supply the keywords for ads.
    */
  var utmTerm: js.UndefOr[String] = js.native
}

object SchemaGooglePlayAnalytics {
  @scala.inline
  def apply(): SchemaGooglePlayAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePlayAnalytics]
  }
  @scala.inline
  implicit class SchemaGooglePlayAnalyticsOps[Self <: SchemaGooglePlayAnalytics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGclid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gclid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGclid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gclid")(js.undefined)
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
    def withUtmContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtmContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmContent")(js.undefined)
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
    @scala.inline
    def withUtmTerm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtmTerm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmTerm")(js.undefined)
        ret
    }
  }
  
}


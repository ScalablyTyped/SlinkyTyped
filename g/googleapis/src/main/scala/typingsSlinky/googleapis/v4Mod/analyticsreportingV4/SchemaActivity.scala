package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Activity represents data for an activity of a user. Note that an
  * Activity is different from a hit. A hit might result in multiple
  * Activity&#39;s. For example, if a hit includes a transaction and a goal
  * completion, there will be two Activity protos for this hit, one for
  * ECOMMERCE and one for GOAL. Conversely, multiple hits can also construct
  * one Activity. In classic e-commerce, data for one transaction might be sent
  * through multiple hits. These hits will be merged into one ECOMMERCE
  * Activity.
  */
@js.native
trait SchemaActivity extends js.Object {
  /**
    * Timestamp of the activity.
    */
  var activityTime: js.UndefOr[String] = js.native
  /**
    * Type of this activity.
    */
  var activityType: js.UndefOr[String] = js.native
  /**
    * This will be set if `activity_type` equals `SCREEN_VIEW`.
    */
  var appview: js.UndefOr[SchemaScreenviewData] = js.native
  /**
    * For manual campaign tracking, it is the value of the utm_campaign
    * campaign tracking parameter. For AdWords autotagging, it is the name(s)
    * of the online ad campaign(s) you use for the property. If you use
    * neither, its value is (not set).
    */
  var campaign: js.UndefOr[String] = js.native
  /**
    * The Channel Group associated with an end user&#39;s session for this View
    * (defined by the View&#39;s Channel Groupings).
    */
  var channelGrouping: js.UndefOr[String] = js.native
  /**
    * A list of all custom dimensions associated with this activity.
    */
  var customDimension: js.UndefOr[js.Array[SchemaCustomDimension]] = js.native
  /**
    * This will be set if `activity_type` equals `ECOMMERCE`.
    */
  var ecommerce: js.UndefOr[SchemaEcommerceData] = js.native
  /**
    * This field contains all the details pertaining to an event and will be
    * set if `activity_type` equals `EVENT`.
    */
  var event: js.UndefOr[SchemaEventData] = js.native
  /**
    * This field contains a list of all the goals that were reached in this
    * activity when `activity_type` equals `GOAL`.
    */
  var goals: js.UndefOr[SchemaGoalSetData] = js.native
  /**
    * The hostname from which the tracking request was made.
    */
  var hostname: js.UndefOr[String] = js.native
  /**
    * For manual campaign tracking, it is the value of the utm_term campaign
    * tracking parameter. For AdWords traffic, it contains the best matching
    * targeting criteria. For the display network, where multiple targeting
    * criteria could have caused the ad to show up, it returns the best
    * matching targeting criteria as selected by Ads. This could be
    * display_keyword, site placement, boomuserlist, user_interest, age, or
    * gender. Otherwise its value is (not set).
    */
  var keyword: js.UndefOr[String] = js.native
  /**
    * The first page in users&#39; sessions, or the landing page.
    */
  var landingPagePath: js.UndefOr[String] = js.native
  /**
    * The type of referrals. For manual campaign tracking, it is the value of
    * the utm_medium campaign tracking parameter. For AdWords autotagging, it
    * is cpc. If users came from a search engine detected by Google Analytics,
    * it is organic. If the referrer is not a search engine, it is referral. If
    * users came directly to the property and document.referrer is empty, its
    * value is (none).
    */
  var medium: js.UndefOr[String] = js.native
  /**
    * This will be set if `activity_type` equals `PAGEVIEW`. This field
    * contains all the details about the visitor and the page that was visited.
    */
  var pageview: js.UndefOr[SchemaPageviewData] = js.native
  /**
    * The source of referrals. For manual campaign tracking, it is the value of
    * the utm_source campaign tracking parameter. For AdWords autotagging, it
    * is google. If you use neither, it is the domain of the source (e.g.,
    * document.referrer) referring the users. It may also contain a port
    * address. If users arrived without a referrer, its value is (direct).
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaActivity {
  @scala.inline
  def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  @scala.inline
  implicit class SchemaActivityOps[Self <: SchemaActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivityTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityTime")(js.undefined)
        ret
    }
    @scala.inline
    def withActivityType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActivityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activityType")(js.undefined)
        ret
    }
    @scala.inline
    def withAppview(value: SchemaScreenviewData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appview")(js.undefined)
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
    def withChannelGrouping(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelGrouping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannelGrouping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelGrouping")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDimension(value: js.Array[SchemaCustomDimension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDimension")(js.undefined)
        ret
    }
    @scala.inline
    def withEcommerce(value: SchemaEcommerceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecommerce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcommerce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecommerce")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: SchemaEventData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withGoals(value: SchemaGoalSetData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goals")(js.undefined)
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(js.undefined)
        ret
    }
    @scala.inline
    def withLandingPagePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landingPagePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLandingPagePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("landingPagePath")(js.undefined)
        ret
    }
    @scala.inline
    def withMedium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(js.undefined)
        ret
    }
    @scala.inline
    def withPageview(value: SchemaPageviewData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageview")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}


package typingsSlinky.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Activity extends StObject {
  
  /**
    * Timestamp of the activity. If activities for a visit cross midnight and occur in two separate dates, then two sessions (one per date) share the session identifier. For example, say
    * session ID 113472 has activity within 2019-08-20, and session ID 243742 has activity within 2019-08-25 and 2019-08-26. Session ID 113472 is one session, and session ID 243742 is two
    * sessions.
    */
  var activityTime: js.UndefOr[String] = js.native
  
  /** Type of this activity. */
  var activityType: js.UndefOr[String] = js.native
  
  /** This will be set if `activity_type` equals `SCREEN_VIEW`. */
  var appview: js.UndefOr[ScreenviewData] = js.native
  
  /**
    * For manual campaign tracking, it is the value of the utm_campaign campaign tracking parameter. For AdWords autotagging, it is the name(s) of the online ad campaign(s) you use for
    * the property. If you use neither, its value is (not set).
    */
  var campaign: js.UndefOr[String] = js.native
  
  /** The Channel Group associated with an end user's session for this View (defined by the View's Channel Groupings). */
  var channelGrouping: js.UndefOr[String] = js.native
  
  /** A list of all custom dimensions associated with this activity. */
  var customDimension: js.UndefOr[js.Array[CustomDimension]] = js.native
  
  /** This will be set if `activity_type` equals `ECOMMERCE`. */
  var ecommerce: js.UndefOr[EcommerceData] = js.native
  
  /** This field contains all the details pertaining to an event and will be set if `activity_type` equals `EVENT`. */
  var event: js.UndefOr[EventData] = js.native
  
  /** This field contains a list of all the goals that were reached in this activity when `activity_type` equals `GOAL`. */
  var goals: js.UndefOr[GoalSetData] = js.native
  
  /** The hostname from which the tracking request was made. */
  var hostname: js.UndefOr[String] = js.native
  
  /**
    * For manual campaign tracking, it is the value of the utm_term campaign tracking parameter. For AdWords traffic, it contains the best matching targeting criteria. For the display
    * network, where multiple targeting criteria could have caused the ad to show up, it returns the best matching targeting criteria as selected by Ads. This could be display_keyword,
    * site placement, boomuserlist, user_interest, age, or gender. Otherwise its value is (not set).
    */
  var keyword: js.UndefOr[String] = js.native
  
  /** The first page in users' sessions, or the landing page. */
  var landingPagePath: js.UndefOr[String] = js.native
  
  /**
    * The type of referrals. For manual campaign tracking, it is the value of the utm_medium campaign tracking parameter. For AdWords autotagging, it is cpc. If users came from a search
    * engine detected by Google Analytics, it is organic. If the referrer is not a search engine, it is referral. If users came directly to the property and document.referrer is empty,
    * its value is (none).
    */
  var medium: js.UndefOr[String] = js.native
  
  /** This will be set if `activity_type` equals `PAGEVIEW`. This field contains all the details about the visitor and the page that was visited. */
  var pageview: js.UndefOr[PageviewData] = js.native
  
  /**
    * The source of referrals. For manual campaign tracking, it is the value of the utm_source campaign tracking parameter. For AdWords autotagging, it is google. If you use neither, it
    * is the domain of the source (e.g., document.referrer) referring the users. It may also contain a port address. If users arrived without a referrer, its value is (direct).
    */
  var source: js.UndefOr[String] = js.native
}
object Activity {
  
  @scala.inline
  def apply(): Activity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Activity]
  }
  
  @scala.inline
  implicit class ActivityMutableBuilder[Self <: Activity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityTime(value: String): Self = StObject.set(x, "activityTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTimeUndefined: Self = StObject.set(x, "activityTime", js.undefined)
    
    @scala.inline
    def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    @scala.inline
    def setAppview(value: ScreenviewData): Self = StObject.set(x, "appview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppviewUndefined: Self = StObject.set(x, "appview", js.undefined)
    
    @scala.inline
    def setCampaign(value: String): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
    
    @scala.inline
    def setChannelGrouping(value: String): Self = StObject.set(x, "channelGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelGroupingUndefined: Self = StObject.set(x, "channelGrouping", js.undefined)
    
    @scala.inline
    def setCustomDimension(value: js.Array[CustomDimension]): Self = StObject.set(x, "customDimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDimensionUndefined: Self = StObject.set(x, "customDimension", js.undefined)
    
    @scala.inline
    def setCustomDimensionVarargs(value: CustomDimension*): Self = StObject.set(x, "customDimension", js.Array(value :_*))
    
    @scala.inline
    def setEcommerce(value: EcommerceData): Self = StObject.set(x, "ecommerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcommerceUndefined: Self = StObject.set(x, "ecommerce", js.undefined)
    
    @scala.inline
    def setEvent(value: EventData): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    @scala.inline
    def setGoals(value: GoalSetData): Self = StObject.set(x, "goals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoalsUndefined: Self = StObject.set(x, "goals", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    @scala.inline
    def setLandingPagePath(value: String): Self = StObject.set(x, "landingPagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandingPagePathUndefined: Self = StObject.set(x, "landingPagePath", js.undefined)
    
    @scala.inline
    def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    @scala.inline
    def setPageview(value: PageviewData): Self = StObject.set(x, "pageview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageviewUndefined: Self = StObject.set(x, "pageview", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}

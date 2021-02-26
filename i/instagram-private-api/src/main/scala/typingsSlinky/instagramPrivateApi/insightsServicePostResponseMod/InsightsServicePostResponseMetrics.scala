package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServicePostResponseMetrics extends StObject {
  
  var hashtags_impressions: InsightsServicePostResponseHashtagsImpressions = js.native
  
  var impression_count: Double = js.native
  
  var impressions: InsightsServicePostResponseImpressions = js.native
  
  var owner_account_follows_count: Double = js.native
  
  var owner_profile_views_count: Double = js.native
  
  var profile_actions: InsightsServicePostResponseProfileActions = js.native
  
  var reach: InsightsServicePostResponseReach = js.native
  
  var reach_count: Double = js.native
  
  var share_count: InsightsServicePostResponseShareCount = js.native
}
object InsightsServicePostResponseMetrics {
  
  @scala.inline
  def apply(
    hashtags_impressions: InsightsServicePostResponseHashtagsImpressions,
    impression_count: Double,
    impressions: InsightsServicePostResponseImpressions,
    owner_account_follows_count: Double,
    owner_profile_views_count: Double,
    profile_actions: InsightsServicePostResponseProfileActions,
    reach: InsightsServicePostResponseReach,
    reach_count: Double,
    share_count: InsightsServicePostResponseShareCount
  ): InsightsServicePostResponseMetrics = {
    val __obj = js.Dynamic.literal(hashtags_impressions = hashtags_impressions.asInstanceOf[js.Any], impression_count = impression_count.asInstanceOf[js.Any], impressions = impressions.asInstanceOf[js.Any], owner_account_follows_count = owner_account_follows_count.asInstanceOf[js.Any], owner_profile_views_count = owner_profile_views_count.asInstanceOf[js.Any], profile_actions = profile_actions.asInstanceOf[js.Any], reach = reach.asInstanceOf[js.Any], reach_count = reach_count.asInstanceOf[js.Any], share_count = share_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseMetrics]
  }
  
  @scala.inline
  implicit class InsightsServicePostResponseMetricsMutableBuilder[Self <: InsightsServicePostResponseMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashtags_impressions(value: InsightsServicePostResponseHashtagsImpressions): Self = StObject.set(x, "hashtags_impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpression_count(value: Double): Self = StObject.set(x, "impression_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressions(value: InsightsServicePostResponseImpressions): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner_account_follows_count(value: Double): Self = StObject.set(x, "owner_account_follows_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner_profile_views_count(value: Double): Self = StObject.set(x, "owner_profile_views_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile_actions(value: InsightsServicePostResponseProfileActions): Self = StObject.set(x, "profile_actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReach(value: InsightsServicePostResponseReach): Self = StObject.set(x, "reach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReach_count(value: Double): Self = StObject.set(x, "reach_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShare_count(value: InsightsServicePostResponseShareCount): Self = StObject.set(x, "share_count", value.asInstanceOf[js.Any])
  }
}

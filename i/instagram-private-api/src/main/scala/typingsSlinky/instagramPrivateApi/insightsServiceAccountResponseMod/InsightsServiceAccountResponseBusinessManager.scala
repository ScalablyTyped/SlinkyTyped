package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightsServiceAccountResponseBusinessManager extends StObject {
  
  var account_insights_unit: InsightsServiceAccountResponseAccountInsightsUnit = js.native
  
  var account_summary_unit: InsightsServiceAccountResponseAccountSummaryUnit = js.native
  
  var followers_unit: InsightsServiceAccountResponseFollowersUnit = js.native
  
  var promotions_unit: InsightsServiceAccountResponsePromotionsUnit = js.native
  
  var status: InsightsServiceAccountResponseStatus = js.native
  
  var stories_unit: InsightsServiceAccountResponseStoriesUnit = js.native
  
  var top_posts_unit: InsightsServiceAccountResponseTopPostsUnit = js.native
}
object InsightsServiceAccountResponseBusinessManager {
  
  @scala.inline
  def apply(
    account_insights_unit: InsightsServiceAccountResponseAccountInsightsUnit,
    account_summary_unit: InsightsServiceAccountResponseAccountSummaryUnit,
    followers_unit: InsightsServiceAccountResponseFollowersUnit,
    promotions_unit: InsightsServiceAccountResponsePromotionsUnit,
    status: InsightsServiceAccountResponseStatus,
    stories_unit: InsightsServiceAccountResponseStoriesUnit,
    top_posts_unit: InsightsServiceAccountResponseTopPostsUnit
  ): InsightsServiceAccountResponseBusinessManager = {
    val __obj = js.Dynamic.literal(account_insights_unit = account_insights_unit.asInstanceOf[js.Any], account_summary_unit = account_summary_unit.asInstanceOf[js.Any], followers_unit = followers_unit.asInstanceOf[js.Any], promotions_unit = promotions_unit.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], stories_unit = stories_unit.asInstanceOf[js.Any], top_posts_unit = top_posts_unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseBusinessManager]
  }
  
  @scala.inline
  implicit class InsightsServiceAccountResponseBusinessManagerMutableBuilder[Self <: InsightsServiceAccountResponseBusinessManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount_insights_unit(value: InsightsServiceAccountResponseAccountInsightsUnit): Self = StObject.set(x, "account_insights_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount_summary_unit(value: InsightsServiceAccountResponseAccountSummaryUnit): Self = StObject.set(x, "account_summary_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowers_unit(value: InsightsServiceAccountResponseFollowersUnit): Self = StObject.set(x, "followers_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotions_unit(value: InsightsServiceAccountResponsePromotionsUnit): Self = StObject.set(x, "promotions_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: InsightsServiceAccountResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStories_unit(value: InsightsServiceAccountResponseStoriesUnit): Self = StObject.set(x, "stories_unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_posts_unit(value: InsightsServiceAccountResponseTopPostsUnit): Self = StObject.set(x, "top_posts_unit", value.asInstanceOf[js.Any])
  }
}

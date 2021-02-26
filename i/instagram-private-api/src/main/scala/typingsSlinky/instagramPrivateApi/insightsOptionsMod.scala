package typingsSlinky.instagramPrivateApi

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ALL
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.BIO_LINK_CLICK
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.CALL
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.CAROUSEL_V2
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.COMMENT_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.EMAIL
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ENGAGEMENT_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.FOLLOW
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.GET_DIRECTIONS
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.IMAGE
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.IMPRESSION_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.LIKE_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ONE_MONTH
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ONE_WEEK
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.ONE_YEAR
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.PROFILE_VIEW
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.REACH_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.SAVE_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.SHARE_COUNT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.SHOPPING
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.SIX_MONTHS
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.TEXT
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.THREE_MONTHS
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.TWO_YEARS
import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.VIDEO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insightsOptionsMod {
  
  @js.native
  trait AccountInsightsOptions extends StObject {
    
    var accessToken: js.UndefOr[String] = js.native
    
    var activityTab: js.UndefOr[Boolean] = js.native
    
    var audienceTab: js.UndefOr[Boolean] = js.native
    
    var contentTab: js.UndefOr[Boolean] = js.native
    
    var gridMediaSize: js.UndefOr[Double] = js.native
    
    var userId: js.UndefOr[String] = js.native
  }
  object AccountInsightsOptions {
    
    @scala.inline
    def apply(): AccountInsightsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountInsightsOptions]
    }
    
    @scala.inline
    implicit class AccountInsightsOptionsMutableBuilder[Self <: AccountInsightsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setActivityTab(value: Boolean): Self = StObject.set(x, "activityTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityTabUndefined: Self = StObject.set(x, "activityTab", js.undefined)
      
      @scala.inline
      def setAudienceTab(value: Boolean): Self = StObject.set(x, "audienceTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceTabUndefined: Self = StObject.set(x, "audienceTab", js.undefined)
      
      @scala.inline
      def setContentTab(value: Boolean): Self = StObject.set(x, "contentTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTabUndefined: Self = StObject.set(x, "contentTab", js.undefined)
      
      @scala.inline
      def setGridMediaSize(value: Double): Self = StObject.set(x, "gridMediaSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridMediaSizeUndefined: Self = StObject.set(x, "gridMediaSize", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  @js.native
  trait PostsInsightsFeedOptions extends StObject {
    
    var dataOrdering: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK = js.native
    
    var postType: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING = js.native
    
    var timeframe: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS = js.native
  }
  object PostsInsightsFeedOptions {
    
    @scala.inline
    def apply(
      dataOrdering: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK,
      postType: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING,
      timeframe: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS
    ): PostsInsightsFeedOptions = {
      val __obj = js.Dynamic.literal(dataOrdering = dataOrdering.asInstanceOf[js.Any], postType = postType.asInstanceOf[js.Any], timeframe = timeframe.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostsInsightsFeedOptions]
    }
    
    @scala.inline
    implicit class PostsInsightsFeedOptionsMutableBuilder[Self <: PostsInsightsFeedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataOrdering(
        value: CALL | COMMENT_COUNT | EMAIL | ENGAGEMENT_COUNT | FOLLOW | GET_DIRECTIONS | IMPRESSION_COUNT | LIKE_COUNT | PROFILE_VIEW | REACH_COUNT | SAVE_COUNT | SHARE_COUNT | TEXT | BIO_LINK_CLICK
      ): Self = StObject.set(x, "dataOrdering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostType(value: ALL | IMAGE | VIDEO | CAROUSEL_V2 | SHOPPING): Self = StObject.set(x, "postType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeframe(value: ONE_WEEK | ONE_MONTH | THREE_MONTHS | SIX_MONTHS | ONE_YEAR | TWO_YEARS): Self = StObject.set(x, "timeframe", value.asInstanceOf[js.Any])
    }
  }
}

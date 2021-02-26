package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesInsightsFeedResponseMod {
  
  @js.native
  trait StoriesInsightsFeedResponseBusinessManager extends StObject {
    
    var stories_unit: StoriesInsightsFeedResponseStoriesUnit = js.native
  }
  object StoriesInsightsFeedResponseBusinessManager {
    
    @scala.inline
    def apply(stories_unit: StoriesInsightsFeedResponseStoriesUnit): StoriesInsightsFeedResponseBusinessManager = {
      val __obj = js.Dynamic.literal(stories_unit = stories_unit.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseBusinessManager]
    }
    
    @scala.inline
    implicit class StoriesInsightsFeedResponseBusinessManagerMutableBuilder[Self <: StoriesInsightsFeedResponseBusinessManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStories_unit(value: StoriesInsightsFeedResponseStoriesUnit): Self = StObject.set(x, "stories_unit", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoriesInsightsFeedResponseData extends StObject {
    
    var user: StoriesInsightsFeedResponseUser = js.native
  }
  object StoriesInsightsFeedResponseData {
    
    @scala.inline
    def apply(user: StoriesInsightsFeedResponseUser): StoriesInsightsFeedResponseData = {
      val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseData]
    }
    
    @scala.inline
    implicit class StoriesInsightsFeedResponseDataMutableBuilder[Self <: StoriesInsightsFeedResponseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUser(value: StoriesInsightsFeedResponseUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoriesInsightsFeedResponseEdgesItem extends StObject {
    
    var cursor: Null = js.native
    
    var node: StoriesInsightsFeedResponseNode = js.native
  }
  object StoriesInsightsFeedResponseEdgesItem {
    
    @scala.inline
    def apply(cursor: Null, node: StoriesInsightsFeedResponseNode): StoriesInsightsFeedResponseEdgesItem = {
      val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseEdgesItem]
    }
    
    @scala.inline
    implicit class StoriesInsightsFeedResponseEdgesItemMutableBuilder[Self <: StoriesInsightsFeedResponseEdgesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCursor(value: Null): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: StoriesInsightsFeedResponseNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoriesInsightsFeedResponseInlineInsightsNode extends StObject {
    
    var metrics: Null = js.native
    
    var state: String = js.native
  }
  object StoriesInsightsFeedResponseInlineInsightsNode {
    
    @scala.inline
    def apply(metrics: Null, state: String): StoriesInsightsFeedResponseInlineInsightsNode = {
      val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseInlineInsightsNode]
    }
    
    @scala.inline
    implicit class StoriesInsightsFeedResponseInlineInsightsNodeMutableBuilder[Self <: StoriesInsightsFeedResponseInlineInsightsNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetrics(value: Null): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoriesInsightsFeedResponseNode extends StObject {
    
    var __typename: String = js.native
    
    var display_url: String = js.native
    
    var exits_count: Double = js.native
    
    var id: String = js.native
    
    var impression_count: Double = js.native
    
    var inline_insights_node: StoriesInsightsFeedResponseInlineInsightsNode = js.native
    
    var instagram_media_id: String = js.native
    
    var reach_count: Double = js.native
    
    var replies_count: Double = js.native
    
    var story_swipe_away_count: Double = js.native
    
    var taps_back_count: Double = js.native
    
    var taps_forward_count: Double = js.native
  }
  object StoriesInsightsFeedResponseNode {
    
    @scala.inline
    def apply(
      __typename: String,
      display_url: String,
      exits_count: Double,
      id: String,
      impression_count: Double,
      inline_insights_node: StoriesInsightsFeedResponseInlineInsightsNode,
      instagram_media_id: String,
      reach_count: Double,
      replies_count: Double,
      story_swipe_away_count: Double,
      taps_back_count: Double,
      taps_forward_count: Double
    ): StoriesInsightsFeedResponseNode = {
      val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], display_url = display_url.asInstanceOf[js.Any], exits_count = exits_count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], impression_count = impression_count.asInstanceOf[js.Any], inline_insights_node = inline_insights_node.asInstanceOf[js.Any], instagram_media_id = instagram_media_id.asInstanceOf[js.Any], reach_count = reach_count.asInstanceOf[js.Any], replies_count = replies_count.asInstanceOf[js.Any], story_swipe_away_count = story_swipe_away_count.asInstanceOf[js.Any], taps_back_count = taps_back_count.asInstanceOf[js.Any], taps_forward_count = taps_forward_count.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseNode]
    }
    
    @scala.inline
    implicit class StoriesInsightsFeedResponseNodeMutableBuilder[Self <: StoriesInsightsFeedResponseNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay_url(value: String): Self = StObject.set(x, "display_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExits_count(value: Double): Self = StObject.set(x, "exits_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImpression_count(value: Double): Self = StObject.set(x, "impression_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline_insights_node(value: StoriesInsightsFeedResponseInlineInsightsNode): Self = StObject.set(x, "inline_insights_node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstagram_media_id(value: String): Self = StObject.set(x, "instagram_media_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReach_count(value: Double): Self = StObject.set(x, "reach_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplies_count(value: Double): Self = StObject.set(x, "replies_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStory_swipe_away_count(value: Double): Self = StObject.set(x, "story_swipe_away_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaps_back_count(value: Double): Self = StObject.set(x, "taps_back_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaps_forward_count(value: Double): Self = StObject.set(x, "taps_forward_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoriesInsightsFeedResponsePageInfo extends StObject {
    
    var end_cursor: String = js.native
    
    var has_next_page: Boolean = js.native
  }
  object StoriesInsightsFeedResponsePageInfo {
    
    @scala.inline
    def apply(end_cursor: String, has_next_page: Boolean): StoriesInsightsFeedResponsePageInfo = {
      val __obj = js.Dynamic.literal(end_cursor = end_cursor.asInstanceOf[js.Any], has_next_page = has_next_page.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponsePageInfo]
    }
    
    @scala.inline
    implicit class StoriesInsightsFeedResponsePageInfoMutableBuilder[Self <: StoriesInsightsFeedResponsePageInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd_cursor(value: String): Self = StObject.set(x, "end_cursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHas_next_page(value: Boolean): Self = StObject.set(x, "has_next_page", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoriesInsightsFeedResponseRootObject extends StObject {
    
    var data: StoriesInsightsFeedResponseData = js.native
  }
  object StoriesInsightsFeedResponseRootObject {
    
    @scala.inline
    def apply(data: StoriesInsightsFeedResponseData): StoriesInsightsFeedResponseRootObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseRootObject]
    }
    
    @scala.inline
    implicit class StoriesInsightsFeedResponseRootObjectMutableBuilder[Self <: StoriesInsightsFeedResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StoriesInsightsFeedResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoriesInsightsFeedResponseStories extends StObject {
    
    var edges: js.Array[StoriesInsightsFeedResponseEdgesItem] = js.native
    
    var page_info: StoriesInsightsFeedResponsePageInfo = js.native
  }
  object StoriesInsightsFeedResponseStories {
    
    @scala.inline
    def apply(
      edges: js.Array[StoriesInsightsFeedResponseEdgesItem],
      page_info: StoriesInsightsFeedResponsePageInfo
    ): StoriesInsightsFeedResponseStories = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseStories]
    }
    
    @scala.inline
    implicit class StoriesInsightsFeedResponseStoriesMutableBuilder[Self <: StoriesInsightsFeedResponseStories] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdges(value: js.Array[StoriesInsightsFeedResponseEdgesItem]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesVarargs(value: StoriesInsightsFeedResponseEdgesItem*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      @scala.inline
      def setPage_info(value: StoriesInsightsFeedResponsePageInfo): Self = StObject.set(x, "page_info", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoriesInsightsFeedResponseStoriesUnit extends StObject {
    
    var stories: StoriesInsightsFeedResponseStories = js.native
  }
  object StoriesInsightsFeedResponseStoriesUnit {
    
    @scala.inline
    def apply(stories: StoriesInsightsFeedResponseStories): StoriesInsightsFeedResponseStoriesUnit = {
      val __obj = js.Dynamic.literal(stories = stories.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseStoriesUnit]
    }
    
    @scala.inline
    implicit class StoriesInsightsFeedResponseStoriesUnitMutableBuilder[Self <: StoriesInsightsFeedResponseStoriesUnit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStories(value: StoriesInsightsFeedResponseStories): Self = StObject.set(x, "stories", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoriesInsightsFeedResponseUser extends StObject {
    
    var business_manager: StoriesInsightsFeedResponseBusinessManager = js.native
    
    var id: String = js.native
  }
  object StoriesInsightsFeedResponseUser {
    
    @scala.inline
    def apply(business_manager: StoriesInsightsFeedResponseBusinessManager, id: String): StoriesInsightsFeedResponseUser = {
      val __obj = js.Dynamic.literal(business_manager = business_manager.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoriesInsightsFeedResponseUser]
    }
    
    @scala.inline
    implicit class StoriesInsightsFeedResponseUserMutableBuilder[Self <: StoriesInsightsFeedResponseUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBusiness_manager(value: StoriesInsightsFeedResponseBusinessManager): Self = StObject.set(x, "business_manager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}

package typingsSlinky.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagRepositorySearchResponseMod {
  
  @js.native
  trait TagRepositorySearchResponseResultsItem extends StObject {
    
    var allow_following: Null = js.native
    
    var allow_muting_story: Null = js.native
    
    var debug_info: Null = js.native
    
    var follow_button_text: Null = js.native
    
    var follow_status: Null = js.native
    
    var following: Null = js.native
    
    var id: String = js.native
    
    var media_count: Double = js.native
    
    var name: String = js.native
    
    var non_violating: Null = js.native
    
    var profile_pic_url: String = js.native
    
    var related_tags: Null = js.native
    
    var search_result_subtitle: String = js.native
    
    var show_follow_drop_down: Null = js.native
    
    var social_context: Null = js.native
    
    var social_context_profile_links: Null = js.native
    
    var subtitle: Null = js.native
  }
  object TagRepositorySearchResponseResultsItem {
    
    @scala.inline
    def apply(
      allow_following: Null,
      allow_muting_story: Null,
      debug_info: Null,
      follow_button_text: Null,
      follow_status: Null,
      following: Null,
      id: String,
      media_count: Double,
      name: String,
      non_violating: Null,
      profile_pic_url: String,
      related_tags: Null,
      search_result_subtitle: String,
      show_follow_drop_down: Null,
      social_context: Null,
      social_context_profile_links: Null,
      subtitle: Null
    ): TagRepositorySearchResponseResultsItem = {
      val __obj = js.Dynamic.literal(allow_following = allow_following.asInstanceOf[js.Any], allow_muting_story = allow_muting_story.asInstanceOf[js.Any], debug_info = debug_info.asInstanceOf[js.Any], follow_button_text = follow_button_text.asInstanceOf[js.Any], follow_status = follow_status.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], non_violating = non_violating.asInstanceOf[js.Any], profile_pic_url = profile_pic_url.asInstanceOf[js.Any], related_tags = related_tags.asInstanceOf[js.Any], search_result_subtitle = search_result_subtitle.asInstanceOf[js.Any], show_follow_drop_down = show_follow_drop_down.asInstanceOf[js.Any], social_context = social_context.asInstanceOf[js.Any], social_context_profile_links = social_context_profile_links.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagRepositorySearchResponseResultsItem]
    }
    
    @scala.inline
    implicit class TagRepositorySearchResponseResultsItemMutableBuilder[Self <: TagRepositorySearchResponseResultsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllow_following(value: Null): Self = StObject.set(x, "allow_following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllow_muting_story(value: Null): Self = StObject.set(x, "allow_muting_story", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebug_info(value: Null): Self = StObject.set(x, "debug_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollow_button_text(value: Null): Self = StObject.set(x, "follow_button_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollow_status(value: Null): Self = StObject.set(x, "follow_status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowing(value: Null): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNon_violating(value: Null): Self = StObject.set(x, "non_violating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_pic_url(value: String): Self = StObject.set(x, "profile_pic_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelated_tags(value: Null): Self = StObject.set(x, "related_tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_result_subtitle(value: String): Self = StObject.set(x, "search_result_subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_follow_drop_down(value: Null): Self = StObject.set(x, "show_follow_drop_down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocial_context(value: Null): Self = StObject.set(x, "social_context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocial_context_profile_links(value: Null): Self = StObject.set(x, "social_context_profile_links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle(value: Null): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TagRepositorySearchResponseRootObject extends StObject {
    
    var has_more: Boolean = js.native
    
    var rank_token: String = js.native
    
    var results: js.Array[TagRepositorySearchResponseResultsItem] = js.native
    
    var status: String = js.native
  }
  object TagRepositorySearchResponseRootObject {
    
    @scala.inline
    def apply(
      has_more: Boolean,
      rank_token: String,
      results: js.Array[TagRepositorySearchResponseResultsItem],
      status: String
    ): TagRepositorySearchResponseRootObject = {
      val __obj = js.Dynamic.literal(has_more = has_more.asInstanceOf[js.Any], rank_token = rank_token.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagRepositorySearchResponseRootObject]
    }
    
    @scala.inline
    implicit class TagRepositorySearchResponseRootObjectMutableBuilder[Self <: TagRepositorySearchResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHas_more(value: Boolean): Self = StObject.set(x, "has_more", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRank_token(value: String): Self = StObject.set(x, "rank_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: js.Array[TagRepositorySearchResponseResultsItem]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsVarargs(value: TagRepositorySearchResponseResultsItem*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}

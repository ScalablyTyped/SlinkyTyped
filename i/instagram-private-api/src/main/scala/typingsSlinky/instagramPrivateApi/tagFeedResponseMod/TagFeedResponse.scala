package typingsSlinky.instagramPrivateApi.tagFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagFeedResponse extends StObject {
  
  var auto_load_more_enabled: Boolean = js.native
  
  var items: js.Array[TagFeedResponseItemsItem] = js.native
  
  var more_available: Boolean = js.native
  
  var next_max_id: String = js.native
  
  var num_results: Double = js.native
  
  var ranked_items: js.Array[TagFeedResponseRankedItemsItem] = js.native
  
  var status: String = js.native
  
  var story: TagFeedResponseStory = js.native
}
object TagFeedResponse {
  
  @scala.inline
  def apply(
    auto_load_more_enabled: Boolean,
    items: js.Array[TagFeedResponseItemsItem],
    more_available: Boolean,
    next_max_id: String,
    num_results: Double,
    ranked_items: js.Array[TagFeedResponseRankedItemsItem],
    status: String,
    story: TagFeedResponseStory
  ): TagFeedResponse = {
    val __obj = js.Dynamic.literal(auto_load_more_enabled = auto_load_more_enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], next_max_id = next_max_id.asInstanceOf[js.Any], num_results = num_results.asInstanceOf[js.Any], ranked_items = ranked_items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFeedResponse]
  }
  
  @scala.inline
  implicit class TagFeedResponseMutableBuilder[Self <: TagFeedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto_load_more_enabled(value: Boolean): Self = StObject.set(x, "auto_load_more_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[TagFeedResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: TagFeedResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_max_id(value: String): Self = StObject.set(x, "next_max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_results(value: Double): Self = StObject.set(x, "num_results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanked_items(value: js.Array[TagFeedResponseRankedItemsItem]): Self = StObject.set(x, "ranked_items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanked_itemsVarargs(value: TagFeedResponseRankedItemsItem*): Self = StObject.set(x, "ranked_items", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory(value: TagFeedResponseStory): Self = StObject.set(x, "story", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgtvBrowseFeedResponseChannelsItem extends StObject {
  
  var approx_total_videos: Null = js.native
  
  var cover_photo_url: Null = js.native
  
  var description: Null = js.native
  
  var id: String = js.native
  
  var items: js.Array[_] = js.native
  
  var max_id: Null = js.native
  
  var more_available: Boolean = js.native
  
  var seen_state: IgtvBrowseFeedResponseSeenState = js.native
  
  var title: String = js.native
  
  var `type`: String = js.native
  
  var user_dict: Null = js.native
}
object IgtvBrowseFeedResponseChannelsItem {
  
  @scala.inline
  def apply(
    approx_total_videos: Null,
    cover_photo_url: Null,
    description: Null,
    id: String,
    items: js.Array[_],
    max_id: Null,
    more_available: Boolean,
    seen_state: IgtvBrowseFeedResponseSeenState,
    title: String,
    `type`: String,
    user_dict: Null
  ): IgtvBrowseFeedResponseChannelsItem = {
    val __obj = js.Dynamic.literal(approx_total_videos = approx_total_videos.asInstanceOf[js.Any], cover_photo_url = cover_photo_url.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], max_id = max_id.asInstanceOf[js.Any], more_available = more_available.asInstanceOf[js.Any], seen_state = seen_state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], user_dict = user_dict.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseChannelsItem]
  }
  
  @scala.inline
  implicit class IgtvBrowseFeedResponseChannelsItemMutableBuilder[Self <: IgtvBrowseFeedResponseChannelsItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprox_total_videos(value: Null): Self = StObject.set(x, "approx_total_videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCover_photo_url(value: Null): Self = StObject.set(x, "cover_photo_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Null): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMax_id(value: Null): Self = StObject.set(x, "max_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore_available(value: Boolean): Self = StObject.set(x, "more_available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeen_state(value: IgtvBrowseFeedResponseSeenState): Self = StObject.set(x, "seen_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_dict(value: Null): Self = StObject.set(x, "user_dict", value.asInstanceOf[js.Any])
  }
}

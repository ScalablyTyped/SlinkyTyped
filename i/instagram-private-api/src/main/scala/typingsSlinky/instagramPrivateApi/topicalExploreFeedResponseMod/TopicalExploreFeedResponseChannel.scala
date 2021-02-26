package typingsSlinky.instagramPrivateApi.topicalExploreFeedResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicalExploreFeedResponseChannel extends StObject {
  
  var channel_id: String = js.native
  
  var channel_type: String = js.native
  
  var context: String = js.native
  
  var header: String = js.native
  
  var media: TopicalExploreFeedResponseMedia = js.native
  
  var media_count: Double = js.native
  
  var title: String = js.native
}
object TopicalExploreFeedResponseChannel {
  
  @scala.inline
  def apply(
    channel_id: String,
    channel_type: String,
    context: String,
    header: String,
    media: TopicalExploreFeedResponseMedia,
    media_count: Double,
    title: String
  ): TopicalExploreFeedResponseChannel = {
    val __obj = js.Dynamic.literal(channel_id = channel_id.asInstanceOf[js.Any], channel_type = channel_type.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], media_count = media_count.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicalExploreFeedResponseChannel]
  }
  
  @scala.inline
  implicit class TopicalExploreFeedResponseChannelMutableBuilder[Self <: TopicalExploreFeedResponseChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel_id(value: String): Self = StObject.set(x, "channel_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel_type(value: String): Self = StObject.set(x, "channel_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: TopicalExploreFeedResponseMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_count(value: Double): Self = StObject.set(x, "media_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

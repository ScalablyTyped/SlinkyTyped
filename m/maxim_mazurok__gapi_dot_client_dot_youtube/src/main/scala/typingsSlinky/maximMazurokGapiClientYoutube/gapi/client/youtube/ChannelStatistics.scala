package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelStatistics extends StObject {
  
  /** The number of comments for the channel. */
  var commentCount: js.UndefOr[String] = js.native
  
  /** Whether or not the number of subscribers is shown for this user. */
  var hiddenSubscriberCount: js.UndefOr[Boolean] = js.native
  
  /** The number of subscribers that the channel has. */
  var subscriberCount: js.UndefOr[String] = js.native
  
  /** The number of videos uploaded to the channel. */
  var videoCount: js.UndefOr[String] = js.native
  
  /** The number of times the channel has been viewed. */
  var viewCount: js.UndefOr[String] = js.native
}
object ChannelStatistics {
  
  @scala.inline
  def apply(): ChannelStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelStatistics]
  }
  
  @scala.inline
  implicit class ChannelStatisticsMutableBuilder[Self <: ChannelStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentCount(value: String): Self = StObject.set(x, "commentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentCountUndefined: Self = StObject.set(x, "commentCount", js.undefined)
    
    @scala.inline
    def setHiddenSubscriberCount(value: Boolean): Self = StObject.set(x, "hiddenSubscriberCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenSubscriberCountUndefined: Self = StObject.set(x, "hiddenSubscriberCount", js.undefined)
    
    @scala.inline
    def setSubscriberCount(value: String): Self = StObject.set(x, "subscriberCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberCountUndefined: Self = StObject.set(x, "subscriberCount", js.undefined)
    
    @scala.inline
    def setVideoCount(value: String): Self = StObject.set(x, "videoCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCountUndefined: Self = StObject.set(x, "videoCount", js.undefined)
    
    @scala.inline
    def setViewCount(value: String): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewCountUndefined: Self = StObject.set(x, "viewCount", js.undefined)
  }
}

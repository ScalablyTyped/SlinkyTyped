package typingsSlinky.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentCount extends StObject {
  
  /**
    * The number of comments for the channel.
    */
  var commentCount: Double = js.native
  
  /**
    * The number of subscribers that the channel has.
    */
  var subscriberCount: Double = js.native
  
  /**
    * The number of videos uploaded to the channel.
    */
  var videoCount: Double = js.native
  
  /**
    * The number of times the channel has been viewed.
    */
  var viewCount: Double = js.native
}
object CommentCount {
  
  @scala.inline
  def apply(commentCount: Double, subscriberCount: Double, videoCount: Double, viewCount: Double): CommentCount = {
    val __obj = js.Dynamic.literal(commentCount = commentCount.asInstanceOf[js.Any], subscriberCount = subscriberCount.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any], viewCount = viewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentCount]
  }
  
  @scala.inline
  implicit class CommentCountMutableBuilder[Self <: CommentCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentCount(value: Double): Self = StObject.set(x, "commentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriberCount(value: Double): Self = StObject.set(x, "subscriberCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCount(value: Double): Self = StObject.set(x, "videoCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewCount(value: Double): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
  }
}

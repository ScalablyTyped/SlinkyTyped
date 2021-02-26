package typingsSlinky.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DislikeCount extends StObject {
  
  /**
    * The number of comments for the video.
    */
  var commentCount: Double = js.native
  
  /**
    * The number of users who have indicated that they disliked the video by giving it a negative rating.
    */
  var dislikeCount: Double = js.native
  
  /**
    * The number of users who currently have the video marked as a favorite video.
    */
  var favoriteCount: Double = js.native
  
  /**
    * The number of users who have indicated that they liked the video by giving it a positive rating.
    */
  var likeCount: Double = js.native
  
  /**
    * The number of times the video has been viewed.
    */
  var viewCount: Double = js.native
}
object DislikeCount {
  
  @scala.inline
  def apply(
    commentCount: Double,
    dislikeCount: Double,
    favoriteCount: Double,
    likeCount: Double,
    viewCount: Double
  ): DislikeCount = {
    val __obj = js.Dynamic.literal(commentCount = commentCount.asInstanceOf[js.Any], dislikeCount = dislikeCount.asInstanceOf[js.Any], favoriteCount = favoriteCount.asInstanceOf[js.Any], likeCount = likeCount.asInstanceOf[js.Any], viewCount = viewCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DislikeCount]
  }
  
  @scala.inline
  implicit class DislikeCountMutableBuilder[Self <: DislikeCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentCount(value: Double): Self = StObject.set(x, "commentCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDislikeCount(value: Double): Self = StObject.set(x, "dislikeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFavoriteCount(value: Double): Self = StObject.set(x, "favoriteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikeCount(value: Double): Self = StObject.set(x, "likeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewCount(value: Double): Self = StObject.set(x, "viewCount", value.asInstanceOf[js.Any])
  }
}

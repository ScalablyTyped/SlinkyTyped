package typingsSlinky.instagramPrivateApi.liveLikeCountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveLikeCountResponseRootObject extends js.Object {
  
  var burst_likes: Double = js.native
  
  var like_ts: Double = js.native
  
  var likers: js.Array[_] = js.native
  
  var likes: Double = js.native
  
  var status: String = js.native
}
object LiveLikeCountResponseRootObject {
  
  @scala.inline
  def apply(burst_likes: Double, like_ts: Double, likers: js.Array[_], likes: Double, status: String): LiveLikeCountResponseRootObject = {
    val __obj = js.Dynamic.literal(burst_likes = burst_likes.asInstanceOf[js.Any], like_ts = like_ts.asInstanceOf[js.Any], likers = likers.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveLikeCountResponseRootObject]
  }
  
  @scala.inline
  implicit class LiveLikeCountResponseRootObjectOps[Self <: LiveLikeCountResponseRootObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBurst_likes(value: Double): Self = this.set("burst_likes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLike_ts(value: Double): Self = this.set("like_ts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikersVarargs(value: js.Any*): Self = this.set("likers", js.Array(value :_*))
    
    @scala.inline
    def setLikers(value: js.Array[_]): Self = this.set("likers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLikes(value: Double): Self = this.set("likes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.instagramPrivateApi.liveLikeCountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withBurst_likes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burst_likes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLike_ts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("like_ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLikers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLikes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


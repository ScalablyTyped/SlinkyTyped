package typingsSlinky.instagramPrivateApi.liveLikeResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveLikeResponseRootObject extends js.Object {
  var burst_likes: Double = js.native
  var likes: Double = js.native
  var status: String = js.native
}

object LiveLikeResponseRootObject {
  @scala.inline
  def apply(burst_likes: Double, likes: Double, status: String): LiveLikeResponseRootObject = {
    val __obj = js.Dynamic.literal(burst_likes = burst_likes.asInstanceOf[js.Any], likes = likes.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveLikeResponseRootObject]
  }
  @scala.inline
  implicit class LiveLikeResponseRootObjectOps[Self <: LiveLikeResponseRootObject] (val x: Self) extends AnyVal {
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


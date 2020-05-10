package typingsSlinky.instagramPrivateApi.likedFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LikedFeedResponseUsertags extends js.Object {
  var in: js.Array[LikedFeedResponseInItem] = js.native
}

object LikedFeedResponseUsertags {
  @scala.inline
  def apply(in: js.Array[LikedFeedResponseInItem]): LikedFeedResponseUsertags = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    __obj.asInstanceOf[LikedFeedResponseUsertags]
  }
  @scala.inline
  implicit class LikedFeedResponseUsertagsOps[Self <: LikedFeedResponseUsertags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: js.Array[LikedFeedResponseInItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


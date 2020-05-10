package typingsSlinky.instagramPrivateApi.liveSwitchCommentsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveSwitchCommentsResponseRootObject extends js.Object {
  var comment_muted: Double = js.native
  var status: String = js.native
}

object LiveSwitchCommentsResponseRootObject {
  @scala.inline
  def apply(comment_muted: Double, status: String): LiveSwitchCommentsResponseRootObject = {
    val __obj = js.Dynamic.literal(comment_muted = comment_muted.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveSwitchCommentsResponseRootObject]
  }
  @scala.inline
  implicit class LiveSwitchCommentsResponseRootObjectOps[Self <: LiveSwitchCommentsResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment_muted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment_muted")(value.asInstanceOf[js.Any])
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


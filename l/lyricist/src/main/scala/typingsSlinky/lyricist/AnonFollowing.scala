package typingsSlinky.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFollowing extends js.Object {
  var following: Boolean = js.native
  var pyong: Boolean = js.native
}

object AnonFollowing {
  @scala.inline
  def apply(following: Boolean, pyong: Boolean): AnonFollowing = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any], pyong = pyong.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFollowing]
  }
  @scala.inline
  implicit class AnonFollowingOps[Self <: AnonFollowing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("following")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPyong(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pyong")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


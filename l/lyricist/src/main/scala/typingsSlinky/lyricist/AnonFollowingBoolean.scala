package typingsSlinky.lyricist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFollowingBoolean extends js.Object {
  var following: Boolean = js.native
}

object AnonFollowingBoolean {
  @scala.inline
  def apply(following: Boolean): AnonFollowingBoolean = {
    val __obj = js.Dynamic.literal(following = following.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFollowingBoolean]
  }
  @scala.inline
  implicit class AnonFollowingBooleanOps[Self <: AnonFollowingBoolean] (val x: Self) extends AnyVal {
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
  }
  
}


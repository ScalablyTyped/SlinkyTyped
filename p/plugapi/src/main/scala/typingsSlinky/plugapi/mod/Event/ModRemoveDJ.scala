package typingsSlinky.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModRemoveDJ extends js.Object {
  var moderator: String = js.native
  var userID: String = js.native
  var username: String = js.native
}

object ModRemoveDJ {
  @scala.inline
  def apply(moderator: String, userID: String, username: String): ModRemoveDJ = {
    val __obj = js.Dynamic.literal(moderator = moderator.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModRemoveDJ]
  }
  @scala.inline
  implicit class ModRemoveDJOps[Self <: ModRemoveDJ] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModerator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moderator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.plugapi.mod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Room extends Default {
  var badge: String = js.native
  var gRole: Double = js.native
  var id: Double = js.native
  var joined: String = js.native
  var level: Double = js.native
  var role: Double = js.native
  var slug: String = js.native
  var sub: Double = js.native
}

object Room {
  @scala.inline
  def apply(
    avatarID: String,
    badge: String,
    gRole: Double,
    id: Double,
    joined: String,
    language: String,
    level: Double,
    role: Double,
    slug: String,
    sub: Double,
    username: String
  ): Room = {
    val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Room]
  }
  @scala.inline
  implicit class RoomOps[Self <: Room] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGRole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoined(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("joined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSub(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sub")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


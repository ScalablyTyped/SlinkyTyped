package typingsSlinky.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserUpdate extends js.Object {
  var avatarID: String = js.native
  var curatorPoints: Double = js.native
  var dateJoined: String = js.native
  var djPoints: Double = js.native
  var fans: Double = js.native
  var id: String = js.native
  var language: String = js.native
  var listenerPoints: Double = js.native
  var status: Double = js.native
  var username: String = js.native
}

object UserUpdate {
  @scala.inline
  def apply(
    avatarID: String,
    curatorPoints: Double,
    dateJoined: String,
    djPoints: Double,
    fans: Double,
    id: String,
    language: String,
    listenerPoints: Double,
    status: Double,
    username: String
  ): UserUpdate = {
    val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], curatorPoints = curatorPoints.asInstanceOf[js.Any], dateJoined = dateJoined.asInstanceOf[js.Any], djPoints = djPoints.asInstanceOf[js.Any], fans = fans.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], listenerPoints = listenerPoints.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserUpdate]
  }
  @scala.inline
  implicit class UserUpdateOps[Self <: UserUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvatarID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatarID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCuratorPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curatorPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateJoined(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateJoined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDjPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("djPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFans(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListenerPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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


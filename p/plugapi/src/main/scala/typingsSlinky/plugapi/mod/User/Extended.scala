package typingsSlinky.plugapi.mod.User

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extended extends Default {
  var curatorPoints: Double = js.native
  var djPoints: Double = js.native
  var fans: Double = js.native
  var id: String = js.native
  var listenerPoints: Double = js.native
  var status: Double = js.native
}

object Extended {
  @scala.inline
  def apply(
    avatarID: String,
    curatorPoints: Double,
    djPoints: Double,
    fans: Double,
    id: String,
    language: String,
    listenerPoints: Double,
    status: Double,
    username: String
  ): Extended = {
    val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], curatorPoints = curatorPoints.asInstanceOf[js.Any], djPoints = djPoints.asInstanceOf[js.Any], fans = fans.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], listenerPoints = listenerPoints.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extended]
  }
  @scala.inline
  implicit class ExtendedOps[Self <: Extended] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCuratorPoints(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curatorPoints")(value.asInstanceOf[js.Any])
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
  }
  
}


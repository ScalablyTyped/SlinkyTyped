package typingsSlinky.instagramPrivateApi.directRepositoryGetPresenceResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectRepositoryGetPresenceResponseRootObject extends js.Object {
  var status: String = js.native
  var user_presence: js.Any = js.native
}

object DirectRepositoryGetPresenceResponseRootObject {
  @scala.inline
  def apply(status: String, user_presence: js.Any): DirectRepositoryGetPresenceResponseRootObject = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], user_presence = user_presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectRepositoryGetPresenceResponseRootObject]
  }
  @scala.inline
  implicit class DirectRepositoryGetPresenceResponseRootObjectOps[Self <: DirectRepositoryGetPresenceResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_presence(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_presence")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.instagramPrivateApi.directInboxFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectInboxFeedResponseMedia extends js.Object {
  var expiring_at: Double = js.native
  var user: DirectInboxFeedResponseUser = js.native
}

object DirectInboxFeedResponseMedia {
  @scala.inline
  def apply(expiring_at: Double, user: DirectInboxFeedResponseUser): DirectInboxFeedResponseMedia = {
    val __obj = js.Dynamic.literal(expiring_at = expiring_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectInboxFeedResponseMedia]
  }
  @scala.inline
  implicit class DirectInboxFeedResponseMediaOps[Self <: DirectInboxFeedResponseMedia] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpiring_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiring_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: DirectInboxFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


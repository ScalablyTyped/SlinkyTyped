package typingsSlinky.instagramPrivateApi.liveCommentsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveCommentsResponseSystemCommentsItem extends js.Object {
  var created_at: Double = js.native
  var pk: String = js.native
  var text: String = js.native
  var user: LiveCommentsResponseUser = js.native
  var user_count: Double = js.native
}

object LiveCommentsResponseSystemCommentsItem {
  @scala.inline
  def apply(created_at: Double, pk: String, text: String, user: LiveCommentsResponseUser, user_count: Double): LiveCommentsResponseSystemCommentsItem = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], user_count = user_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveCommentsResponseSystemCommentsItem]
  }
  @scala.inline
  implicit class LiveCommentsResponseSystemCommentsItemOps[Self <: LiveCommentsResponseSystemCommentsItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated_at(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: LiveCommentsResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


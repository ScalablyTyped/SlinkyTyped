package typingsSlinky.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Displayname extends js.Object {
  var avatar_url: js.UndefOr[String | Null] = js.native
  var display_name: js.UndefOr[String | Null] = js.native
  var user_id: String = js.native
}

object Displayname {
  @scala.inline
  def apply(user_id: String): Displayname = {
    val __obj = js.Dynamic.literal(user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Displayname]
  }
  @scala.inline
  implicit class DisplaynameOps[Self <: Displayname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvatar_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatar_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar_url")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatar_urlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avatar_url")(null)
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_nameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(null)
        ret
    }
  }
  
}


package typingsSlinky.mailgunJs.mod.lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberUpdateData extends js.Object {
  var name: String = js.native
  var subscribed: Boolean = js.native
  var vars: js.UndefOr[js.Object] = js.native
}

object MemberUpdateData {
  @scala.inline
  def apply(name: String, subscribed: Boolean): MemberUpdateData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subscribed = subscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberUpdateData]
  }
  @scala.inline
  implicit class MemberUpdateDataOps[Self <: MemberUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubscribed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVars(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(js.undefined)
        ret
    }
  }
  
}


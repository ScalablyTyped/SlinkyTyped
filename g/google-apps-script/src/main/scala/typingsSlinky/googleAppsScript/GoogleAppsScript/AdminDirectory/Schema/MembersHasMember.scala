package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembersHasMember extends js.Object {
  var isMember: js.UndefOr[Boolean] = js.native
}

object MembersHasMember {
  @scala.inline
  def apply(): MembersHasMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembersHasMember]
  }
  @scala.inline
  implicit class MembersHasMemberOps[Self <: MembersHasMember] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMember(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMember")(js.undefined)
        ret
    }
  }
  
}


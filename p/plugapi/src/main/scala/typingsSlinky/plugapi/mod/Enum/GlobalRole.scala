package typingsSlinky.plugapi.mod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalRole extends js.Object {
  var ADMIN: Double = js.native
  var AMBASSADOR: Double = js.native
  var LEADER: Double = js.native
  var NONE: Double = js.native
  var VOLUNTEER: Double = js.native
}

object GlobalRole {
  @scala.inline
  def apply(ADMIN: Double, AMBASSADOR: Double, LEADER: Double, NONE: Double, VOLUNTEER: Double): GlobalRole = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], AMBASSADOR = AMBASSADOR.asInstanceOf[js.Any], LEADER = LEADER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], VOLUNTEER = VOLUNTEER.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalRole]
  }
  @scala.inline
  implicit class GlobalRoleOps[Self <: GlobalRole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADMIN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADMIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAMBASSADOR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AMBASSADOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEADER(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEADER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNONE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NONE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVOLUNTEER(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VOLUNTEER")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.restIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonADMIN extends js.Object {
  var ADMIN: String = js.native
  var MODERATOR: String = js.native
  var SUPER_USER: String = js.native
  var USER: String = js.native
}

object AnonADMIN {
  @scala.inline
  def apply(ADMIN: String, MODERATOR: String, SUPER_USER: String, USER: String): AnonADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], MODERATOR = MODERATOR.asInstanceOf[js.Any], SUPER_USER = SUPER_USER.asInstanceOf[js.Any], USER = USER.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonADMIN]
  }
  @scala.inline
  implicit class AnonADMINOps[Self <: AnonADMIN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADMIN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADMIN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODERATOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODERATOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUPER_USER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUPER_USER")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUSER(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("USER")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


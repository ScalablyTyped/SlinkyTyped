package typingsSlinky.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthuser extends js.Object {
  var authuser: String = js.native
}

object AnonAuthuser {
  @scala.inline
  def apply(authuser: String): AnonAuthuser = {
    val __obj = js.Dynamic.literal(authuser = authuser.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthuser]
  }
  @scala.inline
  implicit class AnonAuthuserOps[Self <: AnonAuthuser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthuser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authuser")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


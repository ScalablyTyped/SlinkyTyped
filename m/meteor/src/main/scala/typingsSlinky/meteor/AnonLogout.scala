package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLogout extends js.Object {
  var logout: js.UndefOr[js.Object] = js.native
}

object AnonLogout {
  @scala.inline
  def apply(): AnonLogout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLogout]
  }
  @scala.inline
  implicit class AnonLogoutOps[Self <: AnonLogout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogout(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logout")(js.undefined)
        ret
    }
  }
  
}


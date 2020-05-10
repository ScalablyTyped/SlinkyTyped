package typingsSlinky.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentUnregisterOptions extends js.Object {
  var all: js.UndefOr[Boolean] = js.native
}

object UserAgentUnregisterOptions {
  @scala.inline
  def apply(): UserAgentUnregisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgentUnregisterOptions]
  }
  @scala.inline
  implicit class UserAgentUnregisterOptionsOps[Self <: UserAgentUnregisterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all")(js.undefined)
        ret
    }
  }
  
}


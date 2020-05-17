package typingsSlinky.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionTokenOption extends js.Object {
  var sessionToken: js.UndefOr[String] = js.native
}

object SessionTokenOption {
  @scala.inline
  def apply(): SessionTokenOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionTokenOption]
  }
  @scala.inline
  implicit class SessionTokenOptionOps[Self <: SessionTokenOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSessionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(js.undefined)
        ret
    }
  }
  
}


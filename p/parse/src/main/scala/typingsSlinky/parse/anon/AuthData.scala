package typingsSlinky.parse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthData extends js.Object {
  var authData: js.UndefOr[typingsSlinky.parse.mod.global.Parse.AuthData] = js.native
}

object AuthData {
  @scala.inline
  def apply(): AuthData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthData]
  }
  @scala.inline
  implicit class AuthDataOps[Self <: AuthData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthData(value: typingsSlinky.parse.mod.global.Parse.AuthData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authData")(js.undefined)
        ret
    }
  }
  
}


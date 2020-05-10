package typingsSlinky.parse

import typingsSlinky.parse.mod._Global_.Parse.AuthData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthData extends js.Object {
  var authData: js.UndefOr[AuthData] = js.native
}

object AnonAuthData {
  @scala.inline
  def apply(): AnonAuthData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAuthData]
  }
  @scala.inline
  implicit class AnonAuthDataOps[Self <: AnonAuthData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthData(value: AuthData): Self = {
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


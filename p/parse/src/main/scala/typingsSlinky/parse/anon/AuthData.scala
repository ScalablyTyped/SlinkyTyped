package typingsSlinky.parse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthData extends js.Object {
  var authData: js.UndefOr[typingsSlinky.parse.mod.global.Parse.AuthData] = js.undefined
}

object AuthData {
  @scala.inline
  def apply(authData: typingsSlinky.parse.mod.global.Parse.AuthData = null): AuthData = {
    val __obj = js.Dynamic.literal()
    if (authData != null) __obj.updateDynamic("authData")(authData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthData]
  }
}


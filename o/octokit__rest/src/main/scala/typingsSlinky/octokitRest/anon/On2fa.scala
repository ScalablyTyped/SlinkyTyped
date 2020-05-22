package typingsSlinky.octokitRest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait On2fa extends js.Object {
  var password: String
  var username: String
  def on2fa(): js.Promise[String]
}

object On2fa {
  @scala.inline
  def apply(on2fa: () => js.Promise[String], password: String, username: String): On2fa = {
    val __obj = js.Dynamic.literal(on2fa = js.Any.fromFunction0(on2fa), password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[On2fa]
  }
}


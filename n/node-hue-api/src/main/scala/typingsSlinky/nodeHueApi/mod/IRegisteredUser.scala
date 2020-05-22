package typingsSlinky.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRegisteredUser extends js.Object {
  var accessed: js.Date
  var created: js.Date
  var name: String
  var username: String
}

object IRegisteredUser {
  @scala.inline
  def apply(accessed: js.Date, created: js.Date, name: String, username: String): IRegisteredUser = {
    val __obj = js.Dynamic.literal(accessed = accessed.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegisteredUser]
  }
}


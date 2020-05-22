package typingsSlinky.jupyterlabCoreutils.anon

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var composite: ReadonlyJSONValue
  var user: ReadonlyJSONValue
}

object User {
  @scala.inline
  def apply(composite: ReadonlyJSONValue = null, user: ReadonlyJSONValue = null): User = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
}


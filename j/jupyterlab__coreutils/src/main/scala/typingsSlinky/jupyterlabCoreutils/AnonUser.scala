package typingsSlinky.jupyterlabCoreutils

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUser extends js.Object {
  var composite: ReadonlyJSONValue
  var user: ReadonlyJSONValue
}

object AnonUser {
  @scala.inline
  def apply(composite: ReadonlyJSONValue = null, user: ReadonlyJSONValue = null): AnonUser = {
    val __obj = js.Dynamic.literal()
    if (composite != null) __obj.updateDynamic("composite")(composite.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUser]
  }
}


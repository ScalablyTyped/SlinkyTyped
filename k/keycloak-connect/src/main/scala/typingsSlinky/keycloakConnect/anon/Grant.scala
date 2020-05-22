package typingsSlinky.keycloakConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grant extends js.Object {
  var grant: js.UndefOr[typingsSlinky.keycloakConnect.mod.Grant] = js.undefined
}

object Grant {
  @scala.inline
  def apply(grant: typingsSlinky.keycloakConnect.mod.Grant = null): Grant = {
    val __obj = js.Dynamic.literal()
    if (grant != null) __obj.updateDynamic("grant")(grant.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grant]
  }
}


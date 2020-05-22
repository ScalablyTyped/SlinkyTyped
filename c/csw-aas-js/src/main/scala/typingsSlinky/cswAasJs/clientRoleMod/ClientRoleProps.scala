package typingsSlinky.cswAasJs.clientRoleMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientRoleProps extends js.Object {
  var children: TagMod[Any]
  var client: js.UndefOr[String] = js.undefined
  var clientRole: String
  var error: TagMod[Any]
}

object ClientRoleProps {
  @scala.inline
  def apply(clientRole: String, children: TagMod[Any] = null, client: String = null, error: TagMod[Any] = null): ClientRoleProps = {
    val __obj = js.Dynamic.literal(clientRole = clientRole.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRoleProps]
  }
}


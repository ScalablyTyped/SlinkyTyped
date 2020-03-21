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
  def apply(children: TagMod[Any], clientRole: String, error: TagMod[Any], client: String = null): ClientRoleProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], clientRole = clientRole.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRoleProps]
  }
}


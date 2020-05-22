package typingsSlinky.cswAasJs.realmRoleMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealmRoleProps extends js.Object {
  var children: TagMod[Any]
  var error: TagMod[Any]
  var realmRole: String
}

object RealmRoleProps {
  @scala.inline
  def apply(realmRole: String, children: TagMod[Any] = null, error: TagMod[Any] = null): RealmRoleProps = {
    val __obj = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmRoleProps]
  }
}


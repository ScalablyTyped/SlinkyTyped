package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permissions extends js.Object {
  var installation_id: Required
  var permissions: Type
  var repository_ids: Type
}

object Permissions {
  @scala.inline
  def apply(installation_id: Required, permissions: Type, repository_ids: Type): Permissions = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repository_ids = repository_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
}


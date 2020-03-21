package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPermissionRepo extends js.Object {
  var owner: AnonRequired
  var permission: AnonEnum
  var repo: AnonRequired
  var team_id: AnonRequired
}

object AnonPermissionRepo {
  @scala.inline
  def apply(owner: AnonRequired, permission: AnonEnum, repo: AnonRequired, team_id: AnonRequired): AnonPermissionRepo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], permission = permission.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPermissionRepo]
  }
}


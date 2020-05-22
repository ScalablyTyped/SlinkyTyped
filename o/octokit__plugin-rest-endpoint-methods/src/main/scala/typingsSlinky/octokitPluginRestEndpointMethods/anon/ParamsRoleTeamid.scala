package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsRoleTeamid extends js.Object {
  var deprecated: String
  var method: String
  var params: RoleTeamid
  var url: String
}

object ParamsRoleTeamid {
  @scala.inline
  def apply(deprecated: String, method: String, params: RoleTeamid, url: String): ParamsRoleTeamid = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsRoleTeamid]
  }
}


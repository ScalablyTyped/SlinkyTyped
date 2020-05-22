package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrgRole extends js.Object {
  var method: String
  var params: OrgRole
  var url: String
}

object ParamsOrgRole {
  @scala.inline
  def apply(method: String, params: OrgRole, url: String): ParamsOrgRole = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrgRole]
  }
}


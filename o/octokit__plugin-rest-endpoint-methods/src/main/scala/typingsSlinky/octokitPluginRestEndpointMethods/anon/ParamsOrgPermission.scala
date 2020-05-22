package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrgPermission extends js.Object {
  var headers: Accept
  var method: String
  var params: OrgPermission
  var url: String
}

object ParamsOrgPermission {
  @scala.inline
  def apply(headers: Accept, method: String, params: OrgPermission, url: String): ParamsOrgPermission = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrgPermission]
  }
}


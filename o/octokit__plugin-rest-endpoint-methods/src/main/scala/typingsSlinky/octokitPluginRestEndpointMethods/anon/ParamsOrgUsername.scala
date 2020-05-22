package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrgUsername extends js.Object {
  var method: String
  var params: OrgUsername
  var url: String
}

object ParamsOrgUsername {
  @scala.inline
  def apply(method: String, params: OrgUsername, url: String): ParamsOrgUsername = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrgUsername]
  }
}


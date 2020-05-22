package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrgRequired extends js.Object {
  var headers: Accept
  var method: String
  var params: OrgRequired
  var url: String
}

object ParamsOrgRequired {
  @scala.inline
  def apply(headers: Accept, method: String, params: OrgRequired, url: String): ParamsOrgRequired = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrgRequired]
  }
}


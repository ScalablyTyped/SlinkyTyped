package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrgOwner extends js.Object {
  var method: String
  var params: OrgOwner
  var url: String
}

object ParamsOrgOwner {
  @scala.inline
  def apply(method: String, params: OrgOwner, url: String): ParamsOrgOwner = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrgOwner]
  }
}


package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrganization extends js.Object {
  var method: String
  var params: Organization
  var url: String
}

object ParamsOrganization {
  @scala.inline
  def apply(method: String, params: Organization, url: String): ParamsOrganization = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrganization]
  }
}


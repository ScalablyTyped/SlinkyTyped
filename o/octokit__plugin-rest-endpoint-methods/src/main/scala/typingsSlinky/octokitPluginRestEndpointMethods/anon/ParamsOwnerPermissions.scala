package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOwnerPermissions extends js.Object {
  var method: String
  var params: OwnerPermissions
  var url: String
}

object ParamsOwnerPermissions {
  @scala.inline
  def apply(method: String, params: OwnerPermissions, url: String): ParamsOwnerPermissions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOwnerPermissions]
  }
}


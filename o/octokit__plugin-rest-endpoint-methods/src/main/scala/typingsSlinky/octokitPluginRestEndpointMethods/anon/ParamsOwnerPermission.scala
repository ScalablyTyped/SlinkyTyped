package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOwnerPermission extends js.Object {
  var method: String
  var params: OwnerPermission
  var url: String
}

object ParamsOwnerPermission {
  @scala.inline
  def apply(method: String, params: OwnerPermission, url: String): ParamsOwnerPermission = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOwnerPermission]
  }
}


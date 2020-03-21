package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonPermission extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonPermission
  var url: String
}

object AnonParamsAnonPermission {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonPermission, url: String): AnonParamsAnonPermission = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonPermission]
  }
}


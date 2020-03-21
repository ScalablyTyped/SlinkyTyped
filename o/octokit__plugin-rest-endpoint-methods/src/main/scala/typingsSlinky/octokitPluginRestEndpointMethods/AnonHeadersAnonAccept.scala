package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeadersAnonAccept extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonPermissions
  var url: String
}

object AnonHeadersAnonAccept {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonPermissions, url: String): AnonHeadersAnonAccept = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeadersAnonAccept]
  }
}


package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonKey extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonKey
  var url: String
}

object AnonParamsAnonKey {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonKey, url: String): AnonParamsAnonKey = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonKey]
  }
}


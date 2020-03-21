package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonLimit extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonLimit
  var url: String
}

object AnonParamsAnonLimit {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonLimit, url: String): AnonParamsAnonLimit = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonLimit]
  }
}


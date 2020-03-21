package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonMessage extends js.Object {
  var method: String
  var params: AnonMessage
  var url: String
}

object AnonParamsAnonMessage {
  @scala.inline
  def apply(method: String, params: AnonMessage, url: String): AnonParamsAnonMessage = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonMessage]
  }
}


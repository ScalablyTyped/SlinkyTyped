package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsMessage extends js.Object {
  var method: String
  var params: Message
  var url: String
}

object ParamsMessage {
  @scala.inline
  def apply(method: String, params: Message, url: String): ParamsMessage = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsMessage]
  }
}


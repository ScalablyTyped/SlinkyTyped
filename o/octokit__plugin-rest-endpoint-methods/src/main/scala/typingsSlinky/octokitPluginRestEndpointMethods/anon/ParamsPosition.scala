package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsPosition extends js.Object {
  var headers: Accept
  var method: String
  var params: Position
  var url: String
}

object ParamsPosition {
  @scala.inline
  def apply(headers: Accept, method: String, params: Position, url: String): ParamsPosition = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsPosition]
  }
}


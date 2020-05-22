package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsActions extends js.Object {
  var headers: Accept
  var method: String
  var params: Actions
  var url: String
}

object ParamsActions {
  @scala.inline
  def apply(headers: Accept, method: String, params: Actions, url: String): ParamsActions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsActions]
  }
}


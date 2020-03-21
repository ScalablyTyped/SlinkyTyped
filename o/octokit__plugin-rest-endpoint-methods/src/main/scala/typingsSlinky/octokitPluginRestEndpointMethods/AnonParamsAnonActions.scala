package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonActions extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonActions
  var url: String
}

object AnonParamsAnonActions {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonActions, url: String): AnonParamsAnonActions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonActions]
  }
}


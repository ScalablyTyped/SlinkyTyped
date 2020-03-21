package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParamsAnonRepoState extends js.Object {
  var headers: AnonAccept
  var method: String
  var params: AnonRepoState
  var url: String
}

object AnonParamsAnonRepoState {
  @scala.inline
  def apply(headers: AnonAccept, method: String, params: AnonRepoState, url: String): AnonParamsAnonRepoState = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParamsAnonRepoState]
  }
}


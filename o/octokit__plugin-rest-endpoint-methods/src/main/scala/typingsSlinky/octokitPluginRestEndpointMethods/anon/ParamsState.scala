package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsState extends js.Object {
  var method: String
  var params: State
  var url: String
}

object ParamsState {
  @scala.inline
  def apply(method: String, params: State, url: String): ParamsState = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsState]
  }
}


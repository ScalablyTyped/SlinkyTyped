package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsKey extends js.Object {
  var headers: Accept
  var method: String
  var params: Key
  var url: String
}

object ParamsKey {
  @scala.inline
  def apply(headers: Accept, method: String, params: Key, url: String): ParamsKey = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsKey]
  }
}


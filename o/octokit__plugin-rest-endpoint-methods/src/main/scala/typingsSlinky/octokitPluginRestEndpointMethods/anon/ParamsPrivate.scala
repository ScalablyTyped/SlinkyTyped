package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsPrivate extends js.Object {
  var headers: Accept
  var method: String
  var params: Private
  var url: String
}

object ParamsPrivate {
  @scala.inline
  def apply(headers: Accept, method: String, params: Private, url: String): ParamsPrivate = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsPrivate]
  }
}


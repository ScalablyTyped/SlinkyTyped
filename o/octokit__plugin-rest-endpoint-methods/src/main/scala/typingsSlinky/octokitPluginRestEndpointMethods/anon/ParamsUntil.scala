package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsUntil extends js.Object {
  var method: String
  var params: Until
  var url: String
}

object ParamsUntil {
  @scala.inline
  def apply(method: String, params: Until, url: String): ParamsUntil = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsUntil]
  }
}


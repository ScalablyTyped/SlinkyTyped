package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsNameOwner extends js.Object {
  var headers: Accept
  var method: String
  var params: NameOwner
  var url: String
}

object ParamsNameOwner {
  @scala.inline
  def apply(headers: Accept, method: String, params: NameOwner, url: String): ParamsNameOwner = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsNameOwner]
  }
}


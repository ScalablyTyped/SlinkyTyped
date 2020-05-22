package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsAppslug extends js.Object {
  var headers: Accept
  var method: String
  var params: Appslug
  var url: String
}

object ParamsAppslug {
  @scala.inline
  def apply(headers: Accept, method: String, params: Appslug, url: String): ParamsAppslug = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsAppslug]
  }
}


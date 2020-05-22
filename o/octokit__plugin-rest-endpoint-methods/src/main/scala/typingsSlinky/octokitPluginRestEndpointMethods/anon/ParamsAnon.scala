package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsAnon extends js.Object {
  var method: String
  var params: Anon
  var url: String
}

object ParamsAnon {
  @scala.inline
  def apply(method: String, params: Anon, url: String): ParamsAnon = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsAnon]
  }
}


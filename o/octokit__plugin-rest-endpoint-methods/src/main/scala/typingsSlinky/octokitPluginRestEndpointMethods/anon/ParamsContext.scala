package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsContext extends js.Object {
  var method: String
  var params: Context
  var url: String
}

object ParamsContext {
  @scala.inline
  def apply(method: String, params: Context, url: String): ParamsContext = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsContext]
  }
}


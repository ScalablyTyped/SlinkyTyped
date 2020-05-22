package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsBefore extends js.Object {
  var method: String
  var params: Before
  var url: String
}

object ParamsBefore {
  @scala.inline
  def apply(method: String, params: Before, url: String): ParamsBefore = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsBefore]
  }
}


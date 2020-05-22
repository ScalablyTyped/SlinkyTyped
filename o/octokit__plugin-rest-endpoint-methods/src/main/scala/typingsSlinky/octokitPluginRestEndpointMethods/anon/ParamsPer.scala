package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsPer extends js.Object {
  var method: String
  var params: Per
  var url: String
}

object ParamsPer {
  @scala.inline
  def apply(method: String, params: Per, url: String): ParamsPer = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsPer]
  }
}


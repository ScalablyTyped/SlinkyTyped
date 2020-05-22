package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsBranch extends js.Object {
  var method: String
  var params: Branch
  var url: String
}

object ParamsBranch {
  @scala.inline
  def apply(method: String, params: Branch, url: String): ParamsBranch = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsBranch]
  }
}


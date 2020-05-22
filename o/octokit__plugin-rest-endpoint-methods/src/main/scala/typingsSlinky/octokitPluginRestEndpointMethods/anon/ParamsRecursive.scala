package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsRecursive extends js.Object {
  var method: String
  var params: Recursive
  var url: String
}

object ParamsRecursive {
  @scala.inline
  def apply(method: String, params: Recursive, url: String): ParamsRecursive = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsRecursive]
  }
}


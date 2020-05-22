package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsRef extends js.Object {
  var method: String
  var params: Ref
  var url: String
}

object ParamsRef {
  @scala.inline
  def apply(method: String, params: Ref, url: String): ParamsRef = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsRef]
  }
}


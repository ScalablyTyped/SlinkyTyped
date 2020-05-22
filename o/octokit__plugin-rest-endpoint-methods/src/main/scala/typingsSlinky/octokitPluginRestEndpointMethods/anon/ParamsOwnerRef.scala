package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOwnerRef extends js.Object {
  var method: String
  var params: OwnerRef
  var url: String
}

object ParamsOwnerRef {
  @scala.inline
  def apply(method: String, params: OwnerRef, url: String): ParamsOwnerRef = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOwnerRef]
  }
}


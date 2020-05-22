package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsReadonly extends js.Object {
  var method: String
  var params: Readonly
  var url: String
}

object ParamsReadonly {
  @scala.inline
  def apply(method: String, params: Readonly, url: String): ParamsReadonly = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsReadonly]
  }
}


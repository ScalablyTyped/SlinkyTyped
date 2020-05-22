package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsHead extends js.Object {
  var method: String
  var params: Head
  var url: String
}

object ParamsHead {
  @scala.inline
  def apply(method: String, params: Head, url: String): ParamsHead = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsHead]
  }
}


package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsDescription extends js.Object {
  var method: String
  var params: Description
  var url: String
}

object ParamsDescription {
  @scala.inline
  def apply(method: String, params: Description, url: String): ParamsDescription = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDescription]
  }
}


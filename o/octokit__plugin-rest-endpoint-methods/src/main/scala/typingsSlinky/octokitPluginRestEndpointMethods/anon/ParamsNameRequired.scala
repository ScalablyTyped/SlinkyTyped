package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsNameRequired extends js.Object {
  var method: String
  var params: NameRequired
  var url: String
}

object ParamsNameRequired {
  @scala.inline
  def apply(method: String, params: NameRequired, url: String): ParamsNameRequired = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsNameRequired]
  }
}


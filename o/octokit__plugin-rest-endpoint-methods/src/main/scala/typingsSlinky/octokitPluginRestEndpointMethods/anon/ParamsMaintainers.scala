package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsMaintainers extends js.Object {
  var method: String
  var params: Maintainers
  var url: String
}

object ParamsMaintainers {
  @scala.inline
  def apply(method: String, params: Maintainers, url: String): ParamsMaintainers = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsMaintainers]
  }
}


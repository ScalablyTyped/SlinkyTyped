package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsStrict extends js.Object {
  var method: String
  var params: Strict
  var url: String
}

object ParamsStrict {
  @scala.inline
  def apply(method: String, params: Strict, url: String): ParamsStrict = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsStrict]
  }
}


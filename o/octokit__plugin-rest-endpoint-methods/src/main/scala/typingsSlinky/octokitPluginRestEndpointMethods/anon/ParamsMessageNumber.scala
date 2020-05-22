package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsMessageNumber extends js.Object {
  var method: String
  var params: MessageNumber
  var url: String
}

object ParamsMessageNumber {
  @scala.inline
  def apply(method: String, params: MessageNumber, url: String): ParamsMessageNumber = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsMessageNumber]
  }
}


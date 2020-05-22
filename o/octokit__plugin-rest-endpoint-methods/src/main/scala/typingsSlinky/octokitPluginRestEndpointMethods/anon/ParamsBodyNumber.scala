package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsBodyNumber extends js.Object {
  var method: String
  var params: BodyNumber
  var url: String
}

object ParamsBodyNumber {
  @scala.inline
  def apply(method: String, params: BodyNumber, url: String): ParamsBodyNumber = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsBodyNumber]
  }
}


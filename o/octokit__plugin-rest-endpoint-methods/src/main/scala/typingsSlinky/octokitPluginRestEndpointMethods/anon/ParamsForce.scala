package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsForce extends js.Object {
  var method: String
  var params: Force
  var url: String
}

object ParamsForce {
  @scala.inline
  def apply(method: String, params: Force, url: String): ParamsForce = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsForce]
  }
}


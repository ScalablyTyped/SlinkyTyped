package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsOrder extends js.Object {
  var method: String
  var params: Order
  var url: String
}

object ParamsOrder {
  @scala.inline
  def apply(method: String, params: Order, url: String): ParamsOrder = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsOrder]
  }
}


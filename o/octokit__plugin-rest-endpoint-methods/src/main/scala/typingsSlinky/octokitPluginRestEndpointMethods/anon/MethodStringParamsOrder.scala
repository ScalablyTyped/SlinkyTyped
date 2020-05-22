package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodStringParamsOrder extends js.Object {
  var headers: Accept
  var method: String
  var params: Order
  var url: String
}

object MethodStringParamsOrder {
  @scala.inline
  def apply(headers: Accept, method: String, params: Order, url: String): MethodStringParamsOrder = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodStringParamsOrder]
  }
}


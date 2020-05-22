package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var order: Enum
  var page: Type
  var per_page: Type
  var q: Required
  var sort: Enum
}

object Order {
  @scala.inline
  def apply(order: Enum, page: Type, per_page: Type, q: Required, sort: Enum): Order = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], per_page = per_page.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}


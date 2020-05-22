package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Q extends js.Object {
  var order: Enum
  var q: Required
  var repository_id: Required
  var sort: Enum
}

object Q {
  @scala.inline
  def apply(order: Enum, q: Required, repository_id: Required, sort: Enum): Q = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Q]
  }
}


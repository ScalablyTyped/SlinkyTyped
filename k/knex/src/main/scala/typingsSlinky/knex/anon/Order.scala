package typingsSlinky.knex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var column: String
  var order: js.UndefOr[String] = js.undefined
}

object Order {
  @scala.inline
  def apply(column: String, order: String = null): Order = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}


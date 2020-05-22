package typingsSlinky.knex.anon

import typingsSlinky.knex.knexStrings.asc
import typingsSlinky.knex.knexStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column[TRecord] extends js.Object {
  var column: /* keyof TRecord */ String
  var order: js.UndefOr[asc | desc] = js.undefined
}

object Column {
  @scala.inline
  def apply[TRecord](column: /* keyof TRecord */ String, order: asc | desc = null): Column[TRecord] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column[TRecord]]
  }
}


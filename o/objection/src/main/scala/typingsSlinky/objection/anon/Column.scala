package typingsSlinky.objection.anon

import typingsSlinky.objection.mod.ColumnRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: ColumnRef
  var order: js.UndefOr[String] = js.undefined
}

object Column {
  @scala.inline
  def apply(column: ColumnRef, order: String = null): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}


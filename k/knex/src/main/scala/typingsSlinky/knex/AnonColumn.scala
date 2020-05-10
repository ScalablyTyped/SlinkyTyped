package typingsSlinky.knex

import typingsSlinky.knex.knexStrings.asc
import typingsSlinky.knex.knexStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumn[TRecord] extends js.Object {
  var column: /* keyof TRecord */ String = js.native
  var order: js.UndefOr[asc | desc] = js.native
}

object AnonColumn {
  @scala.inline
  def apply[TRecord](column: /* keyof TRecord */ String): AnonColumn[TRecord] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn[TRecord]]
  }
  @scala.inline
  implicit class AnonColumnOps[Self[trecord] <: AnonColumn[trecord], TRecord] (val x: Self[TRecord]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRecord] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRecord]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TRecord] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TRecord] with Other]
    @scala.inline
    def withColumn(value: /* keyof TRecord */ String): Self[TRecord] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: asc | desc): Self[TRecord] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self[TRecord] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
  }
  
}


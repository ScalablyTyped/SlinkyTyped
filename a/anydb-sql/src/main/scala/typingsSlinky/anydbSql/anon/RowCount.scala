package typingsSlinky.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowCount[T] extends js.Object {
  var rowCount: Double = js.native
  var rows: js.Array[T] = js.native
}

object RowCount {
  @scala.inline
  def apply[T](rowCount: Double, rows: js.Array[T]): RowCount[T] = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowCount[T]]
  }
  @scala.inline
  implicit class RowCountOps[Self[t] <: RowCount[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withRowCount(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnEnd[K, D] extends js.Object {
  var column: Resizable[K, D] = js.native
  var columnEnd: ClassNameLabel[K, D] = js.native
  var row: Sortable[K, D] = js.native
  var rowEnd: LabelRenderer[K, D] = js.native
}

object ColumnEnd {
  @scala.inline
  def apply[K, D](
    column: Resizable[K, D],
    columnEnd: ClassNameLabel[K, D],
    row: Sortable[K, D],
    rowEnd: LabelRenderer[K, D]
  ): ColumnEnd[K, D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnEnd = columnEnd.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowEnd = rowEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnEnd[K, D]]
  }
  @scala.inline
  implicit class ColumnEndOps[Self[k, d] <: ColumnEnd[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withColumn(value: Resizable[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnEnd(value: ClassNameLabel[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Sortable[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowEnd(value: LabelRenderer[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEnd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


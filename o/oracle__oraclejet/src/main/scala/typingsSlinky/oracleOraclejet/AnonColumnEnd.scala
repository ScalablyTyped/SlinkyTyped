package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumnEnd[K, D] extends js.Object {
  var column: AnonResizable[K, D] = js.native
  var columnEnd: AnonClassNameLabel[K, D] = js.native
  var row: AnonSortable[K, D] = js.native
  var rowEnd: AnonLabelRenderer[K, D] = js.native
}

object AnonColumnEnd {
  @scala.inline
  def apply[K, D](
    column: AnonResizable[K, D],
    columnEnd: AnonClassNameLabel[K, D],
    row: AnonSortable[K, D],
    rowEnd: AnonLabelRenderer[K, D]
  ): AnonColumnEnd[K, D] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnEnd = columnEnd.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowEnd = rowEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnEnd[K, D]]
  }
  @scala.inline
  implicit class AnonColumnEndOps[Self[k, d] <: AnonColumnEnd[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withColumn(value: AnonResizable[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnEnd(value: AnonClassNameLabel[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: AnonSortable[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowEnd(value: AnonLabelRenderer[K, D]): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEnd")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowK[K] extends js.Object {
  var column: js.UndefOr[K] = js.native
  var row: K = js.native
}

object RowK {
  @scala.inline
  def apply[K](row: K): RowK[K] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowK[K]]
  }
  @scala.inline
  implicit class RowKOps[Self[k] <: RowK[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withRow(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: K): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
  }
  
}


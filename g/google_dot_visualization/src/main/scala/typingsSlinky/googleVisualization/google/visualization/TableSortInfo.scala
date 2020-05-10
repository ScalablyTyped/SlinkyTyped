package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableSortInfo extends js.Object {
  var ascending: Boolean = js.native
  var column: Double = js.native
  var sortedIndexes: js.Array[Double] = js.native
}

object TableSortInfo {
  @scala.inline
  def apply(ascending: Boolean, column: Double, sortedIndexes: js.Array[Double]): TableSortInfo = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sortedIndexes = sortedIndexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortInfo]
  }
  @scala.inline
  implicit class TableSortInfoOps[Self <: TableSortInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortedIndexes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortedIndexes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


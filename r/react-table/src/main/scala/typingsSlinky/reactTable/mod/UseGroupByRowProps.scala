package typingsSlinky.reactTable.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseGroupByRowProps[D /* <: js.Object */] extends js.Object {
  var depth: Double = js.native
  var groupById: IdType[D] = js.native
  var groupByVal: String = js.native
  var id: String = js.native
  var index: Double = js.native
  var isGrouped: Boolean = js.native
  var subRows: js.Array[Row[D]] = js.native
  var values: Record[IdType[D], AggregatedValue] = js.native
}

object UseGroupByRowProps {
  @scala.inline
  def apply[D](
    depth: Double,
    groupById: IdType[D],
    groupByVal: String,
    id: String,
    index: Double,
    isGrouped: Boolean,
    subRows: js.Array[Row[D]],
    values: Record[IdType[D], AggregatedValue]
  ): UseGroupByRowProps[D] = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], groupById = groupById.asInstanceOf[js.Any], groupByVal = groupByVal.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByRowProps[D]]
  }
  @scala.inline
  implicit class UseGroupByRowPropsOps[Self[d] <: UseGroupByRowProps[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withDepth(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupById(value: IdType[D]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupById")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupByVal(value: String): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByVal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGrouped(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubRows(value: js.Array[Row[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: Record[IdType[D], AggregatedValue]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


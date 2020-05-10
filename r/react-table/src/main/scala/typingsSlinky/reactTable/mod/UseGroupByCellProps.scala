package typingsSlinky.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseGroupByCellProps[D /* <: js.Object */] extends js.Object {
  var isAggregated: Boolean = js.native
  var isGrouped: Boolean = js.native
  var isPlaceholder: Boolean = js.native
}

object UseGroupByCellProps {
  @scala.inline
  def apply[D](isAggregated: Boolean, isGrouped: Boolean, isPlaceholder: Boolean): UseGroupByCellProps[D] = {
    val __obj = js.Dynamic.literal(isAggregated = isAggregated.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], isPlaceholder = isPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseGroupByCellProps[D]]
  }
  @scala.inline
  implicit class UseGroupByCellPropsOps[Self[d] <: UseGroupByCellProps[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withIsAggregated(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAggregated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGrouped(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGrouped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPlaceholder(value: Boolean): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


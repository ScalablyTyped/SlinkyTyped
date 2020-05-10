package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAggregate extends js.Object {
  var aggChildren: js.Array[_] = js.native
  var aggIndex: Double = js.native
  var aggLabelFilter: js.Any = js.native
  var children: js.Array[_] = js.native
  var collapsed: Boolean = js.native
  var depth: Double = js.native
  var entity: js.Any = js.native
  var field: String = js.native
  var groupInitState: Boolean = js.native
  var isAggRow: Boolean = js.native
  var label: String = js.native
  var offsetLeft: Double = js.native
  var offsetTop: Double = js.native
  var parent: js.Any = js.native
  var rowFactory: IRowFactory = js.native
  var rowHeight: Double = js.native
  var rowIndex: Double = js.native
}

object IAggregate {
  @scala.inline
  def apply(
    aggChildren: js.Array[_],
    aggIndex: Double,
    aggLabelFilter: js.Any,
    children: js.Array[_],
    collapsed: Boolean,
    depth: Double,
    entity: js.Any,
    field: String,
    groupInitState: Boolean,
    isAggRow: Boolean,
    label: String,
    offsetLeft: Double,
    offsetTop: Double,
    parent: js.Any,
    rowFactory: IRowFactory,
    rowHeight: Double,
    rowIndex: Double
  ): IAggregate = {
    val __obj = js.Dynamic.literal(aggChildren = aggChildren.asInstanceOf[js.Any], aggIndex = aggIndex.asInstanceOf[js.Any], aggLabelFilter = aggLabelFilter.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], groupInitState = groupInitState.asInstanceOf[js.Any], isAggRow = isAggRow.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rowFactory = rowFactory.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAggregate]
  }
  @scala.inline
  implicit class IAggregateOps[Self <: IAggregate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggChildren(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAggLabelFilter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggLabelFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupInitState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupInitState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAggRow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAggRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowFactory(value: IRowFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


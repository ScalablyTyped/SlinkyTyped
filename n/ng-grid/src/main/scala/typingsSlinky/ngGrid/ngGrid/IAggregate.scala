package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggChildrenVarargs(value: js.Any*): Self = this.set("aggChildren", js.Array(value :_*))
    
    @scala.inline
    def setAggChildren(value: js.Array[_]): Self = this.set("aggChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggIndex(value: Double): Self = this.set("aggIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggLabelFilter(value: js.Any): Self = this.set("aggLabelFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: js.Any*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[_]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity(value: js.Any): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupInitState(value: Boolean): Self = this.set("groupInitState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAggRow(value: Boolean): Self = this.set("isAggRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetLeft(value: Double): Self = this.set("offsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetTop(value: Double): Self = this.set("offsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFactory(value: IRowFactory): Self = this.set("rowFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
  }
}

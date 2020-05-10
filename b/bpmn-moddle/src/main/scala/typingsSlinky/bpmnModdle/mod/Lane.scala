package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lane extends BaseElement {
  var childLaneSet: LaneSet = js.native
  var flowNodeRef: js.Array[FlowNode] = js.native
  var name: String = js.native
  var partitionElement: BaseElement = js.native
  var partitionElementRef: BaseElement = js.native
}

object Lane {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    childLaneSet: LaneSet,
    flowNodeRef: js.Array[FlowNode],
    id: String,
    name: String,
    partitionElement: BaseElement,
    partitionElementRef: BaseElement
  ): Lane = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], childLaneSet = childLaneSet.asInstanceOf[js.Any], flowNodeRef = flowNodeRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionElement = partitionElement.asInstanceOf[js.Any], partitionElementRef = partitionElementRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lane]
  }
  @scala.inline
  implicit class LaneOps[Self <: Lane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildLaneSet(value: LaneSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childLaneSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlowNodeRef(value: js.Array[FlowNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flowNodeRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitionElement(value: BaseElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPartitionElementRef(value: BaseElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partitionElementRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


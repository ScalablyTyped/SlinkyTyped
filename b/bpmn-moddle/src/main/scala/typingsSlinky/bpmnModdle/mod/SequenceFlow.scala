package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceFlow extends FlowElement {
  var conditionExpression: Expression = js.native
  var isImmediate: Boolean = js.native
  var sourceRef: FlowNode = js.native
  var targetRef: FlowNode = js.native
}

object SequenceFlow {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    conditionExpression: Expression,
    id: String,
    isImmediate: Boolean,
    monitoring: Monitoring,
    sourceRef: FlowNode,
    targetRef: FlowNode
  ): SequenceFlow = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], conditionExpression = conditionExpression.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isImmediate = isImmediate.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceFlow]
  }
  @scala.inline
  implicit class SequenceFlowOps[Self <: SequenceFlow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditionExpression(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsImmediate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isImmediate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceRef(value: FlowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetRef(value: FlowNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


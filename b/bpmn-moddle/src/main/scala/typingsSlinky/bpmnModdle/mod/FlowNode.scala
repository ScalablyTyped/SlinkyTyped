package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowNode extends FlowElement {
  var incoming: js.Array[SequenceFlow] = js.native
  var lanes: js.Array[Lane] = js.native
  var outgoing: js.Array[SequenceFlow] = js.native
}

object FlowNode {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    id: String,
    incoming: js.Array[SequenceFlow],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow]
  ): FlowNode = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowNode]
  }
  @scala.inline
  implicit class FlowNodeOps[Self <: FlowNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncoming(value: js.Array[SequenceFlow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incoming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanes(value: js.Array[Lane]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lanes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoing(value: js.Array[SequenceFlow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoing")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


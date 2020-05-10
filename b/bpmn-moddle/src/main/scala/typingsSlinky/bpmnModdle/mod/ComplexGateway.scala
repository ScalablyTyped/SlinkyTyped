package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplexGateway extends Gateway {
  var activationCondition: Expression = js.native
  var default: SequenceFlow = js.native
}

object ComplexGateway {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    activationCondition: Expression,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    default: SequenceFlow,
    gatewayDirection: GatewayDirection,
    id: String,
    incoming: js.Array[SequenceFlow],
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow]
  ): ComplexGateway = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], activationCondition = activationCondition.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], gatewayDirection = gatewayDirection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexGateway]
  }
  @scala.inline
  implicit class ComplexGatewayOps[Self <: ComplexGateway] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivationCondition(value: Expression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activationCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: SequenceFlow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


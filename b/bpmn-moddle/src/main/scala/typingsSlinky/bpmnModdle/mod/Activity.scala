package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends FlowNode {
  var boundaryEventRefs: js.Array[BoundaryEvent] = js.native
  var completionQuantity: Double = js.native
  var dataInputAssociations: js.Array[DataInputAssociation] = js.native
  var dataOutputAssociations: js.Array[DataOutputAssociation] = js.native
  var default: SequenceFlow = js.native
  var ioSpecification: InputOutputSpecification = js.native
  var isForCompensation: Boolean = js.native
  var loopCharacteristics: LoopCharacteristics = js.native
  var properties: js.Array[Property] = js.native
  var resources: ResourceRole = js.native
  var startQuantity: Double = js.native
}

object Activity {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    boundaryEventRefs: js.Array[BoundaryEvent],
    categoryValueRef: js.Array[CategoryValue],
    completionQuantity: Double,
    dataInputAssociations: js.Array[DataInputAssociation],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    default: SequenceFlow,
    id: String,
    incoming: js.Array[SequenceFlow],
    ioSpecification: InputOutputSpecification,
    isForCompensation: Boolean,
    lanes: js.Array[Lane],
    loopCharacteristics: LoopCharacteristics,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    properties: js.Array[Property],
    resources: ResourceRole,
    startQuantity: Double
  ): Activity = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], boundaryEventRefs = boundaryEventRefs.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], completionQuantity = completionQuantity.asInstanceOf[js.Any], dataInputAssociations = dataInputAssociations.asInstanceOf[js.Any], dataOutputAssociations = dataOutputAssociations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], isForCompensation = isForCompensation.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopCharacteristics = loopCharacteristics.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], startQuantity = startQuantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundaryEventRefs(value: js.Array[BoundaryEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundaryEventRefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompletionQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completionQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataInputAssociations(value: js.Array[DataInputAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInputAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataOutputAssociations(value: js.Array[DataOutputAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataOutputAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: SequenceFlow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIoSpecification(value: InputOutputSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ioSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsForCompensation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isForCompensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopCharacteristics(value: LoopCharacteristics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loopCharacteristics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[Property]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: ResourceRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startQuantity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


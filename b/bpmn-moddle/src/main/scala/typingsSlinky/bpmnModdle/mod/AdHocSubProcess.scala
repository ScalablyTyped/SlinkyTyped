package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdHocSubProcess extends SubProcess {
  
  var cancelRemainingInstances: Boolean = js.native
  
  var completionCondition: Expression = js.native
  
  var ordering: AdHocOrdering = js.native
}
object AdHocSubProcess {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    artifacts: js.Array[Artifact],
    auditing: Auditing,
    boundaryEventRefs: js.Array[BoundaryEvent],
    cancelRemainingInstances: Boolean,
    categoryValueRef: js.Array[CategoryValue],
    completionCondition: Expression,
    completionQuantity: Double,
    dataInputAssociations: js.Array[DataInputAssociation],
    dataOutputAssociations: js.Array[DataOutputAssociation],
    default: SequenceFlow,
    flowElements: js.Array[FlowElement],
    id: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    ioSpecification: InputOutputSpecification,
    isForCompensation: Boolean,
    laneSets: js.Array[LaneSet],
    lanes: js.Array[Lane],
    loopCharacteristics: LoopCharacteristics,
    monitoring: Monitoring,
    ordering: AdHocOrdering,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property],
    resources: ResourceRole,
    startQuantity: Double,
    triggeredByEvent: Boolean
  ): AdHocSubProcess = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], boundaryEventRefs = boundaryEventRefs.asInstanceOf[js.Any], cancelRemainingInstances = cancelRemainingInstances.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], completionCondition = completionCondition.asInstanceOf[js.Any], completionQuantity = completionQuantity.asInstanceOf[js.Any], dataInputAssociations = dataInputAssociations.asInstanceOf[js.Any], dataOutputAssociations = dataOutputAssociations.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], ioSpecification = ioSpecification.asInstanceOf[js.Any], isForCompensation = isForCompensation.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopCharacteristics = loopCharacteristics.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], ordering = ordering.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], startQuantity = startQuantity.asInstanceOf[js.Any], triggeredByEvent = triggeredByEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdHocSubProcess]
  }
  
  @scala.inline
  implicit class AdHocSubProcessOps[Self <: AdHocSubProcess] (val x: Self) extends AnyVal {
    
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
    def setCancelRemainingInstances(value: Boolean): Self = this.set("cancelRemainingInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionCondition(value: Expression): Self = this.set("completionCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdering(value: AdHocOrdering): Self = this.set("ordering", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.bpmnModdle.mod.TypeDerived because Already inherited
- typingsSlinky.bpmnModdle.mod.BaseElement because Already inherited
- typingsSlinky.bpmnModdle.mod.FlowElementsContainer because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined laneSets, flowElements */ @js.native
trait SubChoreography extends ChoreographyActivity {
  
  var artifacts: js.Array[Artifact] = js.native
  
  var flowElements: js.Array[FlowElement] = js.native
  
  var laneSets: js.Array[LaneSet] = js.native
}
object SubChoreography {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    artifacts: js.Array[Artifact],
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    correlationKeys: js.Array[CorrelationKey],
    flowElements: js.Array[FlowElement],
    id: String,
    incoming: js.Array[SequenceFlow],
    initiatingParticipantRef: Participant,
    laneSets: js.Array[LaneSet],
    lanes: js.Array[Lane],
    loopType: ChoreographyLoopType,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    participantRef: js.Array[Participant]
  ): SubChoreography = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], initiatingParticipantRef = initiatingParticipantRef.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopType = loopType.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubChoreography]
  }
  
  @scala.inline
  implicit class SubChoreographyMutableBuilder[Self <: SubChoreography] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: js.Array[Artifact]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setFlowElements(value: js.Array[FlowElement]): Self = StObject.set(x, "flowElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowElementsVarargs(value: FlowElement*): Self = StObject.set(x, "flowElements", js.Array(value :_*))
    
    @scala.inline
    def setLaneSets(value: js.Array[LaneSet]): Self = StObject.set(x, "laneSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaneSetsVarargs(value: LaneSet*): Self = StObject.set(x, "laneSets", js.Array(value :_*))
  }
}

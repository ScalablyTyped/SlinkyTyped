package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallChoreography extends ChoreographyActivity {
  
  var calledChoreographyRef: Choreography = js.native
  
  var participantAssociations: js.Array[ParticipantAssociation] = js.native
}
object CallChoreography {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    calledChoreographyRef: Choreography,
    categoryValueRef: js.Array[CategoryValue],
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incoming: js.Array[SequenceFlow],
    initiatingParticipantRef: Participant,
    lanes: js.Array[Lane],
    loopType: ChoreographyLoopType,
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    participantAssociations: js.Array[ParticipantAssociation],
    participantRef: js.Array[Participant]
  ): CallChoreography = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], calledChoreographyRef = calledChoreographyRef.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], initiatingParticipantRef = initiatingParticipantRef.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], loopType = loopType.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], participantAssociations = participantAssociations.asInstanceOf[js.Any], participantRef = participantRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallChoreography]
  }
  
  @scala.inline
  implicit class CallChoreographyMutableBuilder[Self <: CallChoreography] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalledChoreographyRef(value: Choreography): Self = StObject.set(x, "calledChoreographyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantAssociations(value: js.Array[ParticipantAssociation]): Self = StObject.set(x, "participantAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantAssociationsVarargs(value: ParticipantAssociation*): Self = StObject.set(x, "participantAssociations", js.Array(value :_*))
  }
}

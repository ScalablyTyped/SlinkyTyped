package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallConversation extends ConversationNode {
  var calledCollaborationRef: Collaboration = js.native
  var participantAssociations: js.Array[ParticipantAssociation] = js.native
}

object CallConversation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    calledCollaborationRef: Collaboration,
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    messageFlowRefs: js.Array[MessageFlow],
    name: String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantAssociations: js.Array[ParticipantAssociation],
    participantRefs: js.Array[Participant]
  ): CallConversation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], calledCollaborationRef = calledCollaborationRef.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], messageFlowRefs = messageFlowRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], participantAssociations = participantAssociations.asInstanceOf[js.Any], participantRefs = participantRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallConversation]
  }
  @scala.inline
  implicit class CallConversationOps[Self <: CallConversation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalledCollaborationRef(value: Collaboration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calledCollaborationRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipantAssociations(value: js.Array[ParticipantAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantAssociations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


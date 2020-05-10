package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collaboration extends BaseElement {
  var artifacts: js.Array[Artifact] = js.native
  var choreographyRef: js.Array[Choreography] = js.native
  var conversationAssociations: js.Array[ConversationAssociation] = js.native
  var conversationLinks: js.Array[ConversationLink] = js.native
  var conversations: js.Array[ConversationNode] = js.native
  var correlationKeys: js.Array[CorrelationKey] = js.native
  var isClosed: Boolean = js.native
  var messageFlowAssociations: js.Array[MessageFlowAssociation] = js.native
  var messageFlows: js.Array[MessageFlow] = js.native
  var name: String = js.native
  var participantAssociations: js.Array[ParticipantAssociation] = js.native
  var participants: js.Array[Participant] = js.native
}

object Collaboration {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    artifacts: js.Array[Artifact],
    choreographyRef: js.Array[Choreography],
    conversationAssociations: js.Array[ConversationAssociation],
    conversationLinks: js.Array[ConversationLink],
    conversations: js.Array[ConversationNode],
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    isClosed: Boolean,
    messageFlowAssociations: js.Array[MessageFlowAssociation],
    messageFlows: js.Array[MessageFlow],
    name: String,
    participantAssociations: js.Array[ParticipantAssociation],
    participants: js.Array[Participant]
  ): Collaboration = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], choreographyRef = choreographyRef.asInstanceOf[js.Any], conversationAssociations = conversationAssociations.asInstanceOf[js.Any], conversationLinks = conversationLinks.asInstanceOf[js.Any], conversations = conversations.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isClosed = isClosed.asInstanceOf[js.Any], messageFlowAssociations = messageFlowAssociations.asInstanceOf[js.Any], messageFlows = messageFlows.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], participantAssociations = participantAssociations.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collaboration]
  }
  @scala.inline
  implicit class CollaborationOps[Self <: Collaboration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtifacts(value: js.Array[Artifact]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artifacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChoreographyRef(value: js.Array[Choreography]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choreographyRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConversationAssociations(value: js.Array[ConversationAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConversationLinks(value: js.Array[ConversationLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConversations(value: js.Array[ConversationNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCorrelationKeys(value: js.Array[CorrelationKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlationKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsClosed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClosed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageFlowAssociations(value: js.Array[MessageFlowAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageFlowAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessageFlows(value: js.Array[MessageFlow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageFlows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipantAssociations(value: js.Array[ParticipantAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participantAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParticipants(value: js.Array[Participant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("participants")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConversationAssociation extends ConversationNode {
  var innerConversationNodeRef: ConversationNode = js.native
  var outerConversationNodeRef: ConversationNode = js.native
}

object ConversationAssociation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    innerConversationNodeRef: ConversationNode,
    messageFlowRefs: js.Array[MessageFlow],
    name: String,
    outerConversationNodeRef: ConversationNode,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantRefs: js.Array[Participant]
  ): ConversationAssociation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], innerConversationNodeRef = innerConversationNodeRef.asInstanceOf[js.Any], messageFlowRefs = messageFlowRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outerConversationNodeRef = outerConversationNodeRef.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], participantRefs = participantRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationAssociation]
  }
  @scala.inline
  implicit class ConversationAssociationOps[Self <: ConversationAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInnerConversationNodeRef(value: ConversationNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerConversationNodeRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterConversationNodeRef(value: ConversationNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerConversationNodeRef")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


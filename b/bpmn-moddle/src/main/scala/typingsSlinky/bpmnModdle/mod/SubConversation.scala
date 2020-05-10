package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubConversation extends ConversationNode {
  var conversationNodes: js.Array[ConversationNode] = js.native
}

object SubConversation {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    conversationNodes: js.Array[ConversationNode],
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    messageFlowRefs: js.Array[MessageFlow],
    name: String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantRefs: js.Array[Participant]
  ): SubConversation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], conversationNodes = conversationNodes.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], messageFlowRefs = messageFlowRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], participantRefs = participantRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubConversation]
  }
  @scala.inline
  implicit class SubConversationOps[Self <: SubConversation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversationNodes(value: js.Array[ConversationNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversationNodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


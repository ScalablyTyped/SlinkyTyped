package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionNode extends TypeDerived {
  var incomingConversationLinks: js.Array[ConversationLink] = js.native
  var outgoingConversationLinks: js.Array[ConversationLink] = js.native
}

object InteractionNode {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    incomingConversationLinks: js.Array[ConversationLink],
    outgoingConversationLinks: js.Array[ConversationLink]
  ): InteractionNode = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionNode]
  }
  @scala.inline
  implicit class InteractionNodeOps[Self <: InteractionNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncomingConversationLinks(value: js.Array[ConversationLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incomingConversationLinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutgoingConversationLinks(value: js.Array[ConversationLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outgoingConversationLinks")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.bpmnModdle.mod.TypeDerived because Already inherited
- typingsSlinky.bpmnModdle.mod.BaseElement because Already inherited
- typingsSlinky.bpmnModdle.mod.InteractionNode because var conflicts: $parent, $type. Inlined incomingConversationLinks, outgoingConversationLinks
- typingsSlinky.bpmnModdle.mod.FlowElementsContainer because var conflicts: $attrs, $parent, $type, documentation, extensionDefinitions, extensionElements, id. Inlined laneSets, flowElements */ @js.native
trait SubProcess extends Activity {
  var artifacts: js.Array[Artifact] = js.native
  var flowElements: js.Array[FlowElement] = js.native
  var incomingConversationLinks: js.Array[ConversationLink] = js.native
  var laneSets: js.Array[LaneSet] = js.native
  var outgoingConversationLinks: js.Array[ConversationLink] = js.native
  var triggeredByEvent: Boolean = js.native
}


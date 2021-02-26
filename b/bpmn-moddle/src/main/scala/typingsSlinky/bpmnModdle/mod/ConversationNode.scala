package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.bpmnModdle.mod.TypeDerived because Already inherited
- typingsSlinky.bpmnModdle.mod.BaseElement because var conflicts: $parent, $type. Inlined id, documentation, extensionDefinitions, extensionElements, $attrs */ @js.native
trait ConversationNode extends InteractionNode {
  
  /**
    * Attributes that aren't defined by the BPMN Spec such
    * as Camunda properties
    */
  @JSName("$attrs")
  var $attrs: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var correlationKeys: js.Array[CorrelationKey] = js.native
  
  /**
    * Documentation for the element
    */
  var documentation: js.UndefOr[js.Array[Documentation]] = js.native
  
  /**
    * Reference to the extension definitions for this element
    */
  var extensionDefinitions: js.UndefOr[js.Array[ExtensionDefinition]] = js.native
  
  /**
    * Extension Elements
    */
  var extensionElements: js.UndefOr[ExtensionElements] = js.native
  
  /**
    * Is the primary Id of the element
    */
  var id: String = js.native
  
  var messageFlowRefs: js.Array[MessageFlow] = js.native
  
  var name: String = js.native
  
  var participantRefs: js.Array[Participant] = js.native
}
object ConversationNode {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    correlationKeys: js.Array[CorrelationKey],
    id: String,
    incomingConversationLinks: js.Array[ConversationLink],
    messageFlowRefs: js.Array[MessageFlow],
    name: String,
    outgoingConversationLinks: js.Array[ConversationLink],
    participantRefs: js.Array[Participant]
  ): ConversationNode = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], correlationKeys = correlationKeys.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], messageFlowRefs = messageFlowRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], participantRefs = participantRefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationNode]
  }
  
  @scala.inline
  implicit class ConversationNodeMutableBuilder[Self <: ConversationNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$attrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "$attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$attrsUndefined: Self = StObject.set(x, "$attrs", js.undefined)
    
    @scala.inline
    def setCorrelationKeys(value: js.Array[CorrelationKey]): Self = StObject.set(x, "correlationKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrelationKeysVarargs(value: CorrelationKey*): Self = StObject.set(x, "correlationKeys", js.Array(value :_*))
    
    @scala.inline
    def setDocumentation(value: js.Array[Documentation]): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    @scala.inline
    def setDocumentationVarargs(value: Documentation*): Self = StObject.set(x, "documentation", js.Array(value :_*))
    
    @scala.inline
    def setExtensionDefinitions(value: js.Array[ExtensionDefinition]): Self = StObject.set(x, "extensionDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionDefinitionsUndefined: Self = StObject.set(x, "extensionDefinitions", js.undefined)
    
    @scala.inline
    def setExtensionDefinitionsVarargs(value: ExtensionDefinition*): Self = StObject.set(x, "extensionDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setExtensionElements(value: ExtensionElements): Self = StObject.set(x, "extensionElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionElementsUndefined: Self = StObject.set(x, "extensionElements", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFlowRefs(value: js.Array[MessageFlow]): Self = StObject.set(x, "messageFlowRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFlowRefsVarargs(value: MessageFlow*): Self = StObject.set(x, "messageFlowRefs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRefs(value: js.Array[Participant]): Self = StObject.set(x, "participantRefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantRefsVarargs(value: Participant*): Self = StObject.set(x, "participantRefs", js.Array(value :_*))
  }
}

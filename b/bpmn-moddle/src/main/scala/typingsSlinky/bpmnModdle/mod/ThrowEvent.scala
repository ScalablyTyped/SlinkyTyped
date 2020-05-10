package typingsSlinky.bpmnModdle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrowEvent extends Event {
  var dataInputAssociations: js.Array[DataInputAssociation] = js.native
  var dataInputs: js.Array[DataInput] = js.native
  var eventDefinitionRef: js.Array[EventDefinition] = js.native
  var eventDefinitions: js.Array[EventDefinition] = js.native
  var inputSet: InputSet = js.native
}

object ThrowEvent {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    auditing: Auditing,
    categoryValueRef: js.Array[CategoryValue],
    dataInputAssociations: js.Array[DataInputAssociation],
    dataInputs: js.Array[DataInput],
    eventDefinitionRef: js.Array[EventDefinition],
    eventDefinitions: js.Array[EventDefinition],
    id: String,
    incoming: js.Array[SequenceFlow],
    incomingConversationLinks: js.Array[ConversationLink],
    inputSet: InputSet,
    lanes: js.Array[Lane],
    monitoring: Monitoring,
    outgoing: js.Array[SequenceFlow],
    outgoingConversationLinks: js.Array[ConversationLink],
    properties: js.Array[Property]
  ): ThrowEvent = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], auditing = auditing.asInstanceOf[js.Any], categoryValueRef = categoryValueRef.asInstanceOf[js.Any], dataInputAssociations = dataInputAssociations.asInstanceOf[js.Any], dataInputs = dataInputs.asInstanceOf[js.Any], eventDefinitionRef = eventDefinitionRef.asInstanceOf[js.Any], eventDefinitions = eventDefinitions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], incoming = incoming.asInstanceOf[js.Any], incomingConversationLinks = incomingConversationLinks.asInstanceOf[js.Any], inputSet = inputSet.asInstanceOf[js.Any], lanes = lanes.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], outgoing = outgoing.asInstanceOf[js.Any], outgoingConversationLinks = outgoingConversationLinks.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrowEvent]
  }
  @scala.inline
  implicit class ThrowEventOps[Self <: ThrowEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataInputAssociations(value: js.Array[DataInputAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInputAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataInputs(value: js.Array[DataInput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataInputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventDefinitionRef(value: js.Array[EventDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDefinitionRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventDefinitions(value: js.Array[EventDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputSet(value: InputSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSet")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


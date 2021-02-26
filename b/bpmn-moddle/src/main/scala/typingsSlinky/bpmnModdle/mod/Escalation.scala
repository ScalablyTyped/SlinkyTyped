package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Escalation extends BaseElement {
  
  var escalationCode: String = js.native
  
  var name: String = js.native
  
  var structureRef: ItemDefinition = js.native
}
object Escalation {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    escalationCode: String,
    id: String,
    name: String,
    structureRef: ItemDefinition
  ): Escalation = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], escalationCode = escalationCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], structureRef = structureRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Escalation]
  }
  
  @scala.inline
  implicit class EscalationMutableBuilder[Self <: Escalation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscalationCode(value: String): Self = StObject.set(x, "escalationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureRef(value: ItemDefinition): Self = StObject.set(x, "structureRef", value.asInstanceOf[js.Any])
  }
}

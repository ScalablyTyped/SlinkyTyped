package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assignment extends BaseElement {
  
  var from: Expression = js.native
  
  var to: Expression = js.native
}
object Assignment {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType, from: Expression, id: String, to: Expression): Assignment = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assignment]
  }
  
  @scala.inline
  implicit class AssignmentMutableBuilder[Self <: Assignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Expression): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Expression): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}

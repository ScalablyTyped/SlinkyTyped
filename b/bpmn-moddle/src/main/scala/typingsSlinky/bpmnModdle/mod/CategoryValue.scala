package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryValue extends BaseElement {
  
  var categorizedFlowElements: js.Array[FlowElement] = js.native
  
  var value: String = js.native
}
object CategoryValue {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    categorizedFlowElements: js.Array[FlowElement],
    id: String,
    value: String
  ): CategoryValue = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], categorizedFlowElements = categorizedFlowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryValue]
  }
  
  @scala.inline
  implicit class CategoryValueMutableBuilder[Self <: CategoryValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategorizedFlowElements(value: js.Array[FlowElement]): Self = StObject.set(x, "categorizedFlowElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategorizedFlowElementsVarargs(value: FlowElement*): Self = StObject.set(x, "categorizedFlowElements", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

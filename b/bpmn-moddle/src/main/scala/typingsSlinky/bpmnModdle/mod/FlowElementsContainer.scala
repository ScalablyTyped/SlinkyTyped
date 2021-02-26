package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowElementsContainer extends BaseElement {
  
  var flowElements: js.Array[FlowElement] = js.native
  
  var laneSets: js.Array[LaneSet] = js.native
}
object FlowElementsContainer {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    flowElements: js.Array[FlowElement],
    id: String,
    laneSets: js.Array[LaneSet]
  ): FlowElementsContainer = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], flowElements = flowElements.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], laneSets = laneSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowElementsContainer]
  }
  
  @scala.inline
  implicit class FlowElementsContainerMutableBuilder[Self <: FlowElementsContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlowElements(value: js.Array[FlowElement]): Self = StObject.set(x, "flowElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowElementsVarargs(value: FlowElement*): Self = StObject.set(x, "flowElements", js.Array(value :_*))
    
    @scala.inline
    def setLaneSets(value: js.Array[LaneSet]): Self = StObject.set(x, "laneSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaneSetsVarargs(value: LaneSet*): Self = StObject.set(x, "laneSets", js.Array(value :_*))
  }
}

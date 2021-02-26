package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Association extends BaseElement {
  
  var associationDirection: AssociationDirection = js.native
  
  var sourceRef: BaseElement = js.native
  
  var targetRef: BaseElement = js.native
}
object Association {
  
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    associationDirection: AssociationDirection,
    id: String,
    sourceRef: BaseElement,
    targetRef: BaseElement
  ): Association = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], associationDirection = associationDirection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sourceRef = sourceRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Association]
  }
  
  @scala.inline
  implicit class AssociationMutableBuilder[Self <: Association] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationDirection(value: AssociationDirection): Self = StObject.set(x, "associationDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRef(value: BaseElement): Self = StObject.set(x, "sourceRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetRef(value: BaseElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
  }
}

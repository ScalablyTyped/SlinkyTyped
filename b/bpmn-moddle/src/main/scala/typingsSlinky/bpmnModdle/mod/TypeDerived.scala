package typingsSlinky.bpmnModdle.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDerived extends StObject {
  
  @JSName("$parent")
  var $parent: TypeDerived = js.native
  
  @JSName("$type")
  var $type: ElementType = js.native
}
object TypeDerived {
  
  @scala.inline
  def apply($parent: TypeDerived, $type: ElementType): TypeDerived = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDerived]
  }
  
  @scala.inline
  implicit class TypeDerivedMutableBuilder[Self <: TypeDerived] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$parent(value: TypeDerived): Self = StObject.set(x, "$parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$type(value: ElementType): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}

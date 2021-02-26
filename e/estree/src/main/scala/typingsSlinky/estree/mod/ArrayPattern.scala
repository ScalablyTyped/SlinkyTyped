package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayPattern
  extends BaseNode
     with Pattern {
  
  var elements: js.Array[Pattern] = js.native
  
  @JSName("type")
  var type_ArrayPattern: typingsSlinky.estree.estreeStrings.ArrayPattern = js.native
}
object ArrayPattern {
  
  @scala.inline
  def apply(elements: js.Array[Pattern], `type`: typingsSlinky.estree.estreeStrings.ArrayPattern): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPattern]
  }
  
  @scala.inline
  implicit class ArrayPatternMutableBuilder[Self <: ArrayPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElements(value: js.Array[Pattern]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: Pattern*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ArrayPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

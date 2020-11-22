package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ArrayExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ArrayExpression_
  extends Expression
     with BaseNode {
  
  var elements: js.Array[Null | Expression | SpreadElement_] = js.native
  
  @JSName("type")
  var type_ArrayExpression_ : ArrayExpression = js.native
}
object ArrayExpression_ {
  
  @scala.inline
  def apply(elements: js.Array[Null | Expression | SpreadElement_], `type`: ArrayExpression): ArrayExpression_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayExpression_]
  }
  
  @scala.inline
  implicit class ArrayExpression_Ops[Self <: ArrayExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElementsVarargs(value: (Null | Expression | SpreadElement_)*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[Null | Expression | SpreadElement_]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ArrayExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

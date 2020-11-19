package typingsSlinky.estreeJsx.mod

import typingsSlinky.estree.mod.BaseNode
import typingsSlinky.estree.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSXSpreadAttribute
  extends BaseNode
     with _Node {
  
  var argument: Expression = js.native
  
  @JSName("type")
  var type_JSXSpreadAttribute: typingsSlinky.estreeJsx.estreeJsxStrings.JSXSpreadAttribute = js.native
}
object JSXSpreadAttribute {
  
  @scala.inline
  def apply(argument: Expression, `type`: typingsSlinky.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): JSXSpreadAttribute = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXSpreadAttribute]
  }
  
  @scala.inline
  implicit class JSXSpreadAttributeOps[Self <: JSXSpreadAttribute] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: Expression): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estreeJsx.estreeJsxStrings.JSXSpreadAttribute): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.BlockStatement
import typingsSlinky.babelTypes.babelTypesStrings.ClassBody
import typingsSlinky.babelTypes.babelTypesStrings.Identifier
import typingsSlinky.babelTypes.babelTypesStrings.Placeholder
import typingsSlinky.babelTypes.babelTypesStrings.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placeholder_
  extends BaseNode
     with _Node {
  
  var expectedNode: Identifier | StringLiteral | typingsSlinky.babelTypes.babelTypesStrings.Expression | typingsSlinky.babelTypes.babelTypesStrings.Statement | typingsSlinky.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typingsSlinky.babelTypes.babelTypesStrings.Pattern = js.native
  
  var name: Identifier_ = js.native
  
  @JSName("type")
  var type_Placeholder_ : Placeholder = js.native
}
object Placeholder_ {
  
  @scala.inline
  def apply(
    expectedNode: Identifier | StringLiteral | typingsSlinky.babelTypes.babelTypesStrings.Expression | typingsSlinky.babelTypes.babelTypesStrings.Statement | typingsSlinky.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typingsSlinky.babelTypes.babelTypesStrings.Pattern,
    name: Identifier_,
    `type`: Placeholder
  ): Placeholder_ = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder_]
  }
  
  @scala.inline
  implicit class Placeholder_Ops[Self <: Placeholder_] (val x: Self) extends AnyVal {
    
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
    def setExpectedNode(
      value: Identifier | StringLiteral | typingsSlinky.babelTypes.babelTypesStrings.Expression | typingsSlinky.babelTypes.babelTypesStrings.Statement | typingsSlinky.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typingsSlinky.babelTypes.babelTypesStrings.Pattern
    ): Self = this.set("expectedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Identifier_): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Placeholder): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.BlockStatement
import typingsSlinky.babelTypes.babelTypesStrings.ClassBody
import typingsSlinky.babelTypes.babelTypesStrings.Identifier
import typingsSlinky.babelTypes.babelTypesStrings.Placeholder
import typingsSlinky.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
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
  implicit class Placeholder_MutableBuilder[Self <: Placeholder_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedNode(
      value: Identifier | StringLiteral | typingsSlinky.babelTypes.babelTypesStrings.Expression | typingsSlinky.babelTypes.babelTypesStrings.Statement | typingsSlinky.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typingsSlinky.babelTypes.babelTypesStrings.Pattern
    ): Self = StObject.set(x, "expectedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Identifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Placeholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnStatement
  extends BaseNode
     with Statement {
  
  var argument: js.UndefOr[Expression | Null] = js.native
  
  @JSName("type")
  var type_ReturnStatement: typingsSlinky.estree.estreeStrings.ReturnStatement = js.native
}
object ReturnStatement {
  
  @scala.inline
  def apply(`type`: typingsSlinky.estree.estreeStrings.ReturnStatement): ReturnStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnStatement]
  }
  
  @scala.inline
  implicit class ReturnStatementMutableBuilder[Self <: ReturnStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentNull: Self = StObject.set(x, "argument", null)
    
    @scala.inline
    def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ReturnStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

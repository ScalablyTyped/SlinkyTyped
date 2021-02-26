package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyStatement
  extends BaseNode
     with Statement {
  
  @JSName("type")
  var type_EmptyStatement: typingsSlinky.estree.estreeStrings.EmptyStatement = js.native
}
object EmptyStatement {
  
  @scala.inline
  def apply(`type`: typingsSlinky.estree.estreeStrings.EmptyStatement): EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyStatement]
  }
  
  @scala.inline
  implicit class EmptyStatementMutableBuilder[Self <: EmptyStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

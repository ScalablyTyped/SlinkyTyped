package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndStatement extends StObject {
  
  /**
    * The statements to combine with AND logic. You can use any statements that can be nested. 
    */
  var Statements: typingsSlinky.awsSdk.wafv2Mod.Statements = js.native
}
object AndStatement {
  
  @scala.inline
  def apply(Statements: Statements): AndStatement = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndStatement]
  }
  
  @scala.inline
  implicit class AndStatementMutableBuilder[Self <: AndStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatements(value: Statements): Self = StObject.set(x, "Statements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "Statements", js.Array(value :_*))
  }
}

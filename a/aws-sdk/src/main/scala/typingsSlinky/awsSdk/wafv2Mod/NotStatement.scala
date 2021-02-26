package typingsSlinky.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotStatement extends StObject {
  
  /**
    * The statement to negate. You can use any statement that can be nested.
    */
  var Statement: typingsSlinky.awsSdk.wafv2Mod.Statement = js.native
}
object NotStatement {
  
  @scala.inline
  def apply(Statement: Statement): NotStatement = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotStatement]
  }
  
  @scala.inline
  implicit class NotStatementMutableBuilder[Self <: NotStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatement(value: Statement): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
  }
}

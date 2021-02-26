package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxListObjectExpressionDef...
  */
@js.native
trait INxListObjectExpressionDef extends StObject {
  
  /**
    * Value of the expression
    */
  var qExpr: String = js.native
  
  /**
    * Refers to an expression stored in the library.
    */
  var qLibraryId: String = js.native
}
object INxListObjectExpressionDef {
  
  @scala.inline
  def apply(qExpr: String, qLibraryId: String): INxListObjectExpressionDef = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxListObjectExpressionDef]
  }
  
  @scala.inline
  implicit class INxListObjectExpressionDefMutableBuilder[Self <: INxListObjectExpressionDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQExpr(value: String): Self = StObject.set(x, "qExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
  }
}

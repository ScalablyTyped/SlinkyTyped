package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportExpression
  extends BaseNode
     with Expression {
  
  var source: Expression = js.native
  
  @JSName("type")
  var type_ImportExpression: typingsSlinky.estree.estreeStrings.ImportExpression = js.native
}
object ImportExpression {
  
  @scala.inline
  def apply(source: Expression, `type`: typingsSlinky.estree.estreeStrings.ImportExpression): ImportExpression = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportExpression]
  }
  
  @scala.inline
  implicit class ImportExpressionMutableBuilder[Self <: ImportExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Expression): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.ImportExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

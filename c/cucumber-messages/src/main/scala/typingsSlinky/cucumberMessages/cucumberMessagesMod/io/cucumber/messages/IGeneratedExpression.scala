package typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a GeneratedExpression. */
@js.native
trait IGeneratedExpression extends StObject {
  
  /** GeneratedExpression parameterTypeNames */
  var parameterTypeNames: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** GeneratedExpression text */
  var text: js.UndefOr[String | Null] = js.native
}
object IGeneratedExpression {
  
  @scala.inline
  def apply(): IGeneratedExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeneratedExpression]
  }
  
  @scala.inline
  implicit class IGeneratedExpressionMutableBuilder[Self <: IGeneratedExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameterTypeNames(value: js.Array[String]): Self = StObject.set(x, "parameterTypeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterTypeNamesNull: Self = StObject.set(x, "parameterTypeNames", null)
    
    @scala.inline
    def setParameterTypeNamesUndefined: Self = StObject.set(x, "parameterTypeNames", js.undefined)
    
    @scala.inline
    def setParameterTypeNamesVarargs(value: String*): Self = StObject.set(x, "parameterTypeNames", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextNull: Self = StObject.set(x, "text", null)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}

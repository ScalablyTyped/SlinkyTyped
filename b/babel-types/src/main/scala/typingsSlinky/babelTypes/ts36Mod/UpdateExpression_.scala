package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.PlussignPlussign
import typingsSlinky.babelTypes.babelTypesStrings.UpdateExpression
import typingsSlinky.babelTypes.babelTypesStrings.`--`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateExpression_
  extends Node
     with Expression {
  
  var argument: Expression = js.native
  
  var operator: PlussignPlussign | `--` = js.native
  
  var prefix: Boolean = js.native
  
  @JSName("type")
  var type_UpdateExpression_ : UpdateExpression = js.native
}
object UpdateExpression_ {
  
  @scala.inline
  def apply(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    operator: PlussignPlussign | `--`,
    prefix: Boolean,
    start: Double,
    `type`: UpdateExpression
  ): UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpression_]
  }
  
  @scala.inline
  implicit class UpdateExpression_MutableBuilder[Self <: UpdateExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgument(value: Expression): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: PlussignPlussign | `--`): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: UpdateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

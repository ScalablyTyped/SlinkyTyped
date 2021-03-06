package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.AmpersandAmpersand
import typingsSlinky.babelTypes.babelTypesStrings.LogicalExpression
import typingsSlinky.babelTypes.babelTypesStrings.VerticallineVerticalline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogicalExpression_
  extends Node
     with Binary
     with Expression {
  
  var left: Expression = js.native
  
  var operator: VerticallineVerticalline | AmpersandAmpersand = js.native
  
  var right: Expression = js.native
  
  @JSName("type")
  var type_LogicalExpression_ : LogicalExpression = js.native
}
object LogicalExpression_ {
  
  @scala.inline
  def apply(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: VerticallineVerticalline | AmpersandAmpersand,
    right: Expression,
    start: Double,
    `type`: LogicalExpression
  ): LogicalExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression_]
  }
  
  @scala.inline
  implicit class LogicalExpression_MutableBuilder[Self <: LogicalExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Expression): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: VerticallineVerticalline | AmpersandAmpersand): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LogicalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

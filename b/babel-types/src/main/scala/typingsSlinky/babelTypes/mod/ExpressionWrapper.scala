package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ExpressionStatement
import typingsSlinky.babelTypes.babelTypesStrings.ParenthesizedExpression
import typingsSlinky.babelTypes.babelTypesStrings.TypeCastExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ExpressionStatement_
  - typingsSlinky.babelTypes.mod.TypeCastExpression_
  - typingsSlinky.babelTypes.mod.ParenthesizedExpression_
*/
trait ExpressionWrapper extends js.Object
object ExpressionWrapper {
  
  @scala.inline
  def ExpressionStatement_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: ExpressionStatement
  ): ExpressionWrapper = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionWrapper]
  }
  
  @scala.inline
  def TypeCastExpression_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: TypeCastExpression,
    typeAnnotation: FlowTypeAnnotation
  ): ExpressionWrapper = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionWrapper]
  }
  
  @scala.inline
  def ParenthesizedExpression_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: ParenthesizedExpression
  ): ExpressionWrapper = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionWrapper]
  }
}

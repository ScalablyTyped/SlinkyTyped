package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ExpressionStatement
import typingsSlinky.babelTypes.babelTypesStrings.ParenthesizedExpression
import typingsSlinky.babelTypes.babelTypesStrings.TypeCastExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.ExpressionStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.ParenthesizedExpression_
  - typingsSlinky.babelTypes.indexTs37Mod.TypeCastExpression_
*/
trait ExpressionWrapper extends _Node
object ExpressionWrapper {
  
  @scala.inline
  def ExpressionStatement_(expression: Expression, `type`: ExpressionStatement): ExpressionWrapper = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionWrapper]
  }
  
  @scala.inline
  def ParenthesizedExpression_(expression: Expression, `type`: ParenthesizedExpression): ExpressionWrapper = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionWrapper]
  }
  
  @scala.inline
  def TypeCastExpression_(expression: Expression, `type`: TypeCastExpression, typeAnnotation: TypeAnnotation_): ExpressionWrapper = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionWrapper]
  }
}

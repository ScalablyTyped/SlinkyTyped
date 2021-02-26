package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.ExpressionStatement
import typingsSlinky.babelTypes.babelTypesStrings.ParenthesizedExpression
import typingsSlinky.babelTypes.babelTypesStrings.TypeCastExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.ExpressionStatement_
  - typingsSlinky.babelTypes.mod.ParenthesizedExpression_
  - typingsSlinky.babelTypes.mod.TypeCastExpression_
*/
trait ExpressionWrapper extends _Node
object ExpressionWrapper {
  
  @scala.inline
  def ExpressionStatement_(expression: Expression, `type`: ExpressionStatement): typingsSlinky.babelTypes.mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ExpressionStatement_]
  }
  
  @scala.inline
  def ParenthesizedExpression_(expression: Expression, `type`: ParenthesizedExpression): typingsSlinky.babelTypes.mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.ParenthesizedExpression_]
  }
  
  @scala.inline
  def TypeCastExpression_(expression: Expression, `type`: TypeCastExpression, typeAnnotation: TypeAnnotation_): typingsSlinky.babelTypes.mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.TypeCastExpression_]
  }
}

package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ExpressionStatement
import typingsSlinky.babelTypes.babelTypesStrings.ParenthesizedExpression
import typingsSlinky.babelTypes.babelTypesStrings.TypeCastExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.ExpressionStatement_
  - typingsSlinky.babelTypes.ts36Mod.TypeCastExpression_
  - typingsSlinky.babelTypes.ts36Mod.ParenthesizedExpression_
*/
trait ExpressionWrapper extends StObject
object ExpressionWrapper {
  
  @scala.inline
  def ExpressionStatement_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: ExpressionStatement
  ): typingsSlinky.babelTypes.ts36Mod.ExpressionStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ExpressionStatement_]
  }
  
  @scala.inline
  def ParenthesizedExpression_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: ParenthesizedExpression
  ): typingsSlinky.babelTypes.ts36Mod.ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ParenthesizedExpression_]
  }
  
  @scala.inline
  def TypeCastExpression_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: TypeCastExpression,
    typeAnnotation: FlowTypeAnnotation
  ): typingsSlinky.babelTypes.ts36Mod.TypeCastExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.TypeCastExpression_]
  }
}

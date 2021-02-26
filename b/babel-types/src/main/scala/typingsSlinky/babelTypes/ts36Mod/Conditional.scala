package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ConditionalExpression
import typingsSlinky.babelTypes.babelTypesStrings.IfStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.ConditionalExpression_
  - typingsSlinky.babelTypes.ts36Mod.IfStatement_
*/
trait Conditional extends StObject
object Conditional {
  
  @scala.inline
  def ConditionalExpression_(
    alternate: Expression,
    consequent: Expression,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: ConditionalExpression
  ): typingsSlinky.babelTypes.ts36Mod.ConditionalExpression_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ConditionalExpression_]
  }
  
  @scala.inline
  def IfStatement_(
    alternate: Statement,
    consequent: Statement,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: IfStatement
  ): typingsSlinky.babelTypes.ts36Mod.IfStatement_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.IfStatement_]
  }
}

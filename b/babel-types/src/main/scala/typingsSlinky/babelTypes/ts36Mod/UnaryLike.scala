package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.Exclamationmark
import typingsSlinky.babelTypes.babelTypesStrings.Plussign
import typingsSlinky.babelTypes.babelTypesStrings.RestProperty
import typingsSlinky.babelTypes.babelTypesStrings.SpreadElement
import typingsSlinky.babelTypes.babelTypesStrings.SpreadProperty
import typingsSlinky.babelTypes.babelTypesStrings.Tilde
import typingsSlinky.babelTypes.babelTypesStrings.UnaryExpression
import typingsSlinky.babelTypes.babelTypesStrings.`-_`
import typingsSlinky.babelTypes.babelTypesStrings.delete
import typingsSlinky.babelTypes.babelTypesStrings.typeof
import typingsSlinky.babelTypes.babelTypesStrings.void
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.UnaryExpression_
  - typingsSlinky.babelTypes.ts36Mod.SpreadElement_
  - typingsSlinky.babelTypes.ts36Mod.RestProperty_
  - typingsSlinky.babelTypes.ts36Mod.SpreadProperty_
*/
trait UnaryLike extends StObject
object UnaryLike {
  
  @scala.inline
  def RestProperty_(argument: LVal, end: Double, loc: SourceLocation, start: Double, `type`: RestProperty): typingsSlinky.babelTypes.ts36Mod.RestProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.RestProperty_]
  }
  
  @scala.inline
  def SpreadElement_(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: SpreadElement): typingsSlinky.babelTypes.ts36Mod.SpreadElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.SpreadElement_]
  }
  
  @scala.inline
  def SpreadProperty_(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: SpreadProperty): typingsSlinky.babelTypes.ts36Mod.SpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.SpreadProperty_]
  }
  
  @scala.inline
  def UnaryExpression_(
    argument: Expression,
    end: Double,
    loc: SourceLocation,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    start: Double,
    `type`: UnaryExpression
  ): typingsSlinky.babelTypes.ts36Mod.UnaryExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.UnaryExpression_]
  }
}

package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.BreakStatement
import typingsSlinky.babelTypes.babelTypesStrings.ContinueStatement
import typingsSlinky.babelTypes.babelTypesStrings.ReturnStatement
import typingsSlinky.babelTypes.babelTypesStrings.ThrowStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.BreakStatement_
  - typingsSlinky.babelTypes.ts36Mod.ContinueStatement_
  - typingsSlinky.babelTypes.ts36Mod.ReturnStatement_
  - typingsSlinky.babelTypes.ts36Mod.ThrowStatement_
*/
trait CompletionStatement extends StObject
object CompletionStatement {
  
  @scala.inline
  def BreakStatement_(end: Double, label: Identifier_, loc: SourceLocation, start: Double, `type`: BreakStatement): typingsSlinky.babelTypes.ts36Mod.BreakStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.BreakStatement_]
  }
  
  @scala.inline
  def ContinueStatement_(end: Double, label: Identifier_, loc: SourceLocation, start: Double, `type`: ContinueStatement): typingsSlinky.babelTypes.ts36Mod.ContinueStatement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ContinueStatement_]
  }
  
  @scala.inline
  def ReturnStatement_(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: ReturnStatement): typingsSlinky.babelTypes.ts36Mod.ReturnStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ReturnStatement_]
  }
  
  @scala.inline
  def ThrowStatement_(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: ThrowStatement): typingsSlinky.babelTypes.ts36Mod.ThrowStatement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ThrowStatement_]
  }
}

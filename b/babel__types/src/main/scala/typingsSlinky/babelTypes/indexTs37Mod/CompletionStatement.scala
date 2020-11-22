package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.BreakStatement
import typingsSlinky.babelTypes.babelTypesStrings.ContinueStatement
import typingsSlinky.babelTypes.babelTypesStrings.ReturnStatement
import typingsSlinky.babelTypes.babelTypesStrings.ThrowStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.BreakStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.ContinueStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.ReturnStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.ThrowStatement_
*/
trait CompletionStatement extends _Node
object CompletionStatement {
  
  @scala.inline
  def BreakStatement_(`type`: BreakStatement): CompletionStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionStatement]
  }
  
  @scala.inline
  def ContinueStatement_(`type`: ContinueStatement): CompletionStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionStatement]
  }
  
  @scala.inline
  def ReturnStatement_(`type`: ReturnStatement): CompletionStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionStatement]
  }
  
  @scala.inline
  def ThrowStatement_(argument: Expression, `type`: ThrowStatement): CompletionStatement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionStatement]
  }
}

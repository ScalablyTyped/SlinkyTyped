package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.AwaitExpression
import typingsSlinky.babelTypes.babelTypesStrings.BreakStatement
import typingsSlinky.babelTypes.babelTypesStrings.ContinueStatement
import typingsSlinky.babelTypes.babelTypesStrings.ReturnStatement
import typingsSlinky.babelTypes.babelTypesStrings.ThrowStatement
import typingsSlinky.babelTypes.babelTypesStrings.YieldExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.BreakStatement_
  - typingsSlinky.babelTypes.mod.ContinueStatement_
  - typingsSlinky.babelTypes.mod.ReturnStatement_
  - typingsSlinky.babelTypes.mod.ThrowStatement_
  - typingsSlinky.babelTypes.mod.YieldExpression_
  - typingsSlinky.babelTypes.mod.AwaitExpression_
*/
trait Terminatorless extends _Node
object Terminatorless {
  
  @scala.inline
  def YieldExpression_(delegate: Boolean, `type`: YieldExpression): Terminatorless = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
  
  @scala.inline
  def ContinueStatement_(`type`: ContinueStatement): Terminatorless = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
  
  @scala.inline
  def BreakStatement_(`type`: BreakStatement): Terminatorless = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
  
  @scala.inline
  def AwaitExpression_(argument: Expression, `type`: AwaitExpression): Terminatorless = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
  
  @scala.inline
  def ThrowStatement_(argument: Expression, `type`: ThrowStatement): Terminatorless = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
  
  @scala.inline
  def ReturnStatement_(`type`: ReturnStatement): Terminatorless = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Terminatorless]
  }
}

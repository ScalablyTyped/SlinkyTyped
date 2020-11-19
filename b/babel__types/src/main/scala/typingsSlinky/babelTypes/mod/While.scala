package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.DoWhileStatement
import typingsSlinky.babelTypes.babelTypesStrings.WhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.DoWhileStatement_
  - typingsSlinky.babelTypes.mod.WhileStatement_
*/
trait While extends _Node
object While {
  
  @scala.inline
  def DoWhileStatement_(body: Statement, test: Expression, `type`: DoWhileStatement): While = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[While]
  }
  
  @scala.inline
  def WhileStatement_(body: Statement, test: Expression, `type`: WhileStatement): While = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[While]
  }
}

package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.DoWhileStatement
import typingsSlinky.babelTypes.babelTypesStrings.ForInStatement
import typingsSlinky.babelTypes.babelTypesStrings.ForOfStatement
import typingsSlinky.babelTypes.babelTypesStrings.ForStatement
import typingsSlinky.babelTypes.babelTypesStrings.WhileStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.DoWhileStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.ForInStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.ForStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.WhileStatement_
  - typingsSlinky.babelTypes.indexTs37Mod.ForOfStatement_
*/
trait Loop extends _Node
object Loop {
  
  @scala.inline
  def ForStatement_(body: Statement, `type`: ForStatement): Loop = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
  
  @scala.inline
  def DoWhileStatement_(body: Statement, test: Expression, `type`: DoWhileStatement): Loop = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
  
  @scala.inline
  def WhileStatement_(body: Statement, test: Expression, `type`: WhileStatement): Loop = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
  
  @scala.inline
  def ForInStatement_(body: Statement, left: VariableDeclaration_ | LVal, right: Expression, `type`: ForInStatement): Loop = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
  
  @scala.inline
  def ForOfStatement_(
    await: Boolean,
    body: Statement,
    left: VariableDeclaration_ | LVal,
    right: Expression,
    `type`: ForOfStatement
  ): Loop = {
    val __obj = js.Dynamic.literal(await = await.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
}

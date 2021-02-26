package typingsSlinky.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.FunctionDeclaration
  - typingsSlinky.estree.mod.FunctionExpression
  - typingsSlinky.estree.mod.ArrowFunctionExpression
*/
trait Function extends Node
object Function {
  
  @scala.inline
  def ArrowFunctionExpression(
    body: BlockStatement | Expression,
    expression: Boolean,
    params: js.Array[Pattern],
    `type`: typingsSlinky.estree.estreeStrings.ArrowFunctionExpression
  ): typingsSlinky.estree.mod.ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ArrowFunctionExpression]
  }
  
  @scala.inline
  def FunctionDeclaration(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typingsSlinky.estree.estreeStrings.FunctionDeclaration
  ): typingsSlinky.estree.mod.FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.FunctionDeclaration]
  }
  
  @scala.inline
  def FunctionExpression(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typingsSlinky.estree.estreeStrings.FunctionExpression
  ): typingsSlinky.estree.mod.FunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.FunctionExpression]
  }
}

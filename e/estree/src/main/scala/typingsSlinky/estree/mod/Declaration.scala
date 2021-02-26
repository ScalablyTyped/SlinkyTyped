package typingsSlinky.estree.mod

import typingsSlinky.estree.estreeStrings.`var`
import typingsSlinky.estree.estreeStrings.const
import typingsSlinky.estree.estreeStrings.let
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.estree.mod.FunctionDeclaration
  - typingsSlinky.estree.mod.VariableDeclaration
  - typingsSlinky.estree.mod.ClassDeclaration
*/
trait Declaration extends Statement
object Declaration {
  
  @scala.inline
  def ClassDeclaration(body: ClassBody, `type`: typingsSlinky.estree.estreeStrings.ClassDeclaration): typingsSlinky.estree.mod.ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.ClassDeclaration]
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
  def VariableDeclaration(
    declarations: js.Array[VariableDeclarator],
    kind: `var` | let | const,
    `type`: typingsSlinky.estree.estreeStrings.VariableDeclaration
  ): typingsSlinky.estree.mod.VariableDeclaration = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.estree.mod.VariableDeclaration]
  }
}

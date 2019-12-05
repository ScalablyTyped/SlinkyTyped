package typingsSlinky.eslint

import typingsSlinky.eslint.eslintMod.Scope.DefinitionType
import typingsSlinky.eslint.eslintStrings.Parameter
import typingsSlinky.estree.estreeMod.ArrowFunctionExpression
import typingsSlinky.estree.estreeMod.FunctionDeclaration
import typingsSlinky.estree.estreeMod.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends DefinitionType {
  var node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression
  var parent: Null
  var `type`: Parameter
}

object Anon_Node {
  @scala.inline
  def apply(
    node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression,
    parent: Null,
    `type`: Parameter
  ): Anon_Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Node]
  }
}


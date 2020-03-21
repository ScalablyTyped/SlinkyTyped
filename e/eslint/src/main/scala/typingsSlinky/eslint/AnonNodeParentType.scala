package typingsSlinky.eslint

import typingsSlinky.eslint.eslintStrings.Parameter
import typingsSlinky.eslint.mod.Scope.DefinitionType
import typingsSlinky.estree.mod.ArrowFunctionExpression
import typingsSlinky.estree.mod.FunctionDeclaration
import typingsSlinky.estree.mod.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeParentType extends DefinitionType {
  var node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression
  var parent: Null
  var `type`: Parameter
}

object AnonNodeParentType {
  @scala.inline
  def apply(
    node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression,
    parent: Null,
    `type`: Parameter
  ): AnonNodeParentType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNodeParentType]
  }
}


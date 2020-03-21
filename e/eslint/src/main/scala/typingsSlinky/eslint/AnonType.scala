package typingsSlinky.eslint

import typingsSlinky.eslint.eslintStrings.FunctionName
import typingsSlinky.eslint.mod.Scope.DefinitionType
import typingsSlinky.estree.mod.FunctionDeclaration
import typingsSlinky.estree.mod.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends DefinitionType {
  var node: FunctionDeclaration | FunctionExpression
  var parent: Null
  var `type`: FunctionName
}

object AnonType {
  @scala.inline
  def apply(node: FunctionDeclaration | FunctionExpression, parent: Null, `type`: FunctionName): AnonType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}


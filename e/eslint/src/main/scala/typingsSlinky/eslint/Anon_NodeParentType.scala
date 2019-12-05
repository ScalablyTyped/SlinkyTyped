package typingsSlinky.eslint

import typingsSlinky.eslint.eslintMod.Scope.DefinitionType
import typingsSlinky.eslint.eslintStrings.Variable
import typingsSlinky.estree.estreeMod.VariableDeclaration
import typingsSlinky.estree.estreeMod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeParentType extends DefinitionType {
  var node: VariableDeclarator
  var parent: VariableDeclaration
  var `type`: Variable
}

object Anon_NodeParentType {
  @scala.inline
  def apply(node: VariableDeclarator, parent: VariableDeclaration, `type`: Variable): Anon_NodeParentType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NodeParentType]
  }
}


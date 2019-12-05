package typingsSlinky.eslint

import typingsSlinky.eslint.eslintMod.Scope.DefinitionType
import typingsSlinky.eslint.eslintStrings.ImportBinding
import typingsSlinky.estree.estreeMod.ImportDeclaration
import typingsSlinky.estree.estreeMod.ImportDefaultSpecifier
import typingsSlinky.estree.estreeMod.ImportNamespaceSpecifier
import typingsSlinky.estree.estreeMod.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImportBinding extends DefinitionType {
  var node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier
  var parent: ImportDeclaration
  var `type`: ImportBinding
}

object Anon_ImportBinding {
  @scala.inline
  def apply(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): Anon_ImportBinding = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ImportBinding]
  }
}


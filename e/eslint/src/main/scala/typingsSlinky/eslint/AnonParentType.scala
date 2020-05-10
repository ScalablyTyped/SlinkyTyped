package typingsSlinky.eslint

import typingsSlinky.eslint.eslintStrings.ImportBinding
import typingsSlinky.eslint.mod.Scope.DefinitionType
import typingsSlinky.estree.mod.ImportDeclaration
import typingsSlinky.estree.mod.ImportDefaultSpecifier
import typingsSlinky.estree.mod.ImportNamespaceSpecifier
import typingsSlinky.estree.mod.ImportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonParentType extends DefinitionType {
  var node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier = js.native
  var parent: ImportDeclaration = js.native
  var `type`: ImportBinding = js.native
}

object AnonParentType {
  @scala.inline
  def apply(
    node: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier,
    parent: ImportDeclaration,
    `type`: ImportBinding
  ): AnonParentType = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParentType]
  }
  @scala.inline
  implicit class AnonParentTypeOps[Self <: AnonParentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: ImportSpecifier | ImportDefaultSpecifier | ImportNamespaceSpecifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: ImportDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ImportBinding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


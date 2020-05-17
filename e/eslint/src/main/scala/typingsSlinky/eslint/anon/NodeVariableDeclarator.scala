package typingsSlinky.eslint.anon

import typingsSlinky.eslint.eslintStrings.Variable
import typingsSlinky.eslint.mod.Scope.DefinitionType
import typingsSlinky.estree.mod.VariableDeclaration
import typingsSlinky.estree.mod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeVariableDeclarator extends DefinitionType {
  var node: VariableDeclarator = js.native
  var parent: VariableDeclaration = js.native
  var `type`: Variable = js.native
}

object NodeVariableDeclarator {
  @scala.inline
  def apply(node: VariableDeclarator, parent: VariableDeclaration, `type`: Variable): NodeVariableDeclarator = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeVariableDeclarator]
  }
  @scala.inline
  implicit class NodeVariableDeclaratorOps[Self <: NodeVariableDeclarator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: VariableDeclarator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: VariableDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Variable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


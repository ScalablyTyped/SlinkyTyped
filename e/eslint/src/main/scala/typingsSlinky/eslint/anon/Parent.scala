package typingsSlinky.eslint.anon

import typingsSlinky.eslint.eslintStrings.ClassName
import typingsSlinky.eslint.mod.Scope.DefinitionType
import typingsSlinky.estree.mod.ClassDeclaration
import typingsSlinky.estree.mod.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parent extends DefinitionType {
  var node: ClassDeclaration | ClassExpression = js.native
  var parent: Null = js.native
  var `type`: ClassName = js.native
}

object Parent {
  @scala.inline
  def apply(node: ClassDeclaration | ClassExpression, parent: Null, `type`: ClassName): Parent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
  @scala.inline
  implicit class ParentOps[Self <: Parent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: ClassDeclaration | ClassExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ClassName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


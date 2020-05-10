package typingsSlinky.eslint

import typingsSlinky.eslint.eslintStrings.Parameter
import typingsSlinky.eslint.mod.Scope.DefinitionType
import typingsSlinky.estree.mod.ArrowFunctionExpression
import typingsSlinky.estree.mod.FunctionDeclaration
import typingsSlinky.estree.mod.FunctionExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonNodeParentType extends DefinitionType {
  var node: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression = js.native
  var parent: Null = js.native
  var `type`: Parameter = js.native
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
  @scala.inline
  implicit class AnonNodeParentTypeOps[Self <: AnonNodeParentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNode(value: FunctionDeclaration | FunctionExpression | ArrowFunctionExpression): Self = {
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
    def withType(value: Parameter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


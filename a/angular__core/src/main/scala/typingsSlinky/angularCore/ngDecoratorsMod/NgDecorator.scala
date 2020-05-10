package typingsSlinky.angularCore.ngDecoratorsMod

import typingsSlinky.typescript.mod.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NgDecorator extends js.Object {
  var importNode: ImportDeclaration = js.native
  var name: String = js.native
  var node: CallExpressionDecorator = js.native
}

object NgDecorator {
  @scala.inline
  def apply(importNode: ImportDeclaration, name: String, node: CallExpressionDecorator): NgDecorator = {
    val __obj = js.Dynamic.literal(importNode = importNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgDecorator]
  }
  @scala.inline
  implicit class NgDecoratorOps[Self <: NgDecorator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportNode(value: ImportDeclaration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNode(value: CallExpressionDecorator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("node")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


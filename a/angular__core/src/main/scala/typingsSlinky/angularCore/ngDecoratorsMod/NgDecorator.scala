package typingsSlinky.angularCore.ngDecoratorsMod

import typingsSlinky.typescript.mod.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NgDecorator extends js.Object {
  var importNode: ImportDeclaration
  var name: String
  var node: CallExpressionDecorator
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImportNode(value: ImportDeclaration): Self = this.set("importNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: CallExpressionDecorator): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}


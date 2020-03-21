package typingsSlinky.eslint

import typingsSlinky.eslint.eslintStrings.ClassName
import typingsSlinky.eslint.mod.Scope.DefinitionType
import typingsSlinky.estree.mod.ClassDeclaration
import typingsSlinky.estree.mod.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParent extends DefinitionType {
  var node: ClassDeclaration | ClassExpression
  var parent: Null
  var `type`: ClassName
}

object AnonParent {
  @scala.inline
  def apply(node: ClassDeclaration | ClassExpression, parent: Null, `type`: ClassName): AnonParent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParent]
  }
}


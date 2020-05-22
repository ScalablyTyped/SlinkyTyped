package typingsSlinky.eslint.anon

import typingsSlinky.eslint.mod.Scope.DefinitionType
import typingsSlinky.estree.mod.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends DefinitionType {
  var node: CatchClause
  var parent: Null
  var `type`: typingsSlinky.eslint.eslintStrings.CatchClause
}

object Node {
  @scala.inline
  def apply(node: CatchClause, parent: Null, `type`: typingsSlinky.eslint.eslintStrings.CatchClause): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}


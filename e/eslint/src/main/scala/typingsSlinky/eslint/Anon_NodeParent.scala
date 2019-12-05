package typingsSlinky.eslint

import typingsSlinky.eslint.eslintMod.Scope.DefinitionType
import typingsSlinky.eslint.eslintStrings.TDZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeParent extends DefinitionType {
  var node: js.Any
  var parent: Null
  var `type`: TDZ
}

object Anon_NodeParent {
  @scala.inline
  def apply(node: js.Any, parent: Null, `type`: TDZ): Anon_NodeParent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NodeParent]
  }
}


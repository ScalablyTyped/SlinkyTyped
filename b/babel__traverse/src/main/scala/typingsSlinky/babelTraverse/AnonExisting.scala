package typingsSlinky.babelTraverse

import typingsSlinky.babelTraverse.babelTraverseStrings.`var`
import typingsSlinky.babelTraverse.babelTraverseStrings.const
import typingsSlinky.babelTraverse.babelTraverseStrings.let
import typingsSlinky.babelTraverse.mod.Binding
import typingsSlinky.babelTraverse.mod.Node
import typingsSlinky.babelTraverse.mod.NodePath
import typingsSlinky.babelTraverse.mod.Scope
import typingsSlinky.babelTypes.mod.Identifier_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExisting extends js.Object {
  var existing: Binding
  var identifier: Identifier_
  var kind: `var` | let | const
  var path: NodePath[Node]
  var scope: Scope
}

object AnonExisting {
  @scala.inline
  def apply(
    existing: Binding,
    identifier: Identifier_,
    kind: `var` | let | const,
    path: NodePath[Node],
    scope: Scope
  ): AnonExisting = {
    val __obj = js.Dynamic.literal(existing = existing.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExisting]
  }
}


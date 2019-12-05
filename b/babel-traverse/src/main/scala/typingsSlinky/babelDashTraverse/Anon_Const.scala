package typingsSlinky.babelDashTraverse

import typingsSlinky.babelDashTraverse.babelDashTraverseMod.Binding
import typingsSlinky.babelDashTraverse.babelDashTraverseMod.Node
import typingsSlinky.babelDashTraverse.babelDashTraverseMod.NodePath
import typingsSlinky.babelDashTraverse.babelDashTraverseMod.Scope
import typingsSlinky.babelDashTraverse.babelDashTraverseStrings.`var`
import typingsSlinky.babelDashTraverse.babelDashTraverseStrings.const
import typingsSlinky.babelDashTraverse.babelDashTraverseStrings.let
import typingsSlinky.babelDashTypes.babelDashTypesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Const extends js.Object {
  var existing: Binding
  var identifier: Identifier
  var kind: `var` | let | const
  var path: NodePath[Node]
  var scope: Scope
}

object Anon_Const {
  @scala.inline
  def apply(
    existing: Binding,
    identifier: Identifier,
    kind: `var` | let | const,
    path: NodePath[Node],
    scope: Scope
  ): Anon_Const = {
    val __obj = js.Dynamic.literal(existing = existing.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Const]
  }
}


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

@js.native
trait AnonExisting extends js.Object {
  var existing: Binding = js.native
  var identifier: Identifier_ = js.native
  var kind: `var` | let | const = js.native
  var path: NodePath[Node] = js.native
  var scope: Scope = js.native
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
  @scala.inline
  implicit class AnonExistingOps[Self <: AnonExisting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExisting(value: Binding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("existing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: `var` | let | const): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: NodePath[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


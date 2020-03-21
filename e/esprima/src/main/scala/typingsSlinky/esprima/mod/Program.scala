package typingsSlinky.esprima.mod

import typingsSlinky.estree.estreeStrings.module
import typingsSlinky.estree.estreeStrings.script
import typingsSlinky.estree.mod.Comment
import typingsSlinky.estree.mod.Directive
import typingsSlinky.estree.mod.ModuleDeclaration
import typingsSlinky.estree.mod.SourceLocation
import typingsSlinky.estree.mod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program
  extends typingsSlinky.estree.mod.Program {
  var tokens: js.UndefOr[js.Array[Token]] = js.undefined
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[Directive | Statement | ModuleDeclaration],
    sourceType: script | module,
    `type`: typingsSlinky.estree.estreeStrings.Program,
    comments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    tokens: js.Array[Token] = null,
    trailingComments: js.Array[Comment] = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Program]
  }
}


package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DirectiveKind
import typingsSlinky.astTypes.kindsMod.InterpreterDirectiveKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: js.Array[StatementKind]
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var directives: js.UndefOr[js.Array[DirectiveKind]] = js.undefined
  var interpreter: js.UndefOr[InterpreterDirectiveKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Body {
  @scala.inline
  def apply(
    body: js.Array[StatementKind],
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    directives: js.Array[DirectiveKind] = null,
    interpreter: js.UndefOr[Null | InterpreterDirectiveKind] = js.undefined,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined
  ): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (!js.isUndefined(interpreter)) __obj.updateDynamic("interpreter")(interpreter.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}


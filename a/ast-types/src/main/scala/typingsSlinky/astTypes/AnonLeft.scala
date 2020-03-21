package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var body: StatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var left: VariableDeclarationKind | ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var right: ExpressionKind
}

object AnonLeft {
  @scala.inline
  def apply(
    body: StatementKind,
    left: VariableDeclarationKind | ExpressionKind,
    right: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonLeft = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}


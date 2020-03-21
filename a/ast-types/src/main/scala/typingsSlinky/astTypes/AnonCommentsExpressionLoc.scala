package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsExpressionLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var expression: StringLiteralKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonCommentsExpressionLoc {
  @scala.inline
  def apply(
    expression: StringLiteralKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonCommentsExpressionLoc = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsExpressionLoc]
  }
}


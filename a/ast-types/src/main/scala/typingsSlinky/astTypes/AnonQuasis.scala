package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TemplateElementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuasis extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var expressions: js.Array[ExpressionKind]
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var quasis: js.Array[TemplateElementKind]
}

object AnonQuasis {
  @scala.inline
  def apply(
    expressions: js.Array[ExpressionKind],
    quasis: js.Array[TemplateElementKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonQuasis = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuasis]
  }
}


package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.RestElementKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElements extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonElements {
  @scala.inline
  def apply(
    elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonElements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElements]
  }
}


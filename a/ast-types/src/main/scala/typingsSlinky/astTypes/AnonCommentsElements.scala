package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpreadElementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsElements extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var elements: js.Array[PatternKind | SpreadElementKind | Null]
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonCommentsElements {
  @scala.inline
  def apply(
    elements: js.Array[PatternKind | SpreadElementKind | Null],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonCommentsElements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsElements]
  }
}


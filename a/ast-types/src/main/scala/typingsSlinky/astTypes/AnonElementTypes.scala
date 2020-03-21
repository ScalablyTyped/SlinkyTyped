package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementTypes extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var elementTypes: js.Array[TSTypeKind]
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonElementTypes {
  @scala.inline
  def apply(
    elementTypes: js.Array[TSTypeKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonElementTypes = {
    val __obj = js.Dynamic.literal(elementTypes = elementTypes.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementTypes]
  }
}


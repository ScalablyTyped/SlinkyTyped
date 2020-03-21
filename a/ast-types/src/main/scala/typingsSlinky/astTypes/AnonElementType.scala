package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementType extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var elementType: FlowTypeKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonElementType {
  @scala.inline
  def apply(elementType: FlowTypeKind, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): AnonElementType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementType]
  }
}


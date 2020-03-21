package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndexType extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var indexType: TSTypeKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var objectType: TSTypeKind
}

object AnonIndexType {
  @scala.inline
  def apply(
    indexType: TSTypeKind,
    objectType: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonIndexType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexType]
  }
}


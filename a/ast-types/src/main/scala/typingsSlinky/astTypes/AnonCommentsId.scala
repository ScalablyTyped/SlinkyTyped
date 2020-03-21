package typingsSlinky.astTypes

import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.VarianceKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsId extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind
  var key: FlowTypeKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var value: FlowTypeKind
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.undefined
}

object AnonCommentsId {
  @scala.inline
  def apply(
    id: IdentifierKind,
    key: FlowTypeKind,
    value: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    variance: VarianceKind | plus | minus = null
  ): AnonCommentsId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsId]
  }
}


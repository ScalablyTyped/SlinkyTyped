package typingsSlinky.astTypes

import typingsSlinky.astTypes.astTypesStrings.minus
import typingsSlinky.astTypes.astTypesStrings.plus
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.VarianceKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVariance extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var key: LiteralKind | IdentifierKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var optional: Boolean
  var value: FlowTypeKind
  var variance: js.UndefOr[VarianceKind | plus | minus | Null] = js.undefined
}

object AnonVariance {
  @scala.inline
  def apply(
    key: LiteralKind | IdentifierKind,
    optional: Boolean,
    value: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    variance: VarianceKind | plus | minus = null
  ): AnonVariance = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVariance]
  }
}


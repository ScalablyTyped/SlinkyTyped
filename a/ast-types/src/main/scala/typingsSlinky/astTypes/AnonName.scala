package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var name: JSXIdentifierKind | JSXNamespacedNameKind
  var value: js.UndefOr[LiteralKind | JSXExpressionContainerKind | Null] = js.undefined
}

object AnonName {
  @scala.inline
  def apply(
    name: JSXIdentifierKind | JSXNamespacedNameKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    value: LiteralKind | JSXExpressionContainerKind = null
  ): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}


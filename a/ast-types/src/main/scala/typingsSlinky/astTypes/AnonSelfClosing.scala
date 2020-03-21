package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.JSXAttributeKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXMemberExpressionKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.kindsMod.JSXSpreadAttributeKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelfClosing extends js.Object {
  var attributes: js.UndefOr[js.Array[JSXAttributeKind | JSXSpreadAttributeKind]] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind
  var selfClosing: js.UndefOr[Boolean] = js.undefined
}

object AnonSelfClosing {
  @scala.inline
  def apply(
    name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind,
    attributes: js.Array[JSXAttributeKind | JSXSpreadAttributeKind] = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    selfClosing: js.UndefOr[Boolean] = js.undefined
  ): AnonSelfClosing = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(selfClosing)) __obj.updateDynamic("selfClosing")(selfClosing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelfClosing]
  }
}


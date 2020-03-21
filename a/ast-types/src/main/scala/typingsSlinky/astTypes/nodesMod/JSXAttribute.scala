package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.JSXExpressionContainerKind
import typingsSlinky.astTypes.kindsMod.JSXIdentifierKind
import typingsSlinky.astTypes.kindsMod.JSXNamespacedNameKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait JSXAttribute extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var name: JSXIdentifierKind | JSXNamespacedNameKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.JSXAttribute
  var value: LiteralKind | JSXExpressionContainerKind | Null
}

object JSXAttribute {
  @scala.inline
  def apply(
    name: JSXIdentifierKind | JSXNamespacedNameKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.JSXAttribute,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    value: LiteralKind | JSXExpressionContainerKind = null
  ): JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXAttribute]
  }
}


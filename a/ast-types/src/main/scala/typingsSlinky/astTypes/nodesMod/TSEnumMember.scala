package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StringLiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait TSEnumMember extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var id: IdentifierKind | StringLiteralKind
  var initializer: ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSEnumMember
}

object TSEnumMember {
  @scala.inline
  def apply(
    id: IdentifierKind | StringLiteralKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSEnumMember,
    comments: js.Array[CommentKind] = null,
    initializer: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): TSEnumMember = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], initializer = initializer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSEnumMember]
  }
}


package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.MemberExpression, 'type'> */
trait OptionalMemberExpression extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var computed: Boolean
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `object`: ExpressionKind
  var optional: Boolean
  var property: IdentifierKind | ExpressionKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.OptionalMemberExpression
}

object OptionalMemberExpression {
  @scala.inline
  def apply(
    computed: Boolean,
    `object`: ExpressionKind,
    optional: Boolean,
    property: IdentifierKind | ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.OptionalMemberExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): OptionalMemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalMemberExpression]
  }
}


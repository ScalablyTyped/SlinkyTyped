package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.AnonParenthesized
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Pattern, 'type'> */
trait TSAsExpression extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var expression: ExpressionKind
  var extra: AnonParenthesized | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSAsExpression
  var typeAnnotation: TSTypeKind
}

object TSAsExpression {
  @scala.inline
  def apply(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSAsExpression,
    typeAnnotation: TSTypeKind,
    comments: js.Array[CommentKind] = null,
    extra: AnonParenthesized = null,
    loc: SourceLocationKind = null
  ): TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSAsExpression]
  }
}


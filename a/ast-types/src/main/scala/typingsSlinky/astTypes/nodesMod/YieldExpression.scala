package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait YieldExpression extends ASTNode {
  var argument: ExpressionKind | Null
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var delegate: Boolean
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.YieldExpression
}

object YieldExpression {
  @scala.inline
  def apply(
    delegate: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.YieldExpression,
    argument: ExpressionKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): YieldExpression = {
    val __obj = js.Dynamic.literal(delegate = delegate.asInstanceOf[js.Any], argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[YieldExpression]
  }
}


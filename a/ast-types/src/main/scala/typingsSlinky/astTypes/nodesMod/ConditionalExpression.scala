package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait ConditionalExpression extends ASTNode {
  var alternate: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var consequent: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var test: ExpressionKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.ConditionalExpression
}

object ConditionalExpression {
  @scala.inline
  def apply(
    alternate: ExpressionKind,
    consequent: ExpressionKind,
    test: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.ConditionalExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalExpression]
  }
}


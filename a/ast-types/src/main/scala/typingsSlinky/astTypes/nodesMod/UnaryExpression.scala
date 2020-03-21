package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.astTypesStrings.Exclamationmark
import typingsSlinky.astTypes.astTypesStrings.Plussign
import typingsSlinky.astTypes.astTypesStrings.Tilde
import typingsSlinky.astTypes.astTypesStrings.`-_`
import typingsSlinky.astTypes.astTypesStrings.delete
import typingsSlinky.astTypes.astTypesStrings.typeof
import typingsSlinky.astTypes.astTypesStrings.void
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Expression, 'type'> */
trait UnaryExpression extends ASTNode {
  var argument: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete
  var prefix: Boolean
  var `type`: typingsSlinky.astTypes.astTypesStrings.UnaryExpression
}

object UnaryExpression {
  @scala.inline
  def apply(
    argument: ExpressionKind,
    operator: `-_` | Plussign | Exclamationmark | Tilde | typeof | void | delete,
    prefix: Boolean,
    `type`: typingsSlinky.astTypes.astTypesStrings.UnaryExpression,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): UnaryExpression = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnaryExpression]
  }
}


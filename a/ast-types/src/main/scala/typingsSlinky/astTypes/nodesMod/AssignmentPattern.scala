package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Pattern, 'type'> */
trait AssignmentPattern extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var left: PatternKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var right: ExpressionKind
  var `type`: typingsSlinky.astTypes.astTypesStrings.AssignmentPattern
}

object AssignmentPattern {
  @scala.inline
  def apply(
    left: PatternKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.AssignmentPattern,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentPattern]
  }
}


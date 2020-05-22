package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.PatternKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Node, 'type'> */
trait CatchClause extends ASTNode {
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var guard: ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var param: PatternKind | Null
  var `type`: typingsSlinky.astTypes.astTypesStrings.CatchClause
}

object CatchClause {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.CatchClause,
    comments: js.Array[CommentKind] = null,
    guard: ExpressionKind = null,
    loc: SourceLocationKind = null,
    param: PatternKind = null
  ): CatchClause = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], guard = guard.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause]
  }
}


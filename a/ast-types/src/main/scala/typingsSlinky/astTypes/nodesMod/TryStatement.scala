package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CatchClauseKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Statement, 'type'> */
trait TryStatement extends ASTNode {
  var block: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var finalizer: BlockStatementKind | Null
  var guardedHandlers: js.Array[CatchClauseKind]
  var handler: CatchClauseKind | Null
  var handlers: js.Array[CatchClauseKind]
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.TryStatement
}

object TryStatement {
  @scala.inline
  def apply(
    block: BlockStatementKind,
    guardedHandlers: js.Array[CatchClauseKind],
    handlers: js.Array[CatchClauseKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.TryStatement,
    comments: js.Array[CommentKind] = null,
    finalizer: BlockStatementKind = null,
    handler: CatchClauseKind = null,
    loc: SourceLocationKind = null
  ): TryStatement = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], guardedHandlers = guardedHandlers.asInstanceOf[js.Any], handlers = handlers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (finalizer != null) __obj.updateDynamic("finalizer")(finalizer.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[TryStatement]
  }
}


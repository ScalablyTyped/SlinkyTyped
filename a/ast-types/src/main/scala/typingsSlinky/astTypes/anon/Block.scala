package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.BlockStatementKind
import typingsSlinky.astTypes.kindsMod.CatchClauseKind
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var block: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var finalizer: js.UndefOr[BlockStatementKind | Null] = js.undefined
  var guardedHandlers: js.UndefOr[js.Array[CatchClauseKind]] = js.undefined
  var handler: js.UndefOr[CatchClauseKind | Null] = js.undefined
  var handlers: js.UndefOr[js.Array[CatchClauseKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Block {
  @scala.inline
  def apply(
    block: BlockStatementKind,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    finalizer: js.UndefOr[Null | BlockStatementKind] = js.undefined,
    guardedHandlers: js.Array[CatchClauseKind] = null,
    handler: js.UndefOr[Null | CatchClauseKind] = js.undefined,
    handlers: js.Array[CatchClauseKind] = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined
  ): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(finalizer)) __obj.updateDynamic("finalizer")(finalizer.asInstanceOf[js.Any])
    if (guardedHandlers != null) __obj.updateDynamic("guardedHandlers")(guardedHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(handler)) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}


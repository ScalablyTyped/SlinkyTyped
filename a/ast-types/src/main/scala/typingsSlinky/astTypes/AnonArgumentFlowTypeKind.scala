package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgumentFlowTypeKind extends js.Object {
  var argument: FlowTypeKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonArgumentFlowTypeKind {
  @scala.inline
  def apply(argument: FlowTypeKind, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): AnonArgumentFlowTypeKind = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgumentFlowTypeKind]
  }
}


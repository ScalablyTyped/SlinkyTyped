package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportedLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var exported: IdentifierKind | Null
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var source: LiteralKind
}

object ExportedLoc {
  @scala.inline
  def apply(
    source: LiteralKind,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    exported: IdentifierKind = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined
  ): ExportedLoc = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportedLoc]
  }
}


package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Local extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var local: js.UndefOr[IdentifierKind | Null] = js.undefined
  var name: js.UndefOr[IdentifierKind | Null] = js.undefined
}

object Local {
  @scala.inline
  def apply(
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    id: js.UndefOr[Null | IdentifierKind] = js.undefined,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    local: js.UndefOr[Null | IdentifierKind] = js.undefined,
    name: js.UndefOr[Null | IdentifierKind] = js.undefined
  ): Local = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Local]
  }
}


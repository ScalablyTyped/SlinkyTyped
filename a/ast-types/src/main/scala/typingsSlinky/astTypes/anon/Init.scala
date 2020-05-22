package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.VariableDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Init extends js.Object {
  var body: StatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var init: VariableDeclarationKind | ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var test: ExpressionKind | Null
  var update: ExpressionKind | Null
}

object Init {
  @scala.inline
  def apply(
    body: StatementKind,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    init: VariableDeclarationKind | ExpressionKind = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    test: ExpressionKind = null,
    update: ExpressionKind = null
  ): Init = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Init]
  }
}


package typingsSlinky.astTypes

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsDeclaration extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declaration: DeclarationKind | ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonCommentsDeclaration {
  @scala.inline
  def apply(
    declaration: DeclarationKind | ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): AnonCommentsDeclaration = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsDeclaration]
  }
}


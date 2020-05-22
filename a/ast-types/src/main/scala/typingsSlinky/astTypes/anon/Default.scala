package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ExportBatchSpecifierKind
import typingsSlinky.astTypes.kindsMod.ExportSpecifierKind
import typingsSlinky.astTypes.kindsMod.ExpressionKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var declaration: DeclarationKind | ExpressionKind | Null
  var default: Boolean
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var source: js.UndefOr[LiteralKind | Null] = js.undefined
  var specifiers: js.UndefOr[js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]] = js.undefined
}

object Default {
  @scala.inline
  def apply(
    default: Boolean,
    comments: js.UndefOr[Null | js.Array[CommentKind]] = js.undefined,
    declaration: DeclarationKind | ExpressionKind = null,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    source: js.UndefOr[Null | LiteralKind] = js.undefined,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind] = null
  ): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (specifiers != null) __obj.updateDynamic("specifiers")(specifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}


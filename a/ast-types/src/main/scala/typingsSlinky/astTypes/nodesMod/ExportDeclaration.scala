package typingsSlinky.astTypes.nodesMod

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

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait ExportDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var declaration: DeclarationKind | ExpressionKind | Null
  var default: Boolean
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var source: LiteralKind | Null
  var specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  var `type`: typingsSlinky.astTypes.astTypesStrings.ExportDeclaration
}

object ExportDeclaration {
  @scala.inline
  def apply(
    default: Boolean,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.ExportDeclaration,
    comments: js.Array[CommentKind] = null,
    declaration: DeclarationKind | ExpressionKind = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null
  ): ExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportDeclaration]
  }
}


package typingsSlinky.astTypes.nodesMod

import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclareClassKind
import typingsSlinky.astTypes.kindsMod.DeclareFunctionKind
import typingsSlinky.astTypes.kindsMod.DeclareVariableKind
import typingsSlinky.astTypes.kindsMod.ExportBatchSpecifierKind
import typingsSlinky.astTypes.kindsMod.ExportSpecifierKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/nodes.Declaration, 'type'> */
trait DeclareExportDeclaration extends ASTNode {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind | Null
  var default: Boolean
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var source: LiteralKind | Null
  var specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclareExportDeclaration
}

object DeclareExportDeclaration {
  @scala.inline
  def apply(
    default: Boolean,
    specifiers: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind],
    `type`: typingsSlinky.astTypes.astTypesStrings.DeclareExportDeclaration,
    comments: js.Array[CommentKind] = null,
    declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind = null,
    loc: SourceLocationKind = null,
    source: LiteralKind = null
  ): DeclareExportDeclaration = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], declaration = declaration.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportDeclaration]
  }
}


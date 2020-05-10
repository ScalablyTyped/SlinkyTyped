package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.DeclareClassKind
import typingsSlinky.astTypes.kindsMod.DeclareFunctionKind
import typingsSlinky.astTypes.kindsMod.DeclareVariableKind
import typingsSlinky.astTypes.kindsMod.ExportBatchSpecifierKind
import typingsSlinky.astTypes.kindsMod.ExportSpecifierKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.LiteralKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
@js.native
trait DeclareExportDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var declaration: DeclareVariableKind | DeclareFunctionKind | DeclareClassKind | FlowTypeKind | Null = js.native
  var default: Boolean = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var source: js.UndefOr[LiteralKind | Null] = js.native
  var specifiers: js.UndefOr[js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclareExportDeclaration = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareExportDeclaration")
@js.native
object DeclareExportDeclaration extends TopLevel[Type[DeclareExportDeclaration]]


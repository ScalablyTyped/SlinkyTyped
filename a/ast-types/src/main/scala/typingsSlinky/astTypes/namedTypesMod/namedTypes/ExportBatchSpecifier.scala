package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpecifierKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Specifier, 'type'> */
@js.native
trait ExportBatchSpecifier
  extends ASTNode
     with NodeKind
     with PrintableKind
     with SpecifierKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.ExportBatchSpecifier = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ExportBatchSpecifier")
@js.native
object ExportBatchSpecifier extends TopLevel[Type[ExportBatchSpecifier]]


package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.ModuleSpecifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpecifierKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.ModuleSpecifier, 'type'> */
@js.native
trait ExportSpecifier
  extends ASTNode
     with ModuleSpecifierKind
     with NodeKind
     with PrintableKind
     with SpecifierKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var exported: IdentifierKind = js.native
  var id: js.UndefOr[IdentifierKind] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var local: js.UndefOr[IdentifierKind] = js.native
  var name: js.UndefOr[IdentifierKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.ExportSpecifier = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ExportSpecifier")
@js.native
object ExportSpecifier extends TopLevel[Type[ExportSpecifier]]


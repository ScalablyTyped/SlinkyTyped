package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.SpecifierKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Specifier, 'type'> */
trait ExportNamespaceSpecifier
  extends ASTNode
     with NodeKind
     with PrintableKind
     with SpecifierKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var exported: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.ExportNamespaceSpecifier
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ExportNamespaceSpecifier")
@js.native
object ExportNamespaceSpecifier extends TopLevel[Type[ExportNamespaceSpecifier]]


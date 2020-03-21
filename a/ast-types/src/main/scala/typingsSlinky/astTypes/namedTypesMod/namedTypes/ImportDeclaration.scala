package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.astTypesStrings.`type`
import typingsSlinky.astTypes.astTypesStrings.value
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.ImportDefaultSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportNamespaceSpecifierKind
import typingsSlinky.astTypes.kindsMod.ImportSpecifierKind
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
trait ImportDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var importKind: js.UndefOr[value | `type`] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var source: LiteralKind
  var specifiers: js.UndefOr[
    js.Array[ImportSpecifierKind | ImportNamespaceSpecifierKind | ImportDefaultSpecifierKind]
  ] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.ImportDeclaration
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.ImportDeclaration")
@js.native
object ImportDeclaration extends TopLevel[Type[ImportDeclaration]]


package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TSExternalModuleReferenceKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
@js.native
trait TSImportEqualsDeclaration
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var id: IdentifierKind = js.native
  var isExport: js.UndefOr[Boolean] = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var moduleReference: IdentifierKind | TSQualifiedNameKind | TSExternalModuleReferenceKind = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSImportEqualsDeclaration = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSImportEqualsDeclaration")
@js.native
object TSImportEqualsDeclaration extends TopLevel[Type[TSImportEqualsDeclaration]]


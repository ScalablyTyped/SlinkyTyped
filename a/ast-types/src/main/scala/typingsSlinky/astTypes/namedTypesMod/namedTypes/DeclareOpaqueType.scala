package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TypeAliasKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TypeAlias, 'type'> */
@js.native
trait DeclareOpaqueType
  extends ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TypeAliasKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var id: IdentifierKind = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var right: FlowTypeKind = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclareOpaqueType = js.native
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind] = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareOpaqueType")
@js.native
object DeclareOpaqueType extends TopLevel[Type[DeclareOpaqueType]]


package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.DeclarationKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.InterfaceDeclarationKind
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.StatementKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.InterfaceDeclaration, 'type'> */
trait DeclareInterface
  extends ASTNode
     with DeclarationKind
     with InterfaceDeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  var body: ObjectTypeAnnotationKind
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var `extends`: js.Array[InterfaceExtendsKind]
  var id: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.DeclareInterface
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareInterface")
@js.native
object DeclareInterface extends TopLevel[Type[DeclareInterface]]


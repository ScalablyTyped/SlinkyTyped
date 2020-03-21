package typingsSlinky.astTypes.namedTypesMod.namedTypes

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.astTypes.kindsMod.CommentKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.NodeKind
import typingsSlinky.astTypes.kindsMod.PrintableKind
import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import typingsSlinky.astTypes.kindsMod.TSHasOptionalTypeParameterInstantiationKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.kindsMod.TSTypeKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsSlinky.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> */
/* Inlined parent ast-types.ast-types/gen/namedTypes.namedTypes.TSHasOptionalTypeParameterInstantiation */
trait TSTypeReference
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSHasOptionalTypeParameterInstantiationKind
     with TSTypeKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind] = js.undefined
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeReference
  var typeName: IdentifierKind | TSQualifiedNameKind
  var typeParameters: js.UndefOr[TSTypeParameterInstantiationKind | Null] = js.undefined
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSTypeReference")
@js.native
object TSTypeReference extends TopLevel[Type[TSTypeReference]]


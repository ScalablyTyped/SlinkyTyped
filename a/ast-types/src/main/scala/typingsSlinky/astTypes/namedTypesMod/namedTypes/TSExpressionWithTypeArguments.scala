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
@js.native
trait TSExpressionWithTypeArguments
  extends ASTNode
     with NodeKind
     with PrintableKind
     with TSHasOptionalTypeParameterInstantiationKind
     with TSTypeKind {
  var comments: js.UndefOr[js.Array[CommentKind]] = js.native
  var expression: IdentifierKind | TSQualifiedNameKind = js.native
  var loc: js.UndefOr[SourceLocationKind] = js.native
  var `type`: typingsSlinky.astTypes.astTypesStrings.TSExpressionWithTypeArguments = js.native
  var typeParameters: js.UndefOr[TSTypeParameterInstantiationKind | Null] = js.native
}

@JSImport("ast-types/gen/namedTypes", "namedTypes.TSExpressionWithTypeArguments")
@js.native
object TSExpressionWithTypeArguments extends TopLevel[Type[TSExpressionWithTypeArguments]]


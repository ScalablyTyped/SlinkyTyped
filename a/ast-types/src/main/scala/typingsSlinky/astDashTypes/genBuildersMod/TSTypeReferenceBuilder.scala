package typingsSlinky.astDashTypes.genBuildersMod

import typingsSlinky.astDashTypes.Anon_CommentsLocTypeName
import typingsSlinky.astDashTypes.genKindsMod.IdentifierKind
import typingsSlinky.astDashTypes.genKindsMod.TSQualifiedNameKind
import typingsSlinky.astDashTypes.genKindsMod.TSTypeParameterInstantiationKind
import typingsSlinky.astDashTypes.genNamedTypesMod.namedTypes.TSTypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeReferenceBuilder extends js.Object {
  def apply(typeName: IdentifierKind): TSTypeReference = js.native
  def apply(typeName: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def apply(typeName: TSQualifiedNameKind): TSTypeReference = js.native
  def apply(typeName: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def from(params: Anon_CommentsLocTypeName): TSTypeReference = js.native
}


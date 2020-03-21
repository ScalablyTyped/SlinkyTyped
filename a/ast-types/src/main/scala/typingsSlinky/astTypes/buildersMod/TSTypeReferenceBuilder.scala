package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonTypeName
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TSQualifiedNameKind
import typingsSlinky.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeReferenceBuilder extends js.Object {
  def apply(typeName: IdentifierKind): TSTypeReference = js.native
  def apply(typeName: IdentifierKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def apply(typeName: TSQualifiedNameKind): TSTypeReference = js.native
  def apply(typeName: TSQualifiedNameKind, typeParameters: TSTypeParameterInstantiationKind): TSTypeReference = js.native
  def from(params: AnonTypeName): TSTypeReference = js.native
}


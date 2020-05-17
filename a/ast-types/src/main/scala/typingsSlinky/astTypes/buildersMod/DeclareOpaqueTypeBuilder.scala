package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.RightTypeParameters
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareOpaqueTypeBuilder extends js.Object {
  def apply(id: IdentifierKind): DeclareOpaqueType = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind): DeclareOpaqueType = js.native
  def from(params: RightTypeParameters): DeclareOpaqueType = js.native
}


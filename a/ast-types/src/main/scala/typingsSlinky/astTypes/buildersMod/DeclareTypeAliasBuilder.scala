package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.AnonRightTypeParameters
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareTypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareTypeAliasBuilder extends js.Object {
  def apply(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): DeclareTypeAlias = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): DeclareTypeAlias = js.native
  def from(params: AnonRightTypeParameters): DeclareTypeAlias = js.native
}


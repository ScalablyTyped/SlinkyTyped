package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.RightTypeParameters
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAlias
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAliasBuilder extends js.Object {
  
  def apply(id: IdentifierKind, typeParameters: Null, right: FlowTypeKind): TypeAlias = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, right: FlowTypeKind): TypeAlias = js.native
  
  def from(params: RightTypeParameters): TypeAlias = js.native
}

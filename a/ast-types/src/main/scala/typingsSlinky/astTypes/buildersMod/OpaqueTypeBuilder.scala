package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Impltype
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.OpaqueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpaqueTypeBuilder extends js.Object {
  
  def apply(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind): OpaqueType = js.native
  def apply(id: IdentifierKind, typeParameters: Null, impltype: FlowTypeKind, supertype: FlowTypeKind): OpaqueType = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, impltype: FlowTypeKind): OpaqueType = js.native
  def apply(
    id: IdentifierKind,
    typeParameters: TypeParameterDeclarationKind,
    impltype: FlowTypeKind,
    supertype: FlowTypeKind
  ): OpaqueType = js.native
  
  def from(params: Impltype): OpaqueType = js.native
}

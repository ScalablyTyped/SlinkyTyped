package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Supertype
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.TypeParameterDeclarationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.DeclareOpaqueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareOpaqueTypeBuilder extends StObject {
  
  def apply(id: IdentifierKind): DeclareOpaqueType = js.native
  def apply(id: IdentifierKind, typeParameters: Null, supertype: FlowTypeKind): DeclareOpaqueType = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind): DeclareOpaqueType = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterDeclarationKind, supertype: FlowTypeKind): DeclareOpaqueType = js.native
  
  def from(params: Supertype): DeclareOpaqueType = js.native
}

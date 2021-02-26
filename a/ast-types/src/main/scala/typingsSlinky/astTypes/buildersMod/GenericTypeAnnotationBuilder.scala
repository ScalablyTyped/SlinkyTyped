package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.IdLoc
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.QualifiedTypeIdentifierKind
import typingsSlinky.astTypes.kindsMod.TypeParameterInstantiationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.GenericTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenericTypeAnnotationBuilder extends StObject {
  
  def apply(id: IdentifierKind): GenericTypeAnnotation = js.native
  def apply(id: IdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  def apply(id: QualifiedTypeIdentifierKind): GenericTypeAnnotation = js.native
  def apply(id: QualifiedTypeIdentifierKind, typeParameters: TypeParameterInstantiationKind): GenericTypeAnnotation = js.native
  
  def from(params: IdLoc): GenericTypeAnnotation = js.native
}

package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.LocObject
import typingsSlinky.astTypes.kindsMod.GenericTypeAnnotationKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.kindsMod.MemberTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.MemberTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberTypeAnnotationBuilder extends StObject {
  
  def apply(`object`: IdentifierKind, property: GenericTypeAnnotationKind): MemberTypeAnnotation = js.native
  def apply(`object`: IdentifierKind, property: MemberTypeAnnotationKind): MemberTypeAnnotation = js.native
  
  def from(params: LocObject): MemberTypeAnnotation = js.native
}

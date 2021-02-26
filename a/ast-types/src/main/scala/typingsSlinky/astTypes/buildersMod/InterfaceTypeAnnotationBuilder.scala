package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Extends
import typingsSlinky.astTypes.kindsMod.InterfaceExtendsKind
import typingsSlinky.astTypes.kindsMod.ObjectTypeAnnotationKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.InterfaceTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterfaceTypeAnnotationBuilder extends StObject {
  
  def apply(body: ObjectTypeAnnotationKind): InterfaceTypeAnnotation = js.native
  def apply(body: ObjectTypeAnnotationKind, extendsParam: js.Array[InterfaceExtendsKind]): InterfaceTypeAnnotation = js.native
  
  def from(params: Extends): InterfaceTypeAnnotation = js.native
}

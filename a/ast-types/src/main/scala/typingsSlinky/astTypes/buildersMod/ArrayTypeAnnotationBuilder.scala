package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.ElementType
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayTypeAnnotationBuilder extends js.Object {
  
  def apply(elementType: FlowTypeKind): ArrayTypeAnnotation = js.native
  
  def from(params: ElementType): ArrayTypeAnnotation = js.native
}

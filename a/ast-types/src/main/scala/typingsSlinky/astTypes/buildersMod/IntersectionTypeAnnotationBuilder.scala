package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Types
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.IntersectionTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntersectionTypeAnnotationBuilder extends js.Object {
  
  def apply(types: js.Array[FlowTypeKind]): IntersectionTypeAnnotation = js.native
  
  def from(params: Types): IntersectionTypeAnnotation = js.native
}

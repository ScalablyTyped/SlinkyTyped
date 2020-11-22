package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.LocTypeAnnotation
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeAnnotationBuilder extends js.Object {
  
  def apply(typeAnnotation: FlowTypeKind): TypeAnnotation = js.native
  
  def from(params: LocTypeAnnotation): TypeAnnotation = js.native
}

package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Types
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TupleTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TupleTypeAnnotationBuilder extends js.Object {
  
  def apply(types: js.Array[FlowTypeKind]): TupleTypeAnnotation = js.native
  
  def from(params: Types): TupleTypeAnnotation = js.native
}

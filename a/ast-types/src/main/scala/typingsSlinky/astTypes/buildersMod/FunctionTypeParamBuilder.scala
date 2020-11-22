package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.NameOptional
import typingsSlinky.astTypes.kindsMod.FlowTypeKind
import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.FunctionTypeParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionTypeParamBuilder extends js.Object {
  
  def apply(name: Null, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam = js.native
  def apply(name: IdentifierKind, typeAnnotation: FlowTypeKind, optional: Boolean): FunctionTypeParam = js.native
  
  def from(params: NameOptional): FunctionTypeParam = js.native
}

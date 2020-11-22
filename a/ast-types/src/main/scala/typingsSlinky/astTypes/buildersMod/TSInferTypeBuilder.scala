package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.TypeParameter
import typingsSlinky.astTypes.kindsMod.TSTypeParameterKind
import typingsSlinky.astTypes.namedTypesMod.namedTypes.TSInferType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSInferTypeBuilder extends js.Object {
  
  def apply(typeParameter: TSTypeParameterKind): TSInferType = js.native
  
  def from(params: TypeParameter): TSInferType = js.native
}

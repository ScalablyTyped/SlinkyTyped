package typingsSlinky.graphqlBinding

import typingsSlinky.graphqlBinding.typesMod.Interpolation
import typingsSlinky.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-binding/dist/codegen/utils/interleave", JSImport.Namespace)
@js.native
object interleaveMod extends js.Object {
  
  def interleave[Props](strings: TemplateStringsArray, interpolations: js.Array[Interpolation[Props]]): js.Array[Interpolation[Props]] = js.native
}

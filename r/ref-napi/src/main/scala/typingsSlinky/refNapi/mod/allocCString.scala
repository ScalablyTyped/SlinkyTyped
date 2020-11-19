package typingsSlinky.refNapi.mod

import typingsSlinky.refNapi.mod.global.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ref-napi", "allocCString")
@js.native
object allocCString extends js.Object {
  
  def apply(string: String): Buffer = js.native
  def apply(string: String, encoding: String): Buffer = js.native
}

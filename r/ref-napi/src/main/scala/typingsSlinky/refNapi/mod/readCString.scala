package typingsSlinky.refNapi.mod

import typingsSlinky.refNapi.mod.global.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ref-napi", "readCString")
@js.native
object readCString extends js.Object {
  
  def apply(buffer: Buffer): String = js.native
  def apply(buffer: Buffer, offset: Double): String = js.native
}

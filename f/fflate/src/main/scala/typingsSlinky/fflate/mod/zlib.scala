package typingsSlinky.fflate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "zlib")
@js.native
object zlib extends js.Object {
  
  def apply(data: js.typedarray.Uint8Array, cb: FlateCallback): AsyncTerminable = js.native
  def apply(data: js.typedarray.Uint8Array, opts: AsyncZlibOptions, cb: FlateCallback): AsyncTerminable = js.native
}

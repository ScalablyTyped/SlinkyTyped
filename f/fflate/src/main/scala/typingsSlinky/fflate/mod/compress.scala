package typingsSlinky.fflate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "compress")
@js.native
object compress extends js.Object {
  
  def apply(data: js.typedarray.Uint8Array, cb: FlateCallback): AsyncTerminable = js.native
  def apply(data: js.typedarray.Uint8Array, opts: AsyncGzipOptions, cb: FlateCallback): AsyncTerminable = js.native
}

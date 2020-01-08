package typingsSlinky.pako.pakoMod

import typingsSlinky.pako.Anon_String
import typingsSlinky.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/deflate.js
@JSImport("pako", "Deflate")
@js.native
class Deflate () extends js.Object {
  def this(options: DeflateOptions) = this()
  var err: ReturnCodes = js.native
  var msg: String = js.native
  var result: scala.scalajs.js.typedarray.Uint8Array | js.Array[Double] = js.native
  def onData(chunk: Data): Unit = js.native
  def onEnd(status: Double): Unit = js.native
  def push(data: Data): Boolean = js.native
  def push(data: Data, mode: Boolean): Boolean = js.native
  def push(data: Data, mode: FlushValues): Boolean = js.native
  def push(data: ArrayBuffer): Boolean = js.native
  def push(data: ArrayBuffer, mode: Boolean): Boolean = js.native
  def push(data: ArrayBuffer, mode: FlushValues): Boolean = js.native
}

@JSImport("pako", "deflate")
@js.native
object deflate extends js.Object {
  def apply(data: Data): scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * Compress data with deflate algorithm and options.
    */
  def apply(data: Data, options: DeflateFunctionOptions with Anon_String): String = js.native
}


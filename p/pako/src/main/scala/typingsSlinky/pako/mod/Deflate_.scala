package typingsSlinky.pako.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/nodeca/pako/blob/893381abcafa10fa2081ce60dae7d4d8e873a658/lib/deflate.js
@JSImport("pako", "Deflate")
@js.native
class Deflate_ () extends js.Object {
  def this(options: DeflateOptions) = this()
  
  var err: ReturnCodes = js.native
  
  var msg: String = js.native
  
  def onData(chunk: Data): Unit = js.native
  
  def onEnd(status: Double): Unit = js.native
  
  def push(data: Data): Boolean = js.native
  def push(data: Data, mode: Boolean): Boolean = js.native
  def push(data: Data, mode: FlushValues): Boolean = js.native
  def push(data: js.typedarray.ArrayBuffer): Boolean = js.native
  def push(data: js.typedarray.ArrayBuffer, mode: Boolean): Boolean = js.native
  def push(data: js.typedarray.ArrayBuffer, mode: FlushValues): Boolean = js.native
  
  var result: js.typedarray.Uint8Array | js.Array[Double] = js.native
}

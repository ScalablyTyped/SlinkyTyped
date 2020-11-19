package typingsSlinky.msgpackLite.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decoder extends EventEmitter {
  
  var bufferish: js.Any = js.native
  
  def decode(chunk: js.Any): Unit = js.native
  
  def end(chunk: js.Any): Unit = js.native
  
  def fetch(): Unit = js.native
  
  def flush(): Unit = js.native
  
  var offset: Double = js.native
  
  def pull(): Double = js.native
  
  def push(chunk: js.Any): Unit = js.native
  
  def read(): Double = js.native
  
  def reserve(length: Double): Double = js.native
  
  def write(chunk: js.Any): Unit = js.native
}
@JSImport("msgpack-lite", "Decoder")
@js.native
object Decoder extends js.Object {
  
  def apply(): Decoder = js.native
  def apply(options: DecoderOptions): Decoder = js.native
}

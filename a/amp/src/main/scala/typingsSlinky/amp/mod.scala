package typingsSlinky.amp

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("amp", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(buf: Buffer): js.Array[Buffer] = js.native
  
  def encode(args: js.Array[Buffer]): Buffer = js.native
  
  @js.native
  class Stream protected () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def _write(chunk: js.Any, encoding: String, fn: js.Function0[Unit]): Unit = js.native
  }
}

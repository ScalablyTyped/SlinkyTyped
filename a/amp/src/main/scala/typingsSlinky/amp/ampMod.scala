package typingsSlinky.amp

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.WritableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amp", JSImport.Namespace)
@js.native
object ampMod extends js.Object {
  @js.native
  class Stream protected () extends Writable {
    def this(opts: WritableOptions) = this()
    def _write(chunk: js.Any, encoding: String, fn: js.Function0[Unit]): Unit = js.native
  }
  
  def decode(buf: Buffer): js.Array[Buffer] = js.native
  def encode(args: js.Array[Buffer]): Buffer = js.native
}


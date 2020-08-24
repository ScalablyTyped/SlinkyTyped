package typingsSlinky.htmlparser2

import typingsSlinky.htmlparser2.anon.PartialHandler
import typingsSlinky.htmlparser2.parserMod.Parser
import typingsSlinky.htmlparser2.parserMod.ParserOptions
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.stringDecoderMod.StringDecoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("htmlparser2/lib/WritableStream", JSImport.Namespace)
@js.native
object writableStreamMod extends js.Object {
  @js.native
  class WritableStream protected () extends Writable {
    def this(cbs: PartialHandler) = this()
    def this(cbs: PartialHandler, options: ParserOptions) = this()
    var _decoder: StringDecoder = js.native
    var _parser: Parser = js.native
    def _final(cb: js.Function0[Unit]): Unit = js.native
    def _write(chunk: String, encoding: String, cb: js.Function0[Unit]): Unit = js.native
    def _write(chunk: Buffer, encoding: String, cb: js.Function0[Unit]): Unit = js.native
  }
  
}


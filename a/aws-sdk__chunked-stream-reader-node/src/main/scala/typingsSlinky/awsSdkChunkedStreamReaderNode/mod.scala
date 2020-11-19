package typingsSlinky.awsSdkChunkedStreamReaderNode

import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/chunked-stream-reader-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def streamReader(stream: Readable, onChunk: js.Function1[/* chunk */ js.typedarray.Uint8Array, Unit]): js.Promise[Unit] = js.native
  def streamReader(
    stream: Readable,
    onChunk: js.Function1[/* chunk */ js.typedarray.Uint8Array, Unit],
    chunkSize: Double
  ): js.Promise[Unit] = js.native
}

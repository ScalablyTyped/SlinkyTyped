package typingsSlinky.awsSdkChunkedStreamReaderNode

import typingsSlinky.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/chunked-stream-reader-node", "streamReader")
  @js.native
  def streamReader(stream: Readable, onChunk: js.Function1[/* chunk */ js.typedarray.Uint8Array, Unit]): js.Promise[Unit] = js.native
  @JSImport("@aws-sdk/chunked-stream-reader-node", "streamReader")
  @js.native
  def streamReader(
    stream: Readable,
    onChunk: js.Function1[/* chunk */ js.typedarray.Uint8Array, Unit],
    chunkSize: Double
  ): js.Promise[Unit] = js.native
}

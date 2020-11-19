package typingsSlinky.awsSdkChunkedBlobReader

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/chunked-blob-reader", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def blobReader(blob: Blob, onChunk: js.Function1[/* chunk */ js.typedarray.Uint8Array, Unit]): js.Promise[Unit] = js.native
  def blobReader(blob: Blob, onChunk: js.Function1[/* chunk */ js.typedarray.Uint8Array, Unit], chunkSize: Double): js.Promise[Unit] = js.native
}

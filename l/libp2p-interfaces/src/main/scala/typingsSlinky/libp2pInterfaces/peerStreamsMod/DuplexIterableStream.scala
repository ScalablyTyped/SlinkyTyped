package typingsSlinky.libp2pInterfaces.peerStreamsMod

import typingsSlinky.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DuplexIterableStream extends js.Object {
  
  def sink(source: js.typedarray.Uint8Array): js.Promise[js.typedarray.Uint8Array] = js.native
  @JSName("sink")
  var sink_Original: Sink = js.native
  
  def source(): AsyncIterator[js.typedarray.Uint8Array, _, js.UndefOr[scala.Nothing]] = js.native
}

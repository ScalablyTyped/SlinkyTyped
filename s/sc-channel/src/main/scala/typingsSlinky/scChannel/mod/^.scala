package typingsSlinky.scChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sc-channel", JSImport.Namespace)
@js.native
class ^[T] protected () extends SCChannel[T] {
  def this(
    name: String,
    client: Client,
    eventDemux: typingsSlinky.streamDemux.mod.^[T],
    dataStream: typingsSlinky.asyncIterableStream.mod.^[T]
  ) = this()
}

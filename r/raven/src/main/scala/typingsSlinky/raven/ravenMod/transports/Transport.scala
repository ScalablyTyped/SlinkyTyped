package typingsSlinky.raven.ravenMod.transports

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.raven.ravenMod.CaptureCallback
import typingsSlinky.raven.ravenMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "transports.Transport")
@js.native
abstract class Transport () extends EventEmitter {
  def send(
    client: Client,
    message: js.Any,
    headers: OutgoingHttpHeaders,
    eventId: String,
    cb: CaptureCallback
  ): Unit = js.native
}


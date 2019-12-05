package typingsSlinky.atHapiWreck.atHapiWreckMod

import typingsSlinky.atHapiWreck.atHapiWreckStrings.request
import typingsSlinky.atHapiWreck.atHapiWreckStrings.response
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WreckEventEmitter extends EventEmitter {
  @JSName("on")
  def on_request(event: request, listener: RequestCallback): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: ResponseCallback): this.type = js.native
}


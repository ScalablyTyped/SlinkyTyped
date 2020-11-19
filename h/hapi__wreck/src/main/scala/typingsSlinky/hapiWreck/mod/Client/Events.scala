package typingsSlinky.hapiWreck.mod.Client

import typingsSlinky.hapiBoom.mod.Boom
import typingsSlinky.hapiWreck.anon.Req
import typingsSlinky.hapiWreck.hapiWreckStrings.preRequest
import typingsSlinky.hapiWreck.hapiWreckStrings.response
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends EventEmitter {
  
  @JSName("addListener")
  def addListener_preRequest(event: preRequest, litener: typingsSlinky.hapiWreck.mod.Client.Events.preRequest): this.type = js.native
  @JSName("addListener")
  def addListener_request(
    event: typingsSlinky.hapiWreck.hapiWreckStrings.request,
    listener: typingsSlinky.hapiWreck.mod.Client.Events.request
  ): this.type = js.native
  @JSName("addListener")
  def addListener_response(event: response, listener: typingsSlinky.hapiWreck.mod.Client.Events.response): this.type = js.native
  
  @JSName("on")
  def on_preRequest(event: preRequest, litener: typingsSlinky.hapiWreck.mod.Client.Events.preRequest): this.type = js.native
  @JSName("on")
  def on_request(
    event: typingsSlinky.hapiWreck.hapiWreckStrings.request,
    listener: typingsSlinky.hapiWreck.mod.Client.Events.request
  ): this.type = js.native
  @JSName("on")
  def on_response(event: response, listener: typingsSlinky.hapiWreck.mod.Client.Events.response): this.type = js.native
  
  @JSName("once")
  def once_preRequest(event: preRequest, litener: typingsSlinky.hapiWreck.mod.Client.Events.preRequest): this.type = js.native
  @JSName("once")
  def once_request(
    event: typingsSlinky.hapiWreck.hapiWreckStrings.request,
    listener: typingsSlinky.hapiWreck.mod.Client.Events.request
  ): this.type = js.native
  @JSName("once")
  def once_response(event: response, listener: typingsSlinky.hapiWreck.mod.Client.Events.response): this.type = js.native
}
@JSImport("@hapi/wreck", "Client.Events")
@js.native
object Events extends js.Object {
  
  type preRequest = js.Function2[/* uri */ String, /* options */ Options, Unit]
  
  type request = js.Function1[/* req */ ClientRequest, Unit]
  
  type response = js.Function2[/* err */ js.UndefOr[Boom[js.Any]], /* details */ Req, Unit]
}

package typingsSlinky.maximMazurokGapiClientAdmin.gapi.client.admin

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAdmin.anon.Alt
import typingsSlinky.maximMazurokGapiClientAdmin.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends js.Object {
  
  /** Stop watching resources through this channel. */
  def stop(request: Alt): Request[Unit] = js.native
  def stop(request: Callback, body: Channel): Request[Unit] = js.native
}

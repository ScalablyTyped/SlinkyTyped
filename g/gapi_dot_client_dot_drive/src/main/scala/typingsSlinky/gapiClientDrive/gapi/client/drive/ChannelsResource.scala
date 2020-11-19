package typingsSlinky.gapiClientDrive.gapi.client.drive

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDrive.anon.Alt
import typingsSlinky.gapiClientDrive.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends js.Object {
  
  def stop(request: Alt, body: Channel): Request[Unit] = js.native
  /** Stop watching resources through this channel */
  def stop(request: Key): Request[Unit] = js.native
}

package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientYoutube.anon.AccesstokenAltCallback
import typingsSlinky.maximMazurokGapiClientYoutube.anon.ChannelIdFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatermarksResource extends StObject {
  
  def set(request: AccesstokenAltCallback, body: InvideoBranding): Request[Unit] = js.native
  /** Allows upload of watermark image and setting it for a channel. */
  def set(request: ChannelIdFields): Request[Unit] = js.native
  
  /** Allows removal of channel watermark. */
  def unset(): Request[Unit] = js.native
  def unset(request: AccesstokenAltCallback): Request[Unit] = js.native
}

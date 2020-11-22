package typingsSlinky.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Alt
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.Oauthtoken
import typingsSlinky.maximMazurokGapiClientAndroidpublisher.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TracksResource extends js.Object {
  
  /** Gets a track. */
  def get(): Request[Track] = js.native
  def get(request: Oauthtoken): Request[Track] = js.native
  
  /** Lists all tracks. */
  def list(): Request[TracksListResponse] = js.native
  def list(request: Alt): Request[TracksListResponse] = js.native
  
  def patch(request: Oauthtoken, body: Track): Request[Track] = js.native
  /** Patches a track. */
  def patch(request: PrettyPrint): Request[Track] = js.native
  
  def update(request: Oauthtoken, body: Track): Request[Track] = js.native
  /** Updates a track. */
  def update(request: PrettyPrint): Request[Track] = js.native
}

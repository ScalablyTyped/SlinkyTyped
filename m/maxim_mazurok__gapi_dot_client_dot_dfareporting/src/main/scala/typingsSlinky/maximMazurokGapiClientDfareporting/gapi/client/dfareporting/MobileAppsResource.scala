package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Directories
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MobileAppsResource extends js.Object {
  
  /** Gets one mobile app by ID. */
  def get(): Request[MobileApp] = js.native
  def get(request: Alt): Request[MobileApp] = js.native
  
  /** Retrieves list of available mobile apps. */
  def list(): Request[MobileAppsListResponse] = js.native
  def list(request: Directories): Request[MobileAppsListResponse] = js.native
}

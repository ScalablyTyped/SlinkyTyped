package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPermissionsResource extends StObject {
  
  /** Gets one account permission by ID. */
  def get(): Request[AccountPermission] = js.native
  def get(request: Alt): Request[AccountPermission] = js.native
  
  /** Retrieves the list of account permissions. */
  def list(): Request[AccountPermissionsListResponse] = js.native
  def list(request: Callback): Request[AccountPermissionsListResponse] = js.native
}

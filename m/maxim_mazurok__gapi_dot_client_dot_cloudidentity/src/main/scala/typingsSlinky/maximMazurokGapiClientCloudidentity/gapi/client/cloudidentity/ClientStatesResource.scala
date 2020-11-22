package typingsSlinky.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.Accesstoken
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.Alt
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.Callback
import typingsSlinky.maximMazurokGapiClientCloudidentity.anon.Customer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientStatesResource extends js.Object {
  
  /** Gets the client state for the device user */
  def get(): Request[GoogleAppsCloudidentityDevicesV1ClientState] = js.native
  def get(request: Accesstoken): Request[GoogleAppsCloudidentityDevicesV1ClientState] = js.native
  
  /** Lists the client states for the given search query. */
  def list(): Request[GoogleAppsCloudidentityDevicesV1ListClientStatesResponse] = js.native
  def list(request: Alt): Request[GoogleAppsCloudidentityDevicesV1ListClientStatesResponse] = js.native
  
  /** Updates the client state for the device user */
  def patch(request: Callback): Request[Operation] = js.native
  def patch(request: Customer, body: GoogleAppsCloudidentityDevicesV1ClientState): Request[Operation] = js.native
}

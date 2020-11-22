package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Name
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentsResource extends js.Object {
  
  var devices: DevicesResource = js.native
  
  def move(request: Name, body: SasPortalMoveDeploymentRequest): Request[SasPortalOperation] = js.native
  /** Moves a deployment under another node or customer. */
  def move(request: Uploadprotocol): Request[SasPortalOperation] = js.native
}

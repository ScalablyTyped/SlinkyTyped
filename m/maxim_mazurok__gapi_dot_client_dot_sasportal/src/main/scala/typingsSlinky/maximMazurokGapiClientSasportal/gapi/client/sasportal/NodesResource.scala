package typingsSlinky.maximMazurokGapiClientSasportal.gapi.client.sasportal

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Alt
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Name
import typingsSlinky.maximMazurokGapiClientSasportal.anon.PageSize
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Parent
import typingsSlinky.maximMazurokGapiClientSasportal.anon.QuotaUser
import typingsSlinky.maximMazurokGapiClientSasportal.anon.UpdateMask
import typingsSlinky.maximMazurokGapiClientSasportal.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesResource extends StObject {
  
  def create(request: Alt, body: SasPortalNode): Request[SasPortalNode] = js.native
  /** Creates a new node. */
  def create(request: Parent): Request[SasPortalNode] = js.native
  
  /** Deletes a node. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  var deployments: DeploymentsResource = js.native
  
  var devices: DevicesResource = js.native
  
  /** Returns a requested node. */
  def get(): Request[SasPortalNode] = js.native
  def get(request: Name): Request[SasPortalNode] = js.native
  
  /** Lists nodes. */
  def list(): Request[SasPortalListNodesResponse] = js.native
  def list(request: PageSize): Request[SasPortalListNodesResponse] = js.native
  
  def move(request: Name, body: SasPortalMoveNodeRequest): Request[SasPortalOperation] = js.native
  /** Moves a node under another node or customer. */
  def move(request: Xgafv): Request[SasPortalOperation] = js.native
  
  var nodes: NodesResource = js.native
  
  def patch(request: QuotaUser, body: SasPortalNode): Request[SasPortalNode] = js.native
  /** Updates an existing node. */
  def patch(request: UpdateMask): Request[SasPortalNode] = js.native
}

package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.FloodlightConfigurationId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.IdKeyOauthtoken
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.PrettyPrintProfileIdQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightActivityGroupsResource extends js.Object {
  
  /** Gets one floodlight activity group by ID. */
  def get(): Request[FloodlightActivityGroup] = js.native
  def get(request: Alt): Request[FloodlightActivityGroup] = js.native
  
  def insert(request: Callback, body: FloodlightActivityGroup): Request[FloodlightActivityGroup] = js.native
  /** Inserts a new floodlight activity group. */
  def insert(request: PrettyPrintProfileIdQuotaUser): Request[FloodlightActivityGroup] = js.native
  
  /** Retrieves a list of floodlight activity groups, possibly filtered. This method supports paging. */
  def list(): Request[FloodlightActivityGroupsListResponse] = js.native
  def list(request: FloodlightConfigurationId): Request[FloodlightActivityGroupsListResponse] = js.native
  
  def patch(request: Alt, body: FloodlightActivityGroup): Request[FloodlightActivityGroup] = js.native
  /** Updates an existing floodlight activity group. This method supports patch semantics. */
  def patch(request: IdKeyOauthtoken): Request[FloodlightActivityGroup] = js.native
  
  def update(request: Callback, body: FloodlightActivityGroup): Request[FloodlightActivityGroup] = js.native
  /** Updates an existing floodlight activity group. */
  def update(request: PrettyPrintProfileIdQuotaUser): Request[FloodlightActivityGroup] = js.native
}

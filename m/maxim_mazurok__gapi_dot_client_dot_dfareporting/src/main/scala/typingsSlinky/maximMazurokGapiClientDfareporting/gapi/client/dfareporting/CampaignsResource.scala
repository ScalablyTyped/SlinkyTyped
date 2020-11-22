package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Alt
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Archived
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.Callback
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.CallbackFields
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.FieldsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignsResource extends js.Object {
  
  /** Gets one campaign by ID. */
  def get(): Request[Campaign] = js.native
  def get(request: Alt): Request[Campaign] = js.native
  
  /** Inserts a new campaign. */
  def insert(request: CallbackFields): Request[Campaign] = js.native
  def insert(request: Callback, body: Campaign): Request[Campaign] = js.native
  
  /** Retrieves a list of campaigns, possibly filtered. This method supports paging. */
  def list(): Request[CampaignsListResponse] = js.native
  def list(request: Archived): Request[CampaignsListResponse] = js.native
  
  def patch(request: Alt, body: Campaign): Request[Campaign] = js.native
  /** Updates an existing campaign. This method supports patch semantics. */
  def patch(request: FieldsId): Request[Campaign] = js.native
  
  /** Updates an existing campaign. */
  def update(request: CallbackFields): Request[Campaign] = js.native
  def update(request: Callback, body: Campaign): Request[Campaign] = js.native
}

package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.CallbackCampaignId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.CampaignId
import typingsSlinky.maximMazurokGapiClientDfareporting.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignCreativeAssociationsResource extends js.Object {
  
  def insert(request: CallbackCampaignId, body: CampaignCreativeAssociation): Request[CampaignCreativeAssociation] = js.native
  /**
    * Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a default ad does not exist
    * already.
    */
  def insert(request: CampaignId): Request[CampaignCreativeAssociation] = js.native
  
  /** Retrieves the list of creative IDs associated with the specified campaign. This method supports paging. */
  def list(): Request[CampaignCreativeAssociationsListResponse] = js.native
  def list(request: PageToken): Request[CampaignCreativeAssociationsListResponse] = js.native
}

package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CampaignCreativeAssociation
import typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.CampaignCreativeAssociationsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignCreativeAssociationsCollection extends js.Object {
  
  // Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a default ad does not exist already.
  def insert(resource: CampaignCreativeAssociation, profileId: String, campaignId: String): CampaignCreativeAssociation = js.native
  
  // Retrieves the list of creative IDs associated with the specified campaign. This method supports paging.
  def list(profileId: String, campaignId: String): CampaignCreativeAssociationsListResponse = js.native
  // Retrieves the list of creative IDs associated with the specified campaign. This method supports paging.
  def list(profileId: String, campaignId: String, optionalArgs: js.Object): CampaignCreativeAssociationsListResponse = js.native
}

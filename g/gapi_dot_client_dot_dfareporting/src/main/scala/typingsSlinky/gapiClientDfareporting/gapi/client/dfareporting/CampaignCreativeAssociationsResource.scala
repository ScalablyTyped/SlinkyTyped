package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonCampaignId
import typingsSlinky.gapiClientDfareporting.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignCreativeAssociationsResource extends js.Object {
  /**
    * Associates a creative with the specified campaign. This method creates a default ad with dimensions matching the creative in the campaign if such a
    * default ad does not exist already.
    */
  def insert(request: AnonCampaignId): Request_[CampaignCreativeAssociation] = js.native
  /** Retrieves the list of creative IDs associated with the specified campaign. This method supports paging. */
  def list(request: AnonPageToken): Request_[CampaignCreativeAssociationsListResponse] = js.native
}

object CampaignCreativeAssociationsResource {
  @scala.inline
  def apply(
    insert: AnonCampaignId => Request_[CampaignCreativeAssociation],
    list: AnonPageToken => Request_[CampaignCreativeAssociationsListResponse]
  ): CampaignCreativeAssociationsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[CampaignCreativeAssociationsResource]
  }
  @scala.inline
  implicit class CampaignCreativeAssociationsResourceOps[Self <: CampaignCreativeAssociationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: AnonCampaignId => Request_[CampaignCreativeAssociation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPageToken => Request_[CampaignCreativeAssociationsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


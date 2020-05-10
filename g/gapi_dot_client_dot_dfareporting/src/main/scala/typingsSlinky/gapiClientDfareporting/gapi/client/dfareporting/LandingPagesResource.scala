package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonAltCampaignId
import typingsSlinky.gapiClientDfareporting.AnonCampaignId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LandingPagesResource extends js.Object {
  /** Deletes an existing campaign landing page. */
  def delete(request: AnonAltCampaignId): Request_[Unit] = js.native
  /** Gets one campaign landing page by ID. */
  def get(request: AnonAltCampaignId): Request_[LandingPage] = js.native
  /** Inserts a new landing page for the specified campaign. */
  def insert(request: AnonCampaignId): Request_[LandingPage] = js.native
  /** Retrieves the list of landing pages for the specified campaign. */
  def list(request: AnonCampaignId): Request_[LandingPagesListResponse] = js.native
  /** Updates an existing campaign landing page. This method supports patch semantics. */
  def patch(request: AnonAltCampaignId): Request_[LandingPage] = js.native
  /** Updates an existing campaign landing page. */
  def update(request: AnonCampaignId): Request_[LandingPage] = js.native
}

object LandingPagesResource {
  @scala.inline
  def apply(
    delete: AnonAltCampaignId => Request_[Unit],
    get: AnonAltCampaignId => Request_[LandingPage],
    insert: AnonCampaignId => Request_[LandingPage],
    list: AnonCampaignId => Request_[LandingPagesListResponse],
    patch: AnonAltCampaignId => Request_[LandingPage],
    update: AnonCampaignId => Request_[LandingPage]
  ): LandingPagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LandingPagesResource]
  }
  @scala.inline
  implicit class LandingPagesResourceOps[Self <: LandingPagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: AnonAltCampaignId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAltCampaignId => Request_[LandingPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonCampaignId => Request_[LandingPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCampaignId => Request_[LandingPagesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonAltCampaignId => Request_[LandingPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonCampaignId => Request_[LandingPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.AdvertiserIds
import typingsSlinky.gapiClientDfareporting.anon.DefaultLandingPageName
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignsResource extends js.Object {
  /** Gets one campaign by ID. */
  def get(request: Fields): Request[Campaign]
  /** Inserts a new campaign. */
  def insert(request: DefaultLandingPageName): Request[Campaign]
  /** Retrieves a list of campaigns, possibly filtered. This method supports paging. */
  def list(request: AdvertiserIds): Request[CampaignsListResponse]
  /** Updates an existing campaign. This method supports patch semantics. */
  def patch(request: Fields): Request[Campaign]
  /** Updates an existing campaign. */
  def update(request: Key): Request[Campaign]
}

object CampaignsResource {
  @scala.inline
  def apply(
    get: Fields => Request[Campaign],
    insert: DefaultLandingPageName => Request[Campaign],
    list: AdvertiserIds => Request[CampaignsListResponse],
    patch: Fields => Request[Campaign],
    update: Key => Request[Campaign]
  ): CampaignsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[CampaignsResource]
  }
}


package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonAdvertiserGroupIds
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertisersResource extends js.Object {
  /** Gets one advertiser by ID. */
  def get(request: AnonFields): Request_[Advertiser] = js.native
  /** Inserts a new advertiser. */
  def insert(request: AnonKey): Request_[Advertiser] = js.native
  /** Retrieves a list of advertisers, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserGroupIds): Request_[AdvertisersListResponse] = js.native
  /** Updates an existing advertiser. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Advertiser] = js.native
  /** Updates an existing advertiser. */
  def update(request: AnonKey): Request_[Advertiser] = js.native
}

object AdvertisersResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[Advertiser],
    insert: AnonKey => Request_[Advertiser],
    list: AnonAdvertiserGroupIds => Request_[AdvertisersListResponse],
    patch: AnonFields => Request_[Advertiser],
    update: AnonKey => Request_[Advertiser]
  ): AdvertisersResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdvertisersResource]
  }
  @scala.inline
  implicit class AdvertisersResourceOps[Self <: AdvertisersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[Advertiser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[Advertiser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAdvertiserGroupIds => Request_[AdvertisersListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[Advertiser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[Advertiser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


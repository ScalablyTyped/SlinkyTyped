package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.AdvertiserGroupIds
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertisersResource extends js.Object {
  /** Gets one advertiser by ID. */
  def get(request: Fields): Request[Advertiser] = js.native
  /** Inserts a new advertiser. */
  def insert(request: Key): Request[Advertiser] = js.native
  /** Retrieves a list of advertisers, possibly filtered. This method supports paging. */
  def list(request: AdvertiserGroupIds): Request[AdvertisersListResponse] = js.native
  /** Updates an existing advertiser. This method supports patch semantics. */
  def patch(request: Fields): Request[Advertiser] = js.native
  /** Updates an existing advertiser. */
  def update(request: Key): Request[Advertiser] = js.native
}

object AdvertisersResource {
  @scala.inline
  def apply(
    get: Fields => Request[Advertiser],
    insert: Key => Request[Advertiser],
    list: AdvertiserGroupIds => Request[AdvertisersListResponse],
    patch: Fields => Request[Advertiser],
    update: Key => Request[Advertiser]
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
    def withGet(value: Fields => Request[Advertiser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[Advertiser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AdvertiserGroupIds => Request[AdvertisersListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[Advertiser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[Advertiser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


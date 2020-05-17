package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientDfareporting.anon.Fields
import typingsSlinky.gapiClientDfareporting.anon.Key
import typingsSlinky.gapiClientDfareporting.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertiserGroupsResource extends js.Object {
  /** Deletes an existing advertiser group. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets one advertiser group by ID. */
  def get(request: Fields): Request[AdvertiserGroup] = js.native
  /** Inserts a new advertiser group. */
  def insert(request: Key): Request[AdvertiserGroup] = js.native
  /** Retrieves a list of advertiser groups, possibly filtered. This method supports paging. */
  def list(request: Oauthtoken): Request[AdvertiserGroupsListResponse] = js.native
  /** Updates an existing advertiser group. This method supports patch semantics. */
  def patch(request: Fields): Request[AdvertiserGroup] = js.native
  /** Updates an existing advertiser group. */
  def update(request: Key): Request[AdvertiserGroup] = js.native
}

object AdvertiserGroupsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[AdvertiserGroup],
    insert: Key => Request[AdvertiserGroup],
    list: Oauthtoken => Request[AdvertiserGroupsListResponse],
    patch: Fields => Request[AdvertiserGroup],
    update: Key => Request[AdvertiserGroup]
  ): AdvertiserGroupsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdvertiserGroupsResource]
  }
  @scala.inline
  implicit class AdvertiserGroupsResourceOps[Self <: AdvertiserGroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Fields => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Fields => Request[AdvertiserGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[AdvertiserGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Oauthtoken => Request[AdvertiserGroupsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Fields => Request[AdvertiserGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[AdvertiserGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


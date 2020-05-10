package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import typingsSlinky.gapiClientDfareporting.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertiserGroupsResource extends js.Object {
  /** Deletes an existing advertiser group. */
  def delete(request: AnonFields): Request_[Unit] = js.native
  /** Gets one advertiser group by ID. */
  def get(request: AnonFields): Request_[AdvertiserGroup] = js.native
  /** Inserts a new advertiser group. */
  def insert(request: AnonKey): Request_[AdvertiserGroup] = js.native
  /** Retrieves a list of advertiser groups, possibly filtered. This method supports paging. */
  def list(request: AnonOauthtoken): Request_[AdvertiserGroupsListResponse] = js.native
  /** Updates an existing advertiser group. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[AdvertiserGroup] = js.native
  /** Updates an existing advertiser group. */
  def update(request: AnonKey): Request_[AdvertiserGroup] = js.native
}

object AdvertiserGroupsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[AdvertiserGroup],
    insert: AnonKey => Request_[AdvertiserGroup],
    list: AnonOauthtoken => Request_[AdvertiserGroupsListResponse],
    patch: AnonFields => Request_[AdvertiserGroup],
    update: AnonKey => Request_[AdvertiserGroup]
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
    def withDelete(value: AnonFields => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFields => Request_[AdvertiserGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[AdvertiserGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonOauthtoken => Request_[AdvertiserGroupsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[AdvertiserGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[AdvertiserGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


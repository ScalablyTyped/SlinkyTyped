package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientDfareporting.AnonAdvertiserId
import typingsSlinky.gapiClientDfareporting.AnonFields
import typingsSlinky.gapiClientDfareporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdsResource extends js.Object {
  /** Gets one ad by ID. */
  def get(request: AnonFields): Request_[Ad] = js.native
  /** Inserts a new ad. */
  def insert(request: AnonKey): Request_[Ad] = js.native
  /** Retrieves a list of ads, possibly filtered. This method supports paging. */
  def list(request: AnonAdvertiserId): Request_[AdsListResponse] = js.native
  /** Updates an existing ad. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Ad] = js.native
  /** Updates an existing ad. */
  def update(request: AnonKey): Request_[Ad] = js.native
}

object AdsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[Ad],
    insert: AnonKey => Request_[Ad],
    list: AnonAdvertiserId => Request_[AdsListResponse],
    patch: AnonFields => Request_[Ad],
    update: AnonKey => Request_[Ad]
  ): AdsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AdsResource]
  }
  @scala.inline
  implicit class AdsResourceOps[Self <: AdsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonFields => Request_[Ad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonKey => Request_[Ad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAdvertiserId => Request_[AdsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonFields => Request_[Ad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonKey => Request_[Ad]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


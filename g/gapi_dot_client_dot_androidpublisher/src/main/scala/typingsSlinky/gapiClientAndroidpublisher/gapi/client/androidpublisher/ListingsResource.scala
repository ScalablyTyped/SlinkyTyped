package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidpublisher.anon.EditId
import typingsSlinky.gapiClientAndroidpublisher.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListingsResource extends js.Object {
  /** Deletes the specified localized store listing from an edit. */
  def delete(request: Key): Request[Unit] = js.native
  /** Deletes all localized listings from an edit. */
  def deleteall(request: EditId): Request[Unit] = js.native
  /** Fetches information about a localized store listing. */
  def get(request: Key): Request[Listing] = js.native
  /** Returns all of the localized store listings attached to this edit. */
  def list(request: EditId): Request[ListingsListResponse] = js.native
  /** Creates or updates a localized store listing. This method supports patch semantics. */
  def patch(request: Key): Request[Listing] = js.native
  /** Creates or updates a localized store listing. */
  def update(request: Key): Request[Listing] = js.native
}

object ListingsResource {
  @scala.inline
  def apply(
    delete: Key => Request[Unit],
    deleteall: EditId => Request[Unit],
    get: Key => Request[Listing],
    list: EditId => Request[ListingsListResponse],
    patch: Key => Request[Listing],
    update: Key => Request[Listing]
  ): ListingsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deleteall = js.Any.fromFunction1(deleteall), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ListingsResource]
  }
  @scala.inline
  implicit class ListingsResourceOps[Self <: ListingsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: Key => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteall(value: EditId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteall")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Key => Request[Listing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: EditId => Request[ListingsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: Key => Request[Listing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Key => Request[Listing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


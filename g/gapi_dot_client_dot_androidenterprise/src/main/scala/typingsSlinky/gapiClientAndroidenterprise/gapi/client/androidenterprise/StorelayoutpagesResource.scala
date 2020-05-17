package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidenterprise.anon.Key
import typingsSlinky.gapiClientAndroidenterprise.anon.PageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorelayoutpagesResource extends js.Object {
  /** Deletes a store page. */
  def delete(request: PageId): Request[Unit] = js.native
  /** Retrieves details of a store page. */
  def get(request: PageId): Request[StorePage] = js.native
  /** Inserts a new store page. */
  def insert(request: Key): Request[StorePage] = js.native
  /** Retrieves the details of all pages in the store. */
  def list(request: Key): Request[StoreLayoutPagesListResponse] = js.native
  /** Updates the content of a store page. This method supports patch semantics. */
  def patch(request: PageId): Request[StorePage] = js.native
  /** Updates the content of a store page. */
  def update(request: PageId): Request[StorePage] = js.native
}

object StorelayoutpagesResource {
  @scala.inline
  def apply(
    delete: PageId => Request[Unit],
    get: PageId => Request[StorePage],
    insert: Key => Request[StorePage],
    list: Key => Request[StoreLayoutPagesListResponse],
    patch: PageId => Request[StorePage],
    update: PageId => Request[StorePage]
  ): StorelayoutpagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StorelayoutpagesResource]
  }
  @scala.inline
  implicit class StorelayoutpagesResourceOps[Self <: StorelayoutpagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: PageId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: PageId => Request[StorePage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: Key => Request[StorePage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Key => Request[StoreLayoutPagesListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: PageId => Request[StorePage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: PageId => Request[StorePage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


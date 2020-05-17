package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAndroidenterprise.anon.ClusterId
import typingsSlinky.gapiClientAndroidenterprise.anon.PageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorelayoutclustersResource extends js.Object {
  /** Deletes a cluster. */
  def delete(request: ClusterId): Request[Unit] = js.native
  /** Retrieves details of a cluster. */
  def get(request: ClusterId): Request[StoreCluster] = js.native
  /** Inserts a new cluster in a page. */
  def insert(request: PageId): Request[StoreCluster] = js.native
  /** Retrieves the details of all clusters on the specified page. */
  def list(request: PageId): Request[StoreLayoutClustersListResponse] = js.native
  /** Updates a cluster. This method supports patch semantics. */
  def patch(request: ClusterId): Request[StoreCluster] = js.native
  /** Updates a cluster. */
  def update(request: ClusterId): Request[StoreCluster] = js.native
}

object StorelayoutclustersResource {
  @scala.inline
  def apply(
    delete: ClusterId => Request[Unit],
    get: ClusterId => Request[StoreCluster],
    insert: PageId => Request[StoreCluster],
    list: PageId => Request[StoreLayoutClustersListResponse],
    patch: ClusterId => Request[StoreCluster],
    update: ClusterId => Request[StoreCluster]
  ): StorelayoutclustersResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[StorelayoutclustersResource]
  }
  @scala.inline
  implicit class StorelayoutclustersResourceOps[Self <: StorelayoutclustersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelete(value: ClusterId => Request[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: ClusterId => Request[StoreCluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: PageId => Request[StoreCluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: PageId => Request[StoreLayoutClustersListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: ClusterId => Request[StoreCluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: ClusterId => Request[StoreCluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


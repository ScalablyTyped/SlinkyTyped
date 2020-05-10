package typingsSlinky.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidenterprise.AnonClusterId
import typingsSlinky.gapiClientAndroidenterprise.AnonPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorelayoutclustersResource extends js.Object {
  /** Deletes a cluster. */
  def delete(request: AnonClusterId): Request_[Unit] = js.native
  /** Retrieves details of a cluster. */
  def get(request: AnonClusterId): Request_[StoreCluster] = js.native
  /** Inserts a new cluster in a page. */
  def insert(request: AnonPageId): Request_[StoreCluster] = js.native
  /** Retrieves the details of all clusters on the specified page. */
  def list(request: AnonPageId): Request_[StoreLayoutClustersListResponse] = js.native
  /** Updates a cluster. This method supports patch semantics. */
  def patch(request: AnonClusterId): Request_[StoreCluster] = js.native
  /** Updates a cluster. */
  def update(request: AnonClusterId): Request_[StoreCluster] = js.native
}

object StorelayoutclustersResource {
  @scala.inline
  def apply(
    delete: AnonClusterId => Request_[Unit],
    get: AnonClusterId => Request_[StoreCluster],
    insert: AnonPageId => Request_[StoreCluster],
    list: AnonPageId => Request_[StoreLayoutClustersListResponse],
    patch: AnonClusterId => Request_[StoreCluster],
    update: AnonClusterId => Request_[StoreCluster]
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
    def withDelete(value: AnonClusterId => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonClusterId => Request_[StoreCluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPageId => Request_[StoreCluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonPageId => Request_[StoreLayoutClustersListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: AnonClusterId => Request_[StoreCluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonClusterId => Request_[StoreCluster]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


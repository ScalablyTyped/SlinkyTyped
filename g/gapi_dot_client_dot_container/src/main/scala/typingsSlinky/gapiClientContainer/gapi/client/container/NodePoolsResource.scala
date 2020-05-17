package typingsSlinky.gapiClientContainer.gapi.client.container

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientContainer.anon.Accesstoken
import typingsSlinky.gapiClientContainer.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePoolsResource extends js.Object {
  /** Sets the autoscaling settings of a specific node pool. */
  def autoscaling(request: Accesstoken): Request[Operation] = js.native
  /** Creates a node pool for a cluster. */
  def create(request: Alt): Request[Operation] = js.native
  /** Deletes a node pool from a cluster. */
  def delete(request: Accesstoken): Request[Operation] = js.native
  /** Retrieves the node pool requested. */
  def get(request: Accesstoken): Request[NodePool] = js.native
  /** Lists the node pools for a cluster. */
  def list(request: Alt): Request[ListNodePoolsResponse] = js.native
  /**
    * Roll back the previously Aborted or Failed NodePool upgrade.
    * This will be an no-op if the last upgrade successfully completed.
    */
  def rollback(request: Accesstoken): Request[Operation] = js.native
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: Accesstoken): Request[Operation] = js.native
  /** Sets the size of a specific node pool. */
  def setSize(request: Accesstoken): Request[Operation] = js.native
  /** Updates the version and/or image type of a specific node pool. */
  def update(request: Accesstoken): Request[Operation] = js.native
}

object NodePoolsResource {
  @scala.inline
  def apply(
    autoscaling: Accesstoken => Request[Operation],
    create: Alt => Request[Operation],
    delete: Accesstoken => Request[Operation],
    get: Accesstoken => Request[NodePool],
    list: Alt => Request[ListNodePoolsResponse],
    rollback: Accesstoken => Request[Operation],
    setManagement: Accesstoken => Request[Operation],
    setSize: Accesstoken => Request[Operation],
    update: Accesstoken => Request[Operation]
  ): NodePoolsResource = {
    val __obj = js.Dynamic.literal(autoscaling = js.Any.fromFunction1(autoscaling), create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), rollback = js.Any.fromFunction1(rollback), setManagement = js.Any.fromFunction1(setManagement), setSize = js.Any.fromFunction1(setSize), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[NodePoolsResource]
  }
  @scala.inline
  implicit class NodePoolsResourceOps[Self <: NodePoolsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscaling(value: Accesstoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscaling")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: Alt => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: Accesstoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: Accesstoken => Request[NodePool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Alt => Request[ListNodePoolsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRollback(value: Accesstoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetManagement(value: Accesstoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setManagement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSize(value: Accesstoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: Accesstoken => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


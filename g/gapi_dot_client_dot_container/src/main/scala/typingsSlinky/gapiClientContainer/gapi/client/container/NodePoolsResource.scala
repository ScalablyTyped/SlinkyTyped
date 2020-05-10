package typingsSlinky.gapiClientContainer.gapi.client.container

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientContainer.AnonAccesstoken
import typingsSlinky.gapiClientContainer.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodePoolsResource extends js.Object {
  /** Sets the autoscaling settings of a specific node pool. */
  def autoscaling(request: AnonAccesstoken): Request_[Operation] = js.native
  /** Creates a node pool for a cluster. */
  def create(request: AnonAlt): Request_[Operation] = js.native
  /** Deletes a node pool from a cluster. */
  def delete(request: AnonAccesstoken): Request_[Operation] = js.native
  /** Retrieves the node pool requested. */
  def get(request: AnonAccesstoken): Request_[NodePool] = js.native
  /** Lists the node pools for a cluster. */
  def list(request: AnonAlt): Request_[ListNodePoolsResponse] = js.native
  /**
    * Roll back the previously Aborted or Failed NodePool upgrade.
    * This will be an no-op if the last upgrade successfully completed.
    */
  def rollback(request: AnonAccesstoken): Request_[Operation] = js.native
  /** Sets the NodeManagement options for a node pool. */
  def setManagement(request: AnonAccesstoken): Request_[Operation] = js.native
  /** Sets the size of a specific node pool. */
  def setSize(request: AnonAccesstoken): Request_[Operation] = js.native
  /** Updates the version and/or image type of a specific node pool. */
  def update(request: AnonAccesstoken): Request_[Operation] = js.native
}

object NodePoolsResource {
  @scala.inline
  def apply(
    autoscaling: AnonAccesstoken => Request_[Operation],
    create: AnonAlt => Request_[Operation],
    delete: AnonAccesstoken => Request_[Operation],
    get: AnonAccesstoken => Request_[NodePool],
    list: AnonAlt => Request_[ListNodePoolsResponse],
    rollback: AnonAccesstoken => Request_[Operation],
    setManagement: AnonAccesstoken => Request_[Operation],
    setSize: AnonAccesstoken => Request_[Operation],
    update: AnonAccesstoken => Request_[Operation]
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
    def withAutoscaling(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscaling")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreate(value: AnonAlt => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonAccesstoken => Request_[NodePool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonAlt => Request_[ListNodePoolsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRollback(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rollback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetManagement(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setManagement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSize(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: AnonAccesstoken => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFields
import typingsSlinky.gapiClientCompute.AnonFieldsInstanceGroupManager
import typingsSlinky.gapiClientCompute.AnonInstanceGroupManager
import typingsSlinky.gapiClientCompute.AnonMaxResults
import typingsSlinky.gapiClientCompute.AnonQuotaUser
import typingsSlinky.gapiClientCompute.AnonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupManagersResource extends js.Object {
  /**
    * Schedules a group action to remove the specified instances from the managed instance group. Abandoning an instance does not delete the instance, but it
    * does remove the instance from any target pools that are applied by the managed instance group. This method reduces the targetSize of the managed
    * instance group by the number of instances that you abandon. This operation is marked as DONE when the action is scheduled even if the instances have
    * not yet been removed from the group. You must separately verify the status of the abandoning action with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def abandonInstances(request: AnonInstanceGroupManager): Request_[Operation] = js.native
  /** Retrieves the list of managed instance groups and groups them by zone. */
  def aggregatedList(request: AnonAlt): Request_[InstanceGroupManagerAggregatedList] = js.native
  /**
    * Deletes the specified managed instance group and all of the instances in that group. Note that the instance group must not belong to a backend service.
    * Read  Deleting an instance group for more information.
    */
  def delete(request: AnonInstanceGroupManager): Request_[Operation] = js.native
  /**
    * Schedules a group action to delete the specified instances in the managed instance group. The instances are also removed from any target pools of which
    * they were a member. This method reduces the targetSize of the managed instance group by the number of instances that you delete. This operation is
    * marked as DONE when the action is scheduled even if the instances are still being deleted. You must separately verify the status of the deleting action
    * with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def deleteInstances(request: AnonInstanceGroupManager): Request_[Operation] = js.native
  /** Returns all of the details about the specified managed instance group. Get a list of available managed instance groups by making a list() request. */
  def get(request: AnonFieldsInstanceGroupManager): Request_[InstanceGroupManager] = js.native
  /**
    * Creates a managed instance group using the information that you specify in the request. After the group is created, it schedules an action to create
    * instances in the group using the specified instance template. This operation is marked as DONE when the group is created even if the instances in the
    * group have not yet been created. You must separately verify the status of the individual instances with the listmanagedinstances method.
    *
    * A managed instance group can have up to 1000 VM instances per group. Please contact Cloud Support if you need an increase in this limit.
    */
  def insert(request: AnonQuotaUser): Request_[Operation] = js.native
  /** Retrieves a list of managed instance groups that are contained within the specified project and zone. */
  def list(request: AnonFields): Request_[InstanceGroupManagerList] = js.native
  /**
    * Lists all of the instances in the managed instance group. Each instance in the list has a currentAction, which indicates the action that the managed
    * instance group is performing on the instance. For example, if the group is still creating an instance, the currentAction is CREATING. If a previous
    * action failed, the list displays the errors for that failed action.
    */
  def listManagedInstances(request: AnonMaxResults): Request_[InstanceGroupManagersListManagedInstancesResponse] = js.native
  /**
    * Schedules a group action to recreate the specified instances in the managed instance group. The instances are deleted and recreated using the current
    * instance template for the managed instance group. This operation is marked as DONE when the action is scheduled even if the instances have not yet been
    * recreated. You must separately verify the status of the recreating action with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    *
    * You can specify a maximum of 1000 instances with this method per request.
    */
  def recreateInstances(request: AnonInstanceGroupManager): Request_[Operation] = js.native
  /**
    * Resizes the managed instance group. If you increase the size, the group creates new instances using the current instance template. If you decrease the
    * size, the group deletes instances. The resize operation is marked DONE when the resize actions are scheduled even if the group has not yet added or
    * deleted any instances. You must separately verify the status of the creating or deleting actions with the listmanagedinstances method.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration has
    * elapsed before the VM instance is removed or deleted.
    */
  def resize(request: AnonSize): Request_[Operation] = js.native
  /**
    * Specifies the instance template to use when creating new instances in this group. The templates for existing instances in the group do not change
    * unless you recreate them.
    */
  def setInstanceTemplate(request: AnonInstanceGroupManager): Request_[Operation] = js.native
  /**
    * Modifies the target pools to which all instances in this managed instance group are assigned. The target pools automatically apply to all of the
    * instances in the managed instance group. This operation is marked DONE when you make the request even if the instances have not yet been added to their
    * target pools. The change might take some time to apply to all of the instances in the group depending on the size of the group.
    */
  def setTargetPools(request: AnonInstanceGroupManager): Request_[Operation] = js.native
}

object InstanceGroupManagersResource {
  @scala.inline
  def apply(
    abandonInstances: AnonInstanceGroupManager => Request_[Operation],
    aggregatedList: AnonAlt => Request_[InstanceGroupManagerAggregatedList],
    delete: AnonInstanceGroupManager => Request_[Operation],
    deleteInstances: AnonInstanceGroupManager => Request_[Operation],
    get: AnonFieldsInstanceGroupManager => Request_[InstanceGroupManager],
    insert: AnonQuotaUser => Request_[Operation],
    list: AnonFields => Request_[InstanceGroupManagerList],
    listManagedInstances: AnonMaxResults => Request_[InstanceGroupManagersListManagedInstancesResponse],
    recreateInstances: AnonInstanceGroupManager => Request_[Operation],
    resize: AnonSize => Request_[Operation],
    setInstanceTemplate: AnonInstanceGroupManager => Request_[Operation],
    setTargetPools: AnonInstanceGroupManager => Request_[Operation]
  ): InstanceGroupManagersResource = {
    val __obj = js.Dynamic.literal(abandonInstances = js.Any.fromFunction1(abandonInstances), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), deleteInstances = js.Any.fromFunction1(deleteInstances), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listManagedInstances = js.Any.fromFunction1(listManagedInstances), recreateInstances = js.Any.fromFunction1(recreateInstances), resize = js.Any.fromFunction1(resize), setInstanceTemplate = js.Any.fromFunction1(setInstanceTemplate), setTargetPools = js.Any.fromFunction1(setTargetPools))
    __obj.asInstanceOf[InstanceGroupManagersResource]
  }
  @scala.inline
  implicit class InstanceGroupManagersResourceOps[Self <: InstanceGroupManagersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbandonInstances(value: AnonInstanceGroupManager => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abandonInstances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[InstanceGroupManagerAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonInstanceGroupManager => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeleteInstances(value: AnonInstanceGroupManager => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteInstances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFieldsInstanceGroupManager => Request_[InstanceGroupManager]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonQuotaUser => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFields => Request_[InstanceGroupManagerList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListManagedInstances(value: AnonMaxResults => Request_[InstanceGroupManagersListManagedInstancesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listManagedInstances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRecreateInstances(value: AnonInstanceGroupManager => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recreateInstances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResize(value: AnonSize => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetInstanceTemplate(value: AnonInstanceGroupManager => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInstanceTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTargetPools(value: AnonInstanceGroupManager => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTargetPools")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


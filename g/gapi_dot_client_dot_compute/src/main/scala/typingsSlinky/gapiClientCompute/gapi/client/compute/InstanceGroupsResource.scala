package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFields
import typingsSlinky.gapiClientCompute.AnonFieldsInstanceGroup
import typingsSlinky.gapiClientCompute.AnonInstanceGroup
import typingsSlinky.gapiClientCompute.AnonOrderBy_
import typingsSlinky.gapiClientCompute.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupsResource extends js.Object {
  /**
    * Adds a list of instances to the specified instance group. All of the instances in the instance group must be in the same network/subnetwork. Read
    * Adding instances for more information.
    */
  def addInstances(request: AnonInstanceGroup): Request_[Operation] = js.native
  /** Retrieves the list of instance groups and sorts them by zone. */
  def aggregatedList(request: AnonAlt): Request_[InstanceGroupAggregatedList] = js.native
  /**
    * Deletes the specified instance group. The instances in the group are not deleted. Note that instance group must not belong to a backend service. Read
    * Deleting an instance group for more information.
    */
  def delete(request: AnonInstanceGroup): Request_[Operation] = js.native
  /** Returns the specified instance group. Get a list of available instance groups by making a list() request. */
  def get(request: AnonFieldsInstanceGroup): Request_[InstanceGroup] = js.native
  /** Creates an instance group in the specified project using the parameters that are included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation] = js.native
  /** Retrieves the list of instance groups that are located in the specified project and zone. */
  def list(request: AnonFields): Request_[InstanceGroupList] = js.native
  /** Lists the instances in the specified instance group. */
  def listInstances(request: AnonOrderBy_): Request_[InstanceGroupsListInstances] = js.native
  /**
    * Removes one or more instances from the specified instance group, but does not delete those instances.
    *
    * If the group is part of a backend service that has enabled connection draining, it can take up to 60 seconds after the connection draining duration
    * before the VM instance is removed or deleted.
    */
  def removeInstances(request: AnonInstanceGroup): Request_[Operation] = js.native
  /** Sets the named ports for the specified instance group. */
  def setNamedPorts(request: AnonInstanceGroup): Request_[Operation] = js.native
}

object InstanceGroupsResource {
  @scala.inline
  def apply(
    addInstances: AnonInstanceGroup => Request_[Operation],
    aggregatedList: AnonAlt => Request_[InstanceGroupAggregatedList],
    delete: AnonInstanceGroup => Request_[Operation],
    get: AnonFieldsInstanceGroup => Request_[InstanceGroup],
    insert: AnonQuotaUser => Request_[Operation],
    list: AnonFields => Request_[InstanceGroupList],
    listInstances: AnonOrderBy_ => Request_[InstanceGroupsListInstances],
    removeInstances: AnonInstanceGroup => Request_[Operation],
    setNamedPorts: AnonInstanceGroup => Request_[Operation]
  ): InstanceGroupsResource = {
    val __obj = js.Dynamic.literal(addInstances = js.Any.fromFunction1(addInstances), aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), listInstances = js.Any.fromFunction1(listInstances), removeInstances = js.Any.fromFunction1(removeInstances), setNamedPorts = js.Any.fromFunction1(setNamedPorts))
    __obj.asInstanceOf[InstanceGroupsResource]
  }
  @scala.inline
  implicit class InstanceGroupsResourceOps[Self <: InstanceGroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddInstances(value: AnonInstanceGroup => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addInstances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[InstanceGroupAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonInstanceGroup => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonFieldsInstanceGroup => Request_[InstanceGroup]): Self = {
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
    def withList(value: AnonFields => Request_[InstanceGroupList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListInstances(value: AnonOrderBy_ => Request_[InstanceGroupsListInstances]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveInstances(value: AnonInstanceGroup => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeInstances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNamedPorts(value: AnonInstanceGroup => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNamedPorts")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


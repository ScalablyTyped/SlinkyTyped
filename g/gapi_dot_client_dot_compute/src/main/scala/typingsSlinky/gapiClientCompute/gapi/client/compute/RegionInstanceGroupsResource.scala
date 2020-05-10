package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonFieldsFilter
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonInstanceGroupKey
import typingsSlinky.gapiClientCompute.AnonRequestIdUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionInstanceGroupsResource extends js.Object {
  /** Returns the specified instance group resource. */
  def get(request: AnonInstanceGroupKey): Request_[InstanceGroup] = js.native
  /** Retrieves the list of instance group resources contained within the specified region. */
  def list(request: AnonFilter): Request_[RegionInstanceGroupList] = js.native
  /**
    * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can
    * list all instances or only the instances that are running.
    */
  def listInstances(request: AnonFieldsFilter): Request_[RegionInstanceGroupsListInstances] = js.native
  /** Sets the named ports for the specified regional instance group. */
  def setNamedPorts(request: AnonRequestIdUserIp): Request_[Operation] = js.native
}

object RegionInstanceGroupsResource {
  @scala.inline
  def apply(
    get: AnonInstanceGroupKey => Request_[InstanceGroup],
    list: AnonFilter => Request_[RegionInstanceGroupList],
    listInstances: AnonFieldsFilter => Request_[RegionInstanceGroupsListInstances],
    setNamedPorts: AnonRequestIdUserIp => Request_[Operation]
  ): RegionInstanceGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listInstances = js.Any.fromFunction1(listInstances), setNamedPorts = js.Any.fromFunction1(setNamedPorts))
    __obj.asInstanceOf[RegionInstanceGroupsResource]
  }
  @scala.inline
  implicit class RegionInstanceGroupsResourceOps[Self <: RegionInstanceGroupsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: AnonInstanceGroupKey => Request_[InstanceGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[RegionInstanceGroupList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListInstances(value: AnonFieldsFilter => Request_[RegionInstanceGroupsListInstances]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNamedPorts(value: AnonRequestIdUserIp => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNamedPorts")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


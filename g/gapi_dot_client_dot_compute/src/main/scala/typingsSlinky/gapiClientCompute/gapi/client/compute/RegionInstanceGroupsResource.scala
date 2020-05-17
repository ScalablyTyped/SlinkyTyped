package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.FieldsFilter
import typingsSlinky.gapiClientCompute.anon.Filter
import typingsSlinky.gapiClientCompute.anon.InstanceGroupKey
import typingsSlinky.gapiClientCompute.anon.RequestIdUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionInstanceGroupsResource extends js.Object {
  /** Returns the specified instance group resource. */
  def get(request: InstanceGroupKey): Request[InstanceGroup] = js.native
  /** Retrieves the list of instance group resources contained within the specified region. */
  def list(request: Filter): Request[RegionInstanceGroupList] = js.native
  /**
    * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can
    * list all instances or only the instances that are running.
    */
  def listInstances(request: FieldsFilter): Request[RegionInstanceGroupsListInstances] = js.native
  /** Sets the named ports for the specified regional instance group. */
  def setNamedPorts(request: RequestIdUserIp): Request[Operation] = js.native
}

object RegionInstanceGroupsResource {
  @scala.inline
  def apply(
    get: InstanceGroupKey => Request[InstanceGroup],
    list: Filter => Request[RegionInstanceGroupList],
    listInstances: FieldsFilter => Request[RegionInstanceGroupsListInstances],
    setNamedPorts: RequestIdUserIp => Request[Operation]
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
    def withGet(value: InstanceGroupKey => Request[InstanceGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Filter => Request[RegionInstanceGroupList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withListInstances(value: FieldsFilter => Request[RegionInstanceGroupsListInstances]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listInstances")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetNamedPorts(value: RequestIdUserIp => Request[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNamedPorts")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


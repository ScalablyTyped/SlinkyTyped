package typingsSlinky.gapiDotClientDotCompute.gapi.client.compute

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotCompute.Anon_AltFieldsFilter
import typingsSlinky.gapiDotClientDotCompute.Anon_AltFieldsFilterInstanceGroupKey
import typingsSlinky.gapiDotClientDotCompute.Anon_AltFieldsInstanceGroupKeyOauthtoken
import typingsSlinky.gapiDotClientDotCompute.Anon_AltFieldsInstanceGroupKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupsResource extends js.Object {
  /** Returns the specified instance group resource. */
  def get(request: Anon_AltFieldsInstanceGroupKeyOauthtoken): Request[InstanceGroup]
  /** Retrieves the list of instance group resources contained within the specified region. */
  def list(request: Anon_AltFieldsFilter): Request[RegionInstanceGroupList]
  /**
    * Lists the instances in the specified instance group and displays information about the named ports. Depending on the specified options, this method can
    * list all instances or only the instances that are running.
    */
  def listInstances(request: Anon_AltFieldsFilterInstanceGroupKey): Request[RegionInstanceGroupsListInstances]
  /** Sets the named ports for the specified regional instance group. */
  def setNamedPorts(request: Anon_AltFieldsInstanceGroupKeyOauthtokenPrettyPrint): Request[Operation]
}

object RegionInstanceGroupsResource {
  @scala.inline
  def apply(
    get: Anon_AltFieldsInstanceGroupKeyOauthtoken => Request[InstanceGroup],
    list: Anon_AltFieldsFilter => Request[RegionInstanceGroupList],
    listInstances: Anon_AltFieldsFilterInstanceGroupKey => Request[RegionInstanceGroupsListInstances],
    setNamedPorts: Anon_AltFieldsInstanceGroupKeyOauthtokenPrettyPrint => Request[Operation]
  ): RegionInstanceGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listInstances = js.Any.fromFunction1(listInstances), setNamedPorts = js.Any.fromFunction1(setNamedPorts))
  
    __obj.asInstanceOf[RegionInstanceGroupsResource]
  }
}


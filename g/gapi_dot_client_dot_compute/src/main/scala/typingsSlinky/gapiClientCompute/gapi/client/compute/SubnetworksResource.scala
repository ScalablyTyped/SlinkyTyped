package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.Filter
import typingsSlinky.gapiClientCompute.anon.PrettyPrint
import typingsSlinky.gapiClientCompute.anon.RegionSubnetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetworksResource extends js.Object {
  /** Retrieves an aggregated list of subnetworks. */
  def aggregatedList(request: Alt): Request[SubnetworkAggregatedList] = js.native
  /** Deletes the specified subnetwork. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.Subnetwork): Request[Operation] = js.native
  /** Expands the IP CIDR range of the subnetwork to a specified value. */
  def expandIpCidrRange(request: typingsSlinky.gapiClientCompute.anon.Subnetwork): Request[Operation] = js.native
  /** Returns the specified subnetwork. Get a list of available subnetworks list() request. */
  def get(request: RegionSubnetwork): Request[Subnetwork] = js.native
  /** Creates a subnetwork in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  /** Retrieves a list of subnetworks available to the specified project. */
  def list(request: Filter): Request[SubnetworkList] = js.native
  /** Set whether VMs in this subnet can access Google services without assigning external IP addresses through Private Google Access. */
  def setPrivateIpGoogleAccess(request: typingsSlinky.gapiClientCompute.anon.Subnetwork): Request[Operation] = js.native
}

object SubnetworksResource {
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[SubnetworkAggregatedList],
    delete: typingsSlinky.gapiClientCompute.anon.Subnetwork => Request[Operation],
    expandIpCidrRange: typingsSlinky.gapiClientCompute.anon.Subnetwork => Request[Operation],
    get: RegionSubnetwork => Request[Subnetwork],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[SubnetworkList],
    setPrivateIpGoogleAccess: typingsSlinky.gapiClientCompute.anon.Subnetwork => Request[Operation]
  ): SubnetworksResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), expandIpCidrRange = js.Any.fromFunction1(expandIpCidrRange), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setPrivateIpGoogleAccess = js.Any.fromFunction1(setPrivateIpGoogleAccess))
    __obj.asInstanceOf[SubnetworksResource]
  }
  @scala.inline
  implicit class SubnetworksResourceOps[Self <: SubnetworksResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAggregatedList(value: Alt => Request[SubnetworkAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: typingsSlinky.gapiClientCompute.anon.Subnetwork => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setExpandIpCidrRange(value: typingsSlinky.gapiClientCompute.anon.Subnetwork => Request[Operation]): Self = this.set("expandIpCidrRange", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: RegionSubnetwork => Request[Subnetwork]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Filter => Request[SubnetworkList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPrivateIpGoogleAccess(value: typingsSlinky.gapiClientCompute.anon.Subnetwork => Request[Operation]): Self = this.set("setPrivateIpGoogleAccess", js.Any.fromFunction1(value))
  }
  
}


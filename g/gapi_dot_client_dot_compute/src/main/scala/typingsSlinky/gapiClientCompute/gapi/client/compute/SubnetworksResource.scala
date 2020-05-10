package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonPrettyPrint
import typingsSlinky.gapiClientCompute.AnonRegionSubnetwork
import typingsSlinky.gapiClientCompute.AnonSubnetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetworksResource extends js.Object {
  /** Retrieves an aggregated list of subnetworks. */
  def aggregatedList(request: AnonAlt): Request_[SubnetworkAggregatedList] = js.native
  /** Deletes the specified subnetwork. */
  def delete(request: AnonSubnetwork): Request_[Operation] = js.native
  /** Expands the IP CIDR range of the subnetwork to a specified value. */
  def expandIpCidrRange(request: AnonSubnetwork): Request_[Operation] = js.native
  /** Returns the specified subnetwork. Get a list of available subnetworks list() request. */
  def get(request: AnonRegionSubnetwork): Request_[Subnetwork] = js.native
  /** Creates a subnetwork in the specified project using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves a list of subnetworks available to the specified project. */
  def list(request: AnonFilter): Request_[SubnetworkList] = js.native
  /** Set whether VMs in this subnet can access Google services without assigning external IP addresses through Private Google Access. */
  def setPrivateIpGoogleAccess(request: AnonSubnetwork): Request_[Operation] = js.native
}

object SubnetworksResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[SubnetworkAggregatedList],
    delete: AnonSubnetwork => Request_[Operation],
    expandIpCidrRange: AnonSubnetwork => Request_[Operation],
    get: AnonRegionSubnetwork => Request_[Subnetwork],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[SubnetworkList],
    setPrivateIpGoogleAccess: AnonSubnetwork => Request_[Operation]
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
    def withAggregatedList(value: AnonAlt => Request_[SubnetworkAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonSubnetwork => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpandIpCidrRange(value: AnonSubnetwork => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandIpCidrRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonRegionSubnetwork => Request_[Subnetwork]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: AnonPrettyPrint => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonFilter => Request_[SubnetworkList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPrivateIpGoogleAccess(value: AnonSubnetwork => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPrivateIpGoogleAccess")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


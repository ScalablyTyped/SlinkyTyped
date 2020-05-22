package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.Filter
import typingsSlinky.gapiClientCompute.anon.PrettyPrint
import typingsSlinky.gapiClientCompute.anon.RegionSubnetwork
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetworksResource extends js.Object {
  /** Retrieves an aggregated list of subnetworks. */
  def aggregatedList(request: Alt): Request[SubnetworkAggregatedList]
  /** Deletes the specified subnetwork. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.Subnetwork): Request[Operation]
  /** Expands the IP CIDR range of the subnetwork to a specified value. */
  def expandIpCidrRange(request: typingsSlinky.gapiClientCompute.anon.Subnetwork): Request[Operation]
  /** Returns the specified subnetwork. Get a list of available subnetworks list() request. */
  def get(request: RegionSubnetwork): Request[Subnetwork]
  /** Creates a subnetwork in the specified project using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation]
  /** Retrieves a list of subnetworks available to the specified project. */
  def list(request: Filter): Request[SubnetworkList]
  /** Set whether VMs in this subnet can access Google services without assigning external IP addresses through Private Google Access. */
  def setPrivateIpGoogleAccess(request: typingsSlinky.gapiClientCompute.anon.Subnetwork): Request[Operation]
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
}


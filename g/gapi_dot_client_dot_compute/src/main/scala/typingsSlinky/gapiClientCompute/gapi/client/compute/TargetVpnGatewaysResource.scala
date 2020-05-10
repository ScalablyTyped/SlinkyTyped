package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonPrettyPrint
import typingsSlinky.gapiClientCompute.AnonRegionTargetVpnGateway
import typingsSlinky.gapiClientCompute.AnonTargetVpnGateway
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetVpnGatewaysResource extends js.Object {
  /** Retrieves an aggregated list of target VPN gateways. */
  def aggregatedList(request: AnonAlt): Request_[TargetVpnGatewayAggregatedList] = js.native
  /** Deletes the specified target VPN gateway. */
  def delete(request: AnonTargetVpnGateway): Request_[Operation] = js.native
  /** Returns the specified target VPN gateway. Get a list of available target VPN gateways by making a list() request. */
  def get(request: AnonRegionTargetVpnGateway): Request_[TargetVpnGateway] = js.native
  /** Creates a target VPN gateway in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves a list of target VPN gateways available to the specified project and region. */
  def list(request: AnonFilter): Request_[TargetVpnGatewayList] = js.native
}

object TargetVpnGatewaysResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[TargetVpnGatewayAggregatedList],
    delete: AnonTargetVpnGateway => Request_[Operation],
    get: AnonRegionTargetVpnGateway => Request_[TargetVpnGateway],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[TargetVpnGatewayList]
  ): TargetVpnGatewaysResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TargetVpnGatewaysResource]
  }
  @scala.inline
  implicit class TargetVpnGatewaysResourceOps[Self <: TargetVpnGatewaysResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[TargetVpnGatewayAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonTargetVpnGateway => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonRegionTargetVpnGateway => Request_[TargetVpnGateway]): Self = {
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
    def withList(value: AnonFilter => Request_[TargetVpnGatewayList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


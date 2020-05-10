package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCompute.AnonAlt
import typingsSlinky.gapiClientCompute.AnonFilter
import typingsSlinky.gapiClientCompute.AnonPrettyPrint
import typingsSlinky.gapiClientCompute.AnonUserIpVpnTunnel
import typingsSlinky.gapiClientCompute.AnonVpnTunnel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnTunnelsResource extends js.Object {
  /** Retrieves an aggregated list of VPN tunnels. */
  def aggregatedList(request: AnonAlt): Request_[VpnTunnelAggregatedList] = js.native
  /** Deletes the specified VpnTunnel resource. */
  def delete(request: AnonVpnTunnel): Request_[Operation] = js.native
  /** Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request. */
  def get(request: AnonUserIpVpnTunnel): Request_[VpnTunnel] = js.native
  /** Creates a VpnTunnel resource in the specified project and region using the data included in the request. */
  def insert(request: AnonPrettyPrint): Request_[Operation] = js.native
  /** Retrieves a list of VpnTunnel resources contained in the specified project and region. */
  def list(request: AnonFilter): Request_[VpnTunnelList] = js.native
}

object VpnTunnelsResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[VpnTunnelAggregatedList],
    delete: AnonVpnTunnel => Request_[Operation],
    get: AnonUserIpVpnTunnel => Request_[VpnTunnel],
    insert: AnonPrettyPrint => Request_[Operation],
    list: AnonFilter => Request_[VpnTunnelList]
  ): VpnTunnelsResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VpnTunnelsResource]
  }
  @scala.inline
  implicit class VpnTunnelsResourceOps[Self <: VpnTunnelsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregatedList(value: AnonAlt => Request_[VpnTunnelAggregatedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregatedList")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDelete(value: AnonVpnTunnel => Request_[Operation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGet(value: AnonUserIpVpnTunnel => Request_[VpnTunnel]): Self = {
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
    def withList(value: AnonFilter => Request_[VpnTunnelList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}


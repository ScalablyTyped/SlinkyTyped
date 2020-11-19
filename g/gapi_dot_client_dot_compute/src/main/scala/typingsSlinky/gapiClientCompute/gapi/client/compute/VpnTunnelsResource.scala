package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientCompute.anon.Alt
import typingsSlinky.gapiClientCompute.anon.Filter
import typingsSlinky.gapiClientCompute.anon.PrettyPrint
import typingsSlinky.gapiClientCompute.anon.UserIpVpnTunnel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpnTunnelsResource extends js.Object {
  
  /** Retrieves an aggregated list of VPN tunnels. */
  def aggregatedList(request: Alt): Request[VpnTunnelAggregatedList] = js.native
  
  /** Deletes the specified VpnTunnel resource. */
  def delete(request: typingsSlinky.gapiClientCompute.anon.VpnTunnel): Request[Operation] = js.native
  
  /** Returns the specified VpnTunnel resource. Get a list of available VPN tunnels by making a list() request. */
  def get(request: UserIpVpnTunnel): Request[VpnTunnel] = js.native
  
  /** Creates a VpnTunnel resource in the specified project and region using the data included in the request. */
  def insert(request: PrettyPrint): Request[Operation] = js.native
  
  /** Retrieves a list of VpnTunnel resources contained in the specified project and region. */
  def list(request: Filter): Request[VpnTunnelList] = js.native
}
object VpnTunnelsResource {
  
  @scala.inline
  def apply(
    aggregatedList: Alt => Request[VpnTunnelAggregatedList],
    delete: typingsSlinky.gapiClientCompute.anon.VpnTunnel => Request[Operation],
    get: UserIpVpnTunnel => Request[VpnTunnel],
    insert: PrettyPrint => Request[Operation],
    list: Filter => Request[VpnTunnelList]
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregatedList(value: Alt => Request[VpnTunnelAggregatedList]): Self = this.set("aggregatedList", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelete(value: typingsSlinky.gapiClientCompute.anon.VpnTunnel => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: UserIpVpnTunnel => Request[VpnTunnel]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsert(value: PrettyPrint => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: Filter => Request[VpnTunnelList]): Self = this.set("list", js.Any.fromFunction1(value))
  }
}

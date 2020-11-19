package typingsSlinky.grpcGrpcJs.httpProxyMod

import typingsSlinky.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typingsSlinky.grpcGrpcJs.subchannelMod.SubchannelAddress
import typingsSlinky.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js/build/src/http_proxy", "getProxiedConnection")
@js.native
object getProxiedConnection extends js.Object {
  
  def apply(address: SubchannelAddress, channelOptions: ChannelOptions, connectionOptions: ConnectionOptions): js.Promise[ProxyConnectionResult] = js.native
}

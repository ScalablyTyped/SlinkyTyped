package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typingsSlinky.grpcGrpcJs.loadBalancerMod.LoadBalancer
import typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.LoadBalancingConfig
import typingsSlinky.grpcGrpcJs.subchannelMod.SubchannelAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerRoundRobinMod {
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-round-robin", "RoundRobinLoadBalancer")
  @js.native
  class RoundRobinLoadBalancer protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    
    var calculateAndUpdateState: js.Any = js.native
    
    val channelControlHelper: js.Any = js.native
    
    var currentReadyPicker: js.Any = js.native
    
    var currentState: js.Any = js.native
    
    var resetSubchannelList: js.Any = js.native
    
    var subchannelStateCounts: js.Any = js.native
    
    var subchannelStateListener: js.Any = js.native
    
    var subchannels: js.Any = js.native
    
    def updateAddressList(addressList: js.Array[SubchannelAddress], lbConfig: LoadBalancingConfig): Unit = js.native
    
    var updateState: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/load-balancer-round-robin", "setup")
  @js.native
  def setup(): Unit = js.native
}

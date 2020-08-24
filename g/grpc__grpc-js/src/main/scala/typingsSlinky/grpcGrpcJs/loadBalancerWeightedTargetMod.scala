package typingsSlinky.grpcGrpcJs

import typingsSlinky.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typingsSlinky.grpcGrpcJs.loadBalancerMod.LoadBalancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/load-balancer-weighted-target", JSImport.Namespace)
@js.native
object loadBalancerWeightedTargetMod extends js.Object {
  @js.native
  class WeightedTargetLoadBalancer protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    var WeightedChildImpl: js.Any = js.native
    var channelControlHelper: js.Any = js.native
    /**
      * List of current target names.
      */
    var targetList: js.Any = js.native
    /**
      * Map of target names to target children. Includes current targets and
      * previous targets with deactivation timers that have not yet triggered.
      */
    var targets: js.Any = js.native
    var updateState: js.Any = js.native
  }
  
  def setup(): Unit = js.native
}


package typingsSlinky.grpcGrpcJs.loadBalancingConfigMod

import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.eds
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.grpclb
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.pick_first
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.priority
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.round_robin
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.weighted_target
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.xds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.PickFirstLoadBalancingConfig
  - typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.RoundRobinLoadBalancingConfig
  - typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.XdsLoadBalancingConfig
  - typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.GrpcLbLoadBalancingConfig
  - typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.PriorityLoadBalancingConfig
  - typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.WeightedTargetLoadBalancingConfig
  - typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.EdsLoadBalancingConfig
*/
trait LoadBalancingConfig extends js.Object
object LoadBalancingConfig {
  
  @scala.inline
  def XdsLoadBalancingConfig(name: xds, xds: XdsConfig): LoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], xds = xds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancingConfig]
  }
  
  @scala.inline
  def RoundRobinLoadBalancingConfig(name: round_robin, round_robin: RoundRobinConfig): LoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], round_robin = round_robin.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancingConfig]
  }
  
  @scala.inline
  def PriorityLoadBalancingConfig(name: priority, priority: PriorityLbConfig): LoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancingConfig]
  }
  
  @scala.inline
  def PickFirstLoadBalancingConfig(name: pick_first, pick_first: PickFirstConfig): LoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pick_first = pick_first.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancingConfig]
  }
  
  @scala.inline
  def WeightedTargetLoadBalancingConfig(name: weighted_target, weighted_target: WeightedTargetLbConfig): LoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weighted_target = weighted_target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancingConfig]
  }
  
  @scala.inline
  def EdsLoadBalancingConfig(eds: EdsLbConfig, name: eds): LoadBalancingConfig = {
    val __obj = js.Dynamic.literal(eds = eds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancingConfig]
  }
  
  @scala.inline
  def GrpcLbLoadBalancingConfig(grpclb: GrpcLbConfig, name: grpclb): LoadBalancingConfig = {
    val __obj = js.Dynamic.literal(grpclb = grpclb.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancingConfig]
  }
}

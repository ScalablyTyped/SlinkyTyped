package typingsSlinky.grpcGrpcJs.loadBalancingConfigMod

import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.cds
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.eds
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.grpclb
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.lrs
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.pick_first
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.priority
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.round_robin
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.weighted_target
import typingsSlinky.grpcGrpcJs.grpcGrpcJsStrings.xds
import org.scalablytyped.runtime.StObject
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
  - typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.CdsLoadBalancingConfig
  - typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.LrsLoadBalancingConfig
*/
trait LoadBalancingConfig extends StObject
object LoadBalancingConfig {
  
  @scala.inline
  def CdsLoadBalancingConfig(cds: CdsLbConfig, name: cds): typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.CdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(cds = cds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.CdsLoadBalancingConfig]
  }
  
  @scala.inline
  def EdsLoadBalancingConfig(eds: EdsLbConfig, name: eds): typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.EdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(eds = eds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.EdsLoadBalancingConfig]
  }
  
  @scala.inline
  def GrpcLbLoadBalancingConfig(grpclb: GrpcLbConfig, name: grpclb): typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.GrpcLbLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(grpclb = grpclb.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.GrpcLbLoadBalancingConfig]
  }
  
  @scala.inline
  def LrsLoadBalancingConfig(lrs: LrsLbConfig, name: lrs): typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.LrsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(lrs = lrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.LrsLoadBalancingConfig]
  }
  
  @scala.inline
  def PickFirstLoadBalancingConfig(name: pick_first, pick_first: PickFirstConfig): typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.PickFirstLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pick_first = pick_first.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.PickFirstLoadBalancingConfig]
  }
  
  @scala.inline
  def PriorityLoadBalancingConfig(name: priority, priority: PriorityLbConfig): typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.PriorityLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.PriorityLoadBalancingConfig]
  }
  
  @scala.inline
  def RoundRobinLoadBalancingConfig(name: round_robin, round_robin: RoundRobinConfig): typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.RoundRobinLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], round_robin = round_robin.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.RoundRobinLoadBalancingConfig]
  }
  
  @scala.inline
  def WeightedTargetLoadBalancingConfig(name: weighted_target, weighted_target: WeightedTargetLbConfig): typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.WeightedTargetLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weighted_target = weighted_target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.WeightedTargetLoadBalancingConfig]
  }
  
  @scala.inline
  def XdsLoadBalancingConfig(name: xds, xds: XdsConfig): typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.XdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], xds = xds.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.grpcGrpcJs.loadBalancingConfigMod.XdsLoadBalancingConfig]
  }
}

package typingsSlinky.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodegroupScalingConfig extends StObject {
  
  /**
    * The current number of worker nodes that the managed node group should maintain.
    */
  var desiredSize: js.UndefOr[Capacity] = js.native
  
  /**
    * The maximum number of worker nodes that the managed node group can scale out to. Managed node groups can support up to 100 nodes by default.
    */
  var maxSize: js.UndefOr[Capacity] = js.native
  
  /**
    * The minimum number of worker nodes that the managed node group can scale in to. This number must be greater than zero.
    */
  var minSize: js.UndefOr[Capacity] = js.native
}
object NodegroupScalingConfig {
  
  @scala.inline
  def apply(): NodegroupScalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodegroupScalingConfig]
  }
  
  @scala.inline
  implicit class NodegroupScalingConfigMutableBuilder[Self <: NodegroupScalingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredSize(value: Capacity): Self = StObject.set(x, "desiredSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredSizeUndefined: Self = StObject.set(x, "desiredSize", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Capacity): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: Capacity): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}

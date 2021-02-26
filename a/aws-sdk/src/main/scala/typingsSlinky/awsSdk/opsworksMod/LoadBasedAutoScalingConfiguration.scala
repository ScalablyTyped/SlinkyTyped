package typingsSlinky.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBasedAutoScalingConfiguration extends StObject {
  
  /**
    * An AutoScalingThresholds object that describes the downscaling configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
    */
  var DownScaling: js.UndefOr[AutoScalingThresholds] = js.native
  
  /**
    * Whether load-based auto scaling is enabled for the layer.
    */
  var Enable: js.UndefOr[Boolean] = js.native
  
  /**
    * The layer ID.
    */
  var LayerId: js.UndefOr[String] = js.native
  
  /**
    * An AutoScalingThresholds object that describes the upscaling configuration, which defines how and when AWS OpsWorks Stacks increases the number of instances.
    */
  var UpScaling: js.UndefOr[AutoScalingThresholds] = js.native
}
object LoadBasedAutoScalingConfiguration {
  
  @scala.inline
  def apply(): LoadBasedAutoScalingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBasedAutoScalingConfiguration]
  }
  
  @scala.inline
  implicit class LoadBasedAutoScalingConfigurationMutableBuilder[Self <: LoadBasedAutoScalingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownScaling(value: AutoScalingThresholds): Self = StObject.set(x, "DownScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownScalingUndefined: Self = StObject.set(x, "DownScaling", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "Enable", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "LayerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "LayerId", js.undefined)
    
    @scala.inline
    def setUpScaling(value: AutoScalingThresholds): Self = StObject.set(x, "UpScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpScalingUndefined: Self = StObject.set(x, "UpScaling", js.undefined)
  }
}

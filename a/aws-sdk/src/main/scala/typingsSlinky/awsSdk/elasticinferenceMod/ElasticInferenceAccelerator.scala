package typingsSlinky.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticInferenceAccelerator extends StObject {
  
  /**
    *  The health of the Elastic Inference Accelerator. 
    */
  var acceleratorHealth: js.UndefOr[ElasticInferenceAcceleratorHealth] = js.native
  
  /**
    *  The ID of the Elastic Inference Accelerator. 
    */
  var acceleratorId: js.UndefOr[AcceleratorId] = js.native
  
  /**
    *  The type of the Elastic Inference Accelerator. 
    */
  var acceleratorType: js.UndefOr[AcceleratorTypeName] = js.native
  
  /**
    *  The ARN of the resource that the Elastic Inference Accelerator is attached to. 
    */
  var attachedResource: js.UndefOr[ResourceArn] = js.native
  
  /**
    *  The availability zone where the Elastic Inference Accelerator is present. 
    */
  var availabilityZone: js.UndefOr[AvailabilityZone] = js.native
}
object ElasticInferenceAccelerator {
  
  @scala.inline
  def apply(): ElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticInferenceAccelerator]
  }
  
  @scala.inline
  implicit class ElasticInferenceAcceleratorMutableBuilder[Self <: ElasticInferenceAccelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorHealth(value: ElasticInferenceAcceleratorHealth): Self = StObject.set(x, "acceleratorHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorHealthUndefined: Self = StObject.set(x, "acceleratorHealth", js.undefined)
    
    @scala.inline
    def setAcceleratorId(value: AcceleratorId): Self = StObject.set(x, "acceleratorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorIdUndefined: Self = StObject.set(x, "acceleratorId", js.undefined)
    
    @scala.inline
    def setAcceleratorType(value: AcceleratorTypeName): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    @scala.inline
    def setAttachedResource(value: ResourceArn): Self = StObject.set(x, "attachedResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachedResourceUndefined: Self = StObject.set(x, "attachedResource", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
  }
}

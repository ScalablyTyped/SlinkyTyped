package typingsSlinky.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingParameters extends StObject {
  
  /**
    * The instance type that you want to preconfigure for your domain. For example, search.m1.small.
    */
  var DesiredInstanceType: js.UndefOr[PartitionInstanceType] = js.native
  
  /**
    * The number of partitions you want to preconfigure for your domain. Only valid when you select m2.2xlarge as the desired instance type.
    */
  var DesiredPartitionCount: js.UndefOr[UIntValue] = js.native
  
  /**
    * The number of replicas you want to preconfigure for each index partition.
    */
  var DesiredReplicationCount: js.UndefOr[UIntValue] = js.native
}
object ScalingParameters {
  
  @scala.inline
  def apply(): ScalingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingParameters]
  }
  
  @scala.inline
  implicit class ScalingParametersMutableBuilder[Self <: ScalingParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredInstanceType(value: PartitionInstanceType): Self = StObject.set(x, "DesiredInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredInstanceTypeUndefined: Self = StObject.set(x, "DesiredInstanceType", js.undefined)
    
    @scala.inline
    def setDesiredPartitionCount(value: UIntValue): Self = StObject.set(x, "DesiredPartitionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredPartitionCountUndefined: Self = StObject.set(x, "DesiredPartitionCount", js.undefined)
    
    @scala.inline
    def setDesiredReplicationCount(value: UIntValue): Self = StObject.set(x, "DesiredReplicationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredReplicationCountUndefined: Self = StObject.set(x, "DesiredReplicationCount", js.undefined)
  }
}

package typingsSlinky.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeComponentRequest extends StObject {
  
  /**
    * The name of the component.
    */
  var ComponentName: typingsSlinky.awsSdk.applicationinsightsMod.ComponentName = js.native
  
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typingsSlinky.awsSdk.applicationinsightsMod.ResourceGroupName = js.native
}
object DescribeComponentRequest {
  
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName): DescribeComponentRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName.asInstanceOf[js.Any], ResourceGroupName = ResourceGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComponentRequest]
  }
  
  @scala.inline
  implicit class DescribeComponentRequestMutableBuilder[Self <: DescribeComponentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceGroupName(value: ResourceGroupName): Self = StObject.set(x, "ResourceGroupName", value.asInstanceOf[js.Any])
  }
}

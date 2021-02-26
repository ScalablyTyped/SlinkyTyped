package typingsSlinky.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationComponent extends StObject {
  
  /**
    * The name of the component.
    */
  var ComponentName: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ComponentName] = js.native
  
  /**
    * Indicates whether the application component is monitored. 
    */
  var Monitor: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Monitor] = js.native
  
  /**
    * The resource type. Supported resource types include EC2 instances, Auto Scaling group, Classic ELB, Application ELB, and SQS Queue.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ResourceType] = js.native
  
  /**
    * The stack tier of the application component.
    */
  var Tier: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.Tier] = js.native
}
object ApplicationComponent {
  
  @scala.inline
  def apply(): ApplicationComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationComponent]
  }
  
  @scala.inline
  implicit class ApplicationComponentMutableBuilder[Self <: ApplicationComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentName(value: ComponentName): Self = StObject.set(x, "ComponentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentNameUndefined: Self = StObject.set(x, "ComponentName", js.undefined)
    
    @scala.inline
    def setMonitor(value: Monitor): Self = StObject.set(x, "Monitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitorUndefined: Self = StObject.set(x, "Monitor", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setTier(value: Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
  }
}

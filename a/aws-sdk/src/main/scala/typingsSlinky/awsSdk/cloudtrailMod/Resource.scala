package typingsSlinky.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends StObject {
  
  /**
    * The name of the resource referenced by the event returned. These are user-created names whose values will depend on the environment. For example, the resource name might be "auto-scaling-test-group" for an Auto Scaling Group or "i-1234567" for an EC2 Instance.
    */
  var ResourceName: js.UndefOr[String] = js.native
  
  /**
    * The type of a resource referenced by the event returned. When the resource type cannot be determined, null is returned. Some examples of resource types are: Instance for EC2, Trail for CloudTrail, DBInstance for RDS, and AccessKey for IAM. To learn more about how to look up and filter events by the resource types supported for a service, see Filtering CloudTrail Events.
    */
  var ResourceType: js.UndefOr[String] = js.native
}
object Resource {
  
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}

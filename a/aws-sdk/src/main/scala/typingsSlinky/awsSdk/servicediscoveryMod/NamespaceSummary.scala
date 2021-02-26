package typingsSlinky.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamespaceSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the namespace when you create it.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.Arn] = js.native
  
  /**
    * The date and time that the namespace was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  
  /**
    * The ID of the namespace.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  
  /**
    * The name of the namespace. When you create a namespace, AWS Cloud Map automatically creates a Route 53 hosted zone that has the same name as the namespace.
    */
  var Name: js.UndefOr[NamespaceName] = js.native
  
  var Properties: js.UndefOr[NamespaceProperties] = js.native
  
  /**
    * The number of services that were created using the namespace.
    */
  var ServiceCount: js.UndefOr[ResourceCount] = js.native
  
  /**
    * The type of the namespace, either public or private.
    */
  var Type: js.UndefOr[NamespaceType] = js.native
}
object NamespaceSummary {
  
  @scala.inline
  def apply(): NamespaceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceSummary]
  }
  
  @scala.inline
  implicit class NamespaceSummaryMutableBuilder[Self <: NamespaceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: ResourceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: NamespaceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setProperties(value: NamespaceProperties): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    @scala.inline
    def setServiceCount(value: ResourceCount): Self = StObject.set(x, "ServiceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCountUndefined: Self = StObject.set(x, "ServiceCount", js.undefined)
    
    @scala.inline
    def setType(value: NamespaceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

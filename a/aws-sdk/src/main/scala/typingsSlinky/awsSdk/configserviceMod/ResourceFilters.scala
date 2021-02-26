package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceFilters extends StObject {
  
  /**
    * The 12-digit source account ID.
    */
  var AccountId: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.AccountId] = js.native
  
  /**
    * The source region.
    */
  var Region: js.UndefOr[AwsRegion] = js.native
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceId] = js.native
  
  /**
    * The name of the resource.
    */
  var ResourceName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ResourceName] = js.native
}
object ResourceFilters {
  
  @scala.inline
  def apply(): ResourceFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceFilters]
  }
  
  @scala.inline
  implicit class ResourceFiltersMutableBuilder[Self <: ResourceFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setRegion(value: AwsRegion): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "ResourceName", js.undefined)
  }
}

package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2InstanceDetails extends StObject {
  
  /**
    * The Availability Zone of the recommended reservation.
    */
  var AvailabilityZone: js.UndefOr[GenericString] = js.native
  
  /**
    * Whether the recommendation is for a current-generation instance. 
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.native
  
  /**
    * The type of instance that AWS recommends.
    */
  var InstanceType: js.UndefOr[GenericString] = js.native
  
  /**
    * The platform of the recommended reservation. The platform is the specific combination of operating system, license model, and software on an instance.
    */
  var Platform: js.UndefOr[GenericString] = js.native
  
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
  
  /**
    * Whether the recommended reservation is dedicated or shared.
    */
  var Tenancy: js.UndefOr[GenericString] = js.native
}
object EC2InstanceDetails {
  
  @scala.inline
  def apply(): EC2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2InstanceDetails]
  }
  
  @scala.inline
  implicit class EC2InstanceDetailsMutableBuilder[Self <: EC2InstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: GenericString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCurrentGeneration(value: GenericBoolean): Self = StObject.set(x, "CurrentGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGenerationUndefined: Self = StObject.set(x, "CurrentGeneration", js.undefined)
    
    @scala.inline
    def setFamily(value: GenericString): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    @scala.inline
    def setInstanceType(value: GenericString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setPlatform(value: GenericString): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "Platform", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setSizeFlexEligible(value: GenericBoolean): Self = StObject.set(x, "SizeFlexEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeFlexEligibleUndefined: Self = StObject.set(x, "SizeFlexEligible", js.undefined)
    
    @scala.inline
    def setTenancy(value: GenericString): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
  }
}

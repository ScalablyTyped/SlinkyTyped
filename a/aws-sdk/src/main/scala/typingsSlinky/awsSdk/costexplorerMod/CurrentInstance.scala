package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentInstance extends StObject {
  
  /**
    *  The currency code that AWS used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  
  /**
    * The name you've given an instance. This field will show as blank if you haven't given the instance a name.
    */
  var InstanceName: js.UndefOr[GenericString] = js.native
  
  /**
    *  Current On-Demand cost of operating this instance on a monthly basis.
    */
  var MonthlyCost: js.UndefOr[GenericString] = js.native
  
  /**
    *  Number of hours during the lookback period billed at On-Demand rates.
    */
  var OnDemandHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  
  /**
    *  Number of hours during the lookback period covered by reservations.
    */
  var ReservationCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  
  /**
    *  Details about the resource and utilization.
    */
  var ResourceDetails: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ResourceDetails] = js.native
  
  /**
    * Resource ID of the current instance.
    */
  var ResourceId: js.UndefOr[GenericString] = js.native
  
  /**
    *  Utilization information of the current instance during the lookback period.
    */
  var ResourceUtilization: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ResourceUtilization] = js.native
  
  /**
    * Number of hours during the lookback period covered by Savings Plans.
    */
  var SavingsPlansCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  
  /**
    * Cost allocation resource tags applied to the instance.
    */
  var Tags: js.UndefOr[TagValuesList] = js.native
  
  /**
    *  The total number of hours the instance ran during the lookback period.
    */
  var TotalRunningHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
}
object CurrentInstance {
  
  @scala.inline
  def apply(): CurrentInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentInstance]
  }
  
  @scala.inline
  implicit class CurrentInstanceMutableBuilder[Self <: CurrentInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setInstanceName(value: GenericString): Self = StObject.set(x, "InstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNameUndefined: Self = StObject.set(x, "InstanceName", js.undefined)
    
    @scala.inline
    def setMonthlyCost(value: GenericString): Self = StObject.set(x, "MonthlyCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthlyCostUndefined: Self = StObject.set(x, "MonthlyCost", js.undefined)
    
    @scala.inline
    def setOnDemandHoursInLookbackPeriod(value: GenericString): Self = StObject.set(x, "OnDemandHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandHoursInLookbackPeriodUndefined: Self = StObject.set(x, "OnDemandHoursInLookbackPeriod", js.undefined)
    
    @scala.inline
    def setReservationCoveredHoursInLookbackPeriod(value: GenericString): Self = StObject.set(x, "ReservationCoveredHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservationCoveredHoursInLookbackPeriodUndefined: Self = StObject.set(x, "ReservationCoveredHoursInLookbackPeriod", js.undefined)
    
    @scala.inline
    def setResourceDetails(value: ResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDetailsUndefined: Self = StObject.set(x, "ResourceDetails", js.undefined)
    
    @scala.inline
    def setResourceId(value: GenericString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    @scala.inline
    def setResourceUtilization(value: ResourceUtilization): Self = StObject.set(x, "ResourceUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUtilizationUndefined: Self = StObject.set(x, "ResourceUtilization", js.undefined)
    
    @scala.inline
    def setSavingsPlansCoveredHoursInLookbackPeriod(value: GenericString): Self = StObject.set(x, "SavingsPlansCoveredHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansCoveredHoursInLookbackPeriodUndefined: Self = StObject.set(x, "SavingsPlansCoveredHoursInLookbackPeriod", js.undefined)
    
    @scala.inline
    def setTags(value: TagValuesList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagValues*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTotalRunningHoursInLookbackPeriod(value: GenericString): Self = StObject.set(x, "TotalRunningHoursInLookbackPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRunningHoursInLookbackPeriodUndefined: Self = StObject.set(x, "TotalRunningHoursInLookbackPeriod", js.undefined)
  }
}

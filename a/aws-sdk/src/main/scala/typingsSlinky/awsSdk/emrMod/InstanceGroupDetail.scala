package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceGroupDetail extends StObject {
  
  /**
    * The bid price for each EC2 Spot instance type as defined by InstanceType. Expressed in USD. If neither BidPrice nor BidPriceAsPercentageOfOnDemandPrice is provided, BidPriceAsPercentageOfOnDemandPrice defaults to 100%.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The date/time the instance group was created.
    */
  var CreationDateTime: js.Date = js.native
  
  /**
    * The date/time the instance group was terminated.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Unique identifier for the instance group.
    */
  var InstanceGroupId: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * Target number of instances to run in the instance group.
    */
  var InstanceRequestCount: Integer = js.native
  
  /**
    * Instance group role in the cluster
    */
  var InstanceRole: InstanceRoleType = js.native
  
  /**
    * Actual count of running instances.
    */
  var InstanceRunningCount: Integer = js.native
  
  /**
    * EC2 instance type.
    */
  var InstanceType: typingsSlinky.awsSdk.emrMod.InstanceType = js.native
  
  /**
    * Details regarding the state of the instance group.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.native
  
  /**
    * Market type of the EC2 instances used to create a cluster node.
    */
  var Market: MarketType = js.native
  
  /**
    * Friendly name for the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
  
  /**
    * The date/time the instance group was available to the cluster.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The date/time the instance group was started.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
    */
  var State: InstanceGroupState = js.native
}
object InstanceGroupDetail {
  
  @scala.inline
  def apply(
    CreationDateTime: js.Date,
    InstanceRequestCount: Integer,
    InstanceRole: InstanceRoleType,
    InstanceRunningCount: Integer,
    InstanceType: InstanceType,
    Market: MarketType,
    State: InstanceGroupState
  ): InstanceGroupDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], InstanceRequestCount = InstanceRequestCount.asInstanceOf[js.Any], InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceRunningCount = InstanceRunningCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], Market = Market.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupDetail]
  }
  
  @scala.inline
  implicit class InstanceGroupDetailMutableBuilder[Self <: InstanceGroupDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidPrice(value: XmlStringMaxLen256): Self = StObject.set(x, "BidPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidPriceUndefined: Self = StObject.set(x, "BidPrice", js.undefined)
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    @scala.inline
    def setInstanceGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceGroupIdUndefined: Self = StObject.set(x, "InstanceGroupId", js.undefined)
    
    @scala.inline
    def setInstanceRequestCount(value: Integer): Self = StObject.set(x, "InstanceRequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRole(value: InstanceRoleType): Self = StObject.set(x, "InstanceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRunningCount(value: Integer): Self = StObject.set(x, "InstanceRunningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStateChangeReason(value: XmlString): Self = StObject.set(x, "LastStateChangeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStateChangeReasonUndefined: Self = StObject.set(x, "LastStateChangeReason", js.undefined)
    
    @scala.inline
    def setMarket(value: MarketType): Self = StObject.set(x, "Market", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setReadyDateTime(value: js.Date): Self = StObject.set(x, "ReadyDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyDateTimeUndefined: Self = StObject.set(x, "ReadyDateTime", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: js.Date): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
    
    @scala.inline
    def setState(value: InstanceGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}

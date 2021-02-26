package typingsSlinky.awsSdk.marketplacemeteringMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageRecord extends StObject {
  
  /**
    * The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual buyer in your application.
    */
  var CustomerIdentifier: typingsSlinky.awsSdk.marketplacemeteringMod.CustomerIdentifier = js.native
  
  /**
    * During the process of registering a product on AWS Marketplace, up to eight dimensions are specified. These represent different units of value in your application.
    */
  var Dimension: UsageDimension = js.native
  
  /**
    * The quantity of usage consumed by the customer for the given dimension and time. Defaults to 0 if not specified.
    */
  var Quantity: js.UndefOr[UsageQuantity] = js.native
  
  /**
    * Timestamp, in UTC, for which the usage is being reported. Your application can meter usage for up to one hour in the past. Make sure the timestamp value is not before the start of the software usage.
    */
  var Timestamp: js.Date = js.native
  
  /**
    * The set of UsageAllocations to submit. The sum of all UsageAllocation quantities must equal the Quantity of the UsageRecord.
    */
  var UsageAllocations: js.UndefOr[typingsSlinky.awsSdk.marketplacemeteringMod.UsageAllocations] = js.native
}
object UsageRecord {
  
  @scala.inline
  def apply(CustomerIdentifier: CustomerIdentifier, Dimension: UsageDimension, Timestamp: js.Date): UsageRecord = {
    val __obj = js.Dynamic.literal(CustomerIdentifier = CustomerIdentifier.asInstanceOf[js.Any], Dimension = Dimension.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageRecord]
  }
  
  @scala.inline
  implicit class UsageRecordMutableBuilder[Self <: UsageRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerIdentifier(value: CustomerIdentifier): Self = StObject.set(x, "CustomerIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimension(value: UsageDimension): Self = StObject.set(x, "Dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: UsageQuantity): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "Quantity", js.undefined)
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageAllocations(value: UsageAllocations): Self = StObject.set(x, "UsageAllocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageAllocationsUndefined: Self = StObject.set(x, "UsageAllocations", js.undefined)
    
    @scala.inline
    def setUsageAllocationsVarargs(value: UsageAllocation*): Self = StObject.set(x, "UsageAllocations", js.Array(value :_*))
  }
}

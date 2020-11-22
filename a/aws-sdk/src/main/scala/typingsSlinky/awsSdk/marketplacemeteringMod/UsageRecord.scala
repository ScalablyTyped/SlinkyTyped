package typingsSlinky.awsSdk.marketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageRecord extends js.Object {
  
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
  implicit class UsageRecordOps[Self <: UsageRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCustomerIdentifier(value: CustomerIdentifier): Self = this.set("CustomerIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimension(value: UsageDimension): Self = this.set("Dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: js.Date): Self = this.set("Timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: UsageQuantity): Self = this.set("Quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("Quantity", js.undefined)
    
    @scala.inline
    def setUsageAllocationsVarargs(value: UsageAllocation*): Self = this.set("UsageAllocations", js.Array(value :_*))
    
    @scala.inline
    def setUsageAllocations(value: UsageAllocations): Self = this.set("UsageAllocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageAllocations: Self = this.set("UsageAllocations", js.undefined)
  }
}

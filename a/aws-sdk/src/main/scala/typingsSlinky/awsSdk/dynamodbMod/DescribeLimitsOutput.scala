package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLimitsOutput extends StObject {
  
  /**
    * The maximum total read capacity units that your account allows you to provision across all of your tables in this Region.
    */
  var AccountMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  
  /**
    * The maximum total write capacity units that your account allows you to provision across all of your tables in this Region.
    */
  var AccountMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  
  /**
    * The maximum read capacity units that your account allows you to provision for a new table that you are creating in this Region, including the read capacity units provisioned for its global secondary indexes (GSIs).
    */
  var TableMaxReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  
  /**
    * The maximum write capacity units that your account allows you to provision for a new table that you are creating in this Region, including the write capacity units provisioned for its global secondary indexes (GSIs).
    */
  var TableMaxWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}
object DescribeLimitsOutput {
  
  @scala.inline
  def apply(): DescribeLimitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLimitsOutput]
  }
  
  @scala.inline
  implicit class DescribeLimitsOutputMutableBuilder[Self <: DescribeLimitsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountMaxReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "AccountMaxReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountMaxReadCapacityUnitsUndefined: Self = StObject.set(x, "AccountMaxReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setAccountMaxWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "AccountMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountMaxWriteCapacityUnitsUndefined: Self = StObject.set(x, "AccountMaxWriteCapacityUnits", js.undefined)
    
    @scala.inline
    def setTableMaxReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "TableMaxReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableMaxReadCapacityUnitsUndefined: Self = StObject.set(x, "TableMaxReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setTableMaxWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "TableMaxWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableMaxWriteCapacityUnitsUndefined: Self = StObject.set(x, "TableMaxWriteCapacityUnits", js.undefined)
  }
}

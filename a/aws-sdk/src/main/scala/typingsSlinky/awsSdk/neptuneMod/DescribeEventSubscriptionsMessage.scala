package typingsSlinky.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEventSubscriptionsMessage extends StObject {
  
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    *  An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords .
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    *  The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The name of the event notification subscription you want to describe.
    */
  var SubscriptionName: js.UndefOr[String] = js.native
}
object DescribeEventSubscriptionsMessage {
  
  @scala.inline
  def apply(): DescribeEventSubscriptionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventSubscriptionsMessage]
  }
  
  @scala.inline
  implicit class DescribeEventSubscriptionsMessageMutableBuilder[Self <: DescribeEventSubscriptionsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionNameUndefined: Self = StObject.set(x, "SubscriptionName", js.undefined)
  }
}

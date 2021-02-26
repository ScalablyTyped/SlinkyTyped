package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedDBInstancesMessage extends StObject {
  
  /**
    * The DB instance class filter value. Specify this parameter to show only those reservations matching the specified DB instances class.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  
  /**
    * The duration filter value, specified in years or seconds. Specify this parameter to show only reservations for this duration. Valid Values: 1 | 3 | 31536000 | 94608000 
    */
  var Duration: js.UndefOr[String] = js.native
  
  /**
    * This parameter isn't currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The lease identifier filter value. Specify this parameter to show only the reservation that matches the specified lease ID.  AWS Support might request the lease ID for an issue related to a reserved DB instance. 
    */
  var LeaseId: js.UndefOr[String] = js.native
  
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    *  The maximum number of records to include in the response. If more than the MaxRecords value is available, a pagination token called a marker is included in the response so you can retrieve the remaining results.  Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * A value that indicates whether to show only those reservations that support Multi-AZ.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The offering type filter value. Specify this parameter to show only the available offerings matching the specified offering type. Valid Values: "Partial Upfront" | "All Upfront" | "No Upfront"  
    */
  var OfferingType: js.UndefOr[String] = js.native
  
  /**
    * The product description filter value. Specify this parameter to show only those reservations matching the specified product description.
    */
  var ProductDescription: js.UndefOr[String] = js.native
  
  /**
    * The reserved DB instance identifier filter value. Specify this parameter to show only the reservation that matches the specified reservation ID.
    */
  var ReservedDBInstanceId: js.UndefOr[String] = js.native
  
  /**
    * The offering identifier filter value. Specify this parameter to show only purchased reservations matching the specified offering identifier.
    */
  var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.native
}
object DescribeReservedDBInstancesMessage {
  
  @scala.inline
  def apply(): DescribeReservedDBInstancesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedDBInstancesMessage]
  }
  
  @scala.inline
  implicit class DescribeReservedDBInstancesMessageMutableBuilder[Self <: DescribeReservedDBInstancesMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setLeaseId(value: String): Self = StObject.set(x, "LeaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseIdUndefined: Self = StObject.set(x, "LeaseId", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    @scala.inline
    def setOfferingType(value: String): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    @scala.inline
    def setProductDescription(value: String): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    @scala.inline
    def setReservedDBInstanceId(value: String): Self = StObject.set(x, "ReservedDBInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedDBInstanceIdUndefined: Self = StObject.set(x, "ReservedDBInstanceId", js.undefined)
    
    @scala.inline
    def setReservedDBInstancesOfferingId(value: String): Self = StObject.set(x, "ReservedDBInstancesOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedDBInstancesOfferingIdUndefined: Self = StObject.set(x, "ReservedDBInstancesOfferingId", js.undefined)
  }
}

package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedDBInstancesMessage extends js.Object {
  
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
  implicit class DescribeReservedDBInstancesMessageOps[Self <: DescribeReservedDBInstancesMessage] (val x: Self) extends AnyVal {
    
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
    def setDBInstanceClass(value: String): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setLeaseId(value: String): Self = this.set("LeaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaseId: Self = this.set("LeaseId", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    
    @scala.inline
    def setMaxRecords(value: IntegerOptional): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    
    @scala.inline
    def setOfferingType(value: String): Self = this.set("OfferingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingType: Self = this.set("OfferingType", js.undefined)
    
    @scala.inline
    def setProductDescription(value: String): Self = this.set("ProductDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductDescription: Self = this.set("ProductDescription", js.undefined)
    
    @scala.inline
    def setReservedDBInstanceId(value: String): Self = this.set("ReservedDBInstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedDBInstanceId: Self = this.set("ReservedDBInstanceId", js.undefined)
    
    @scala.inline
    def setReservedDBInstancesOfferingId(value: String): Self = this.set("ReservedDBInstancesOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedDBInstancesOfferingId: Self = this.set("ReservedDBInstancesOfferingId", js.undefined)
  }
}

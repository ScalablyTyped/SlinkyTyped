package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CapacityReservation extends StObject {
  
  /**
    * The Availability Zone in which the capacity is reserved.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * The Availability Zone ID of the Capacity Reservation.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.native
  
  /**
    * The remaining capacity. Indicates the number of instances that can be launched in the Capacity Reservation.
    */
  var AvailableInstanceCount: js.UndefOr[Integer] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the Capacity Reservation.
    */
  var CapacityReservationArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: js.UndefOr[String] = js.native
  
  /**
    * The date and time at which the Capacity Reservation was created.
    */
  var CreateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Indicates whether the Capacity Reservation supports EBS-optimized instances. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS- optimized instance.
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to expired when it reaches its end date and time.
    */
  var EndDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following end types:    unlimited - The Capacity Reservation remains active until you explicitly cancel it.    limited - The Capacity Reservation expires automatically at a specified date and time.  
    */
  var EndDateType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EndDateType] = js.native
  
  /**
    * Indicates whether the Capacity Reservation supports instances with temporary, block-level storage.
    */
  var EphemeralStorage: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates the type of instance launches that the Capacity Reservation accepts. The options include:    open - The Capacity Reservation accepts all instances that have matching attributes (instance type, platform, and Availability Zone). Instances that have matching attributes launch into the Capacity Reservation automatically without specifying any additional parameters.    targeted - The Capacity Reservation only accepts instances that have matching attributes (instance type, platform, and Availability Zone), and explicitly target the Capacity Reservation. This ensures that only permitted instances can use the reserved capacity.   
    */
  var InstanceMatchCriteria: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.InstanceMatchCriteria] = js.native
  
  /**
    * The type of operating system for which the Capacity Reservation reserves capacity.
    */
  var InstancePlatform: js.UndefOr[CapacityReservationInstancePlatform] = js.native
  
  /**
    * The type of instance for which the Capacity Reservation reserves capacity.
    */
  var InstanceType: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS account that owns the Capacity Reservation.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * The current state of the Capacity Reservation. A Capacity Reservation can be in one of the following states:    active - The Capacity Reservation is active and the capacity is available for your use.    expired - The Capacity Reservation expired automatically at the date and time specified in your request. The reserved capacity is no longer available for your use.    cancelled - The Capacity Reservation was manually cancelled. The reserved capacity is no longer available for your use.    pending - The Capacity Reservation request was successful but the capacity provisioning is still pending.    failed - The Capacity Reservation request has failed. A request might fail due to invalid request parameters, capacity constraints, or instance limit constraints. Failed requests are retained for 60 minutes.  
    */
  var State: js.UndefOr[CapacityReservationState] = js.native
  
  /**
    * Any tags assigned to the Capacity Reservation.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Indicates the tenancy of the Capacity Reservation. A Capacity Reservation can have one of the following tenancy settings:    default - The Capacity Reservation is created on hardware that is shared with other AWS accounts.    dedicated - The Capacity Reservation is created on single-tenant hardware that is dedicated to a single AWS account.  
    */
  var Tenancy: js.UndefOr[CapacityReservationTenancy] = js.native
  
  /**
    * The total number of instances for which the Capacity Reservation reserves capacity.
    */
  var TotalInstanceCount: js.UndefOr[Integer] = js.native
}
object CapacityReservation {
  
  @scala.inline
  def apply(): CapacityReservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapacityReservation]
  }
  
  @scala.inline
  implicit class CapacityReservationMutableBuilder[Self <: CapacityReservation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = StObject.set(x, "AvailabilityZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "AvailabilityZoneId", js.undefined)
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setAvailableInstanceCount(value: Integer): Self = StObject.set(x, "AvailableInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableInstanceCountUndefined: Self = StObject.set(x, "AvailableInstanceCount", js.undefined)
    
    @scala.inline
    def setCapacityReservationArn(value: String): Self = StObject.set(x, "CapacityReservationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationArnUndefined: Self = StObject.set(x, "CapacityReservationArn", js.undefined)
    
    @scala.inline
    def setCapacityReservationId(value: String): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityReservationIdUndefined: Self = StObject.set(x, "CapacityReservationId", js.undefined)
    
    @scala.inline
    def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateType(value: EndDateType): Self = StObject.set(x, "EndDateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTypeUndefined: Self = StObject.set(x, "EndDateType", js.undefined)
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    @scala.inline
    def setEphemeralStorage(value: Boolean): Self = StObject.set(x, "EphemeralStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEphemeralStorageUndefined: Self = StObject.set(x, "EphemeralStorage", js.undefined)
    
    @scala.inline
    def setInstanceMatchCriteria(value: InstanceMatchCriteria): Self = StObject.set(x, "InstanceMatchCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceMatchCriteriaUndefined: Self = StObject.set(x, "InstanceMatchCriteria", js.undefined)
    
    @scala.inline
    def setInstancePlatform(value: CapacityReservationInstancePlatform): Self = StObject.set(x, "InstancePlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancePlatformUndefined: Self = StObject.set(x, "InstancePlatform", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setState(value: CapacityReservationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTenancy(value: CapacityReservationTenancy): Self = StObject.set(x, "Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenancyUndefined: Self = StObject.set(x, "Tenancy", js.undefined)
    
    @scala.inline
    def setTotalInstanceCount(value: Integer): Self = StObject.set(x, "TotalInstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalInstanceCountUndefined: Self = StObject.set(x, "TotalInstanceCount", js.undefined)
  }
}

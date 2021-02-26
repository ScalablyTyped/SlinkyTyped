package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyCapacityReservationRequest extends StObject {
  
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: typingsSlinky.awsSdk.ec2Mod.CapacityReservationId = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity is released and you can no longer launch instances into it. The Capacity Reservation's state changes to expired when it reaches its end date and time. The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019. You must provide an EndDate value if EndDateType is limited. Omit EndDate if EndDateType is unlimited.
    */
  var EndDate: js.UndefOr[js.Date] = js.native
  
  /**
    * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following end types:    unlimited - The Capacity Reservation remains active until you explicitly cancel it. Do not provide an EndDate value if EndDateType is unlimited.    limited - The Capacity Reservation expires automatically at a specified date and time. You must provide an EndDate value if EndDateType is limited.  
    */
  var EndDateType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EndDateType] = js.native
  
  /**
    * The number of instances for which to reserve capacity.
    */
  var InstanceCount: js.UndefOr[Integer] = js.native
}
object ModifyCapacityReservationRequest {
  
  @scala.inline
  def apply(CapacityReservationId: CapacityReservationId): ModifyCapacityReservationRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationId = CapacityReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCapacityReservationRequest]
  }
  
  @scala.inline
  implicit class ModifyCapacityReservationRequestMutableBuilder[Self <: ModifyCapacityReservationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityReservationId(value: CapacityReservationId): Self = StObject.set(x, "CapacityReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateType(value: EndDateType): Self = StObject.set(x, "EndDateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTypeUndefined: Self = StObject.set(x, "EndDateType", js.undefined)
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
  }
}

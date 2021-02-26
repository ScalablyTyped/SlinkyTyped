package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyReservedInstancesRequest extends StObject {
  
  /**
    * A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * The IDs of the Reserved Instances to modify.
    */
  var ReservedInstancesIds: ReservedInstancesIdStringList = js.native
  
  /**
    * The configuration settings for the Reserved Instances to modify.
    */
  var TargetConfigurations: ReservedInstancesConfigurationList = js.native
}
object ModifyReservedInstancesRequest {
  
  @scala.inline
  def apply(
    ReservedInstancesIds: ReservedInstancesIdStringList,
    TargetConfigurations: ReservedInstancesConfigurationList
  ): ModifyReservedInstancesRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesIds = ReservedInstancesIds.asInstanceOf[js.Any], TargetConfigurations = TargetConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReservedInstancesRequest]
  }
  
  @scala.inline
  implicit class ModifyReservedInstancesRequestMutableBuilder[Self <: ModifyReservedInstancesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setReservedInstancesIds(value: ReservedInstancesIdStringList): Self = StObject.set(x, "ReservedInstancesIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedInstancesIdsVarargs(value: ReservationId*): Self = StObject.set(x, "ReservedInstancesIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetConfigurations(value: ReservedInstancesConfigurationList): Self = StObject.set(x, "TargetConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetConfigurationsVarargs(value: ReservedInstancesConfiguration*): Self = StObject.set(x, "TargetConfigurations", js.Array(value :_*))
  }
}

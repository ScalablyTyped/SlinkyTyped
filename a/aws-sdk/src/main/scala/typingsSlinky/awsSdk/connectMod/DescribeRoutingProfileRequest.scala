package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRoutingProfileRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsSlinky.awsSdk.connectMod.InstanceId = js.native
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typingsSlinky.awsSdk.connectMod.RoutingProfileId = js.native
}
object DescribeRoutingProfileRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId, RoutingProfileId: RoutingProfileId): DescribeRoutingProfileRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRoutingProfileRequest]
  }
  
  @scala.inline
  implicit class DescribeRoutingProfileRequestMutableBuilder[Self <: DescribeRoutingProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}

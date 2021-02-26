package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetServiceSettingRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service setting to reset. The setting ID can be /ssm/parameter-store/default-parameter-tier, /ssm/parameter-store/high-throughput-enabled, or /ssm/managed-instance/activation-tier. For example, arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled.
    */
  var SettingId: ServiceSettingId = js.native
}
object ResetServiceSettingRequest {
  
  @scala.inline
  def apply(SettingId: ServiceSettingId): ResetServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetServiceSettingRequest]
  }
  
  @scala.inline
  implicit class ResetServiceSettingRequestMutableBuilder[Self <: ResetServiceSettingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSettingId(value: ServiceSettingId): Self = StObject.set(x, "SettingId", value.asInstanceOf[js.Any])
  }
}

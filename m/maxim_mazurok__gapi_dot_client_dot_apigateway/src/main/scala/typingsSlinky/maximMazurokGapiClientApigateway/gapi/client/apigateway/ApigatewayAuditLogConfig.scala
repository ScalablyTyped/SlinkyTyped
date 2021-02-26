package typingsSlinky.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApigatewayAuditLogConfig extends StObject {
  
  /** Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members. */
  var exemptedMembers: js.UndefOr[js.Array[String]] = js.native
  
  /** The log type that this config enables. */
  var logType: js.UndefOr[String] = js.native
}
object ApigatewayAuditLogConfig {
  
  @scala.inline
  def apply(): ApigatewayAuditLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayAuditLogConfig]
  }
  
  @scala.inline
  implicit class ApigatewayAuditLogConfigMutableBuilder[Self <: ApigatewayAuditLogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExemptedMembers(value: js.Array[String]): Self = StObject.set(x, "exemptedMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExemptedMembersUndefined: Self = StObject.set(x, "exemptedMembers", js.undefined)
    
    @scala.inline
    def setExemptedMembersVarargs(value: String*): Self = StObject.set(x, "exemptedMembers", js.Array(value :_*))
    
    @scala.inline
    def setLogType(value: String): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogTypeUndefined: Self = StObject.set(x, "logType", js.undefined)
  }
}

package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceIpConditionConfig extends StObject {
  
  /**
    * One or more source IP addresses, in CIDR format. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. If you specify multiple addresses, the condition is satisfied if the source IP address of the request matches one of the CIDR blocks. This condition is not satisfied by the addresses in the X-Forwarded-For header. To search for addresses in the X-Forwarded-For header, use HttpHeaderConditionConfig.
    */
  var Values: js.UndefOr[ListOfString] = js.native
}
object SourceIpConditionConfig {
  
  @scala.inline
  def apply(): SourceIpConditionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceIpConditionConfig]
  }
  
  @scala.inline
  implicit class SourceIpConditionConfigMutableBuilder[Self <: SourceIpConditionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: ListOfString): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: StringValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}

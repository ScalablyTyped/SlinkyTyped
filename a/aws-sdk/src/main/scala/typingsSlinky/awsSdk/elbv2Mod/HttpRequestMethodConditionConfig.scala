package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRequestMethodConditionConfig extends StObject {
  
  /**
    * The name of the request method. The maximum size is 40 characters. The allowed characters are A-Z, hyphen (-), and underscore (_). The comparison is case sensitive. Wildcards are not supported; therefore, the method name must be an exact match. If you specify multiple strings, the condition is satisfied if one of the strings matches the HTTP request method. We recommend that you route GET and HEAD requests in the same way, because the response to a HEAD request may be cached.
    */
  var Values: js.UndefOr[ListOfString] = js.native
}
object HttpRequestMethodConditionConfig {
  
  @scala.inline
  def apply(): HttpRequestMethodConditionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestMethodConditionConfig]
  }
  
  @scala.inline
  implicit class HttpRequestMethodConditionConfigMutableBuilder[Self <: HttpRequestMethodConditionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: ListOfString): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: StringValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}

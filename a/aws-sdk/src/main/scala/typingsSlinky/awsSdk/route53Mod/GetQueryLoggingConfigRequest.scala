package typingsSlinky.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetQueryLoggingConfigRequest extends StObject {
  
  /**
    * The ID of the configuration for DNS query logging that you want to get information about.
    */
  var Id: QueryLoggingConfigId = js.native
}
object GetQueryLoggingConfigRequest {
  
  @scala.inline
  def apply(Id: QueryLoggingConfigId): GetQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQueryLoggingConfigRequest]
  }
  
  @scala.inline
  implicit class GetQueryLoggingConfigRequestMutableBuilder[Self <: GetQueryLoggingConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: QueryLoggingConfigId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}

package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FixedResponseActionConfig extends StObject {
  
  /**
    * The content type. Valid Values: text/plain | text/css | text/html | application/javascript | application/json
    */
  var ContentType: js.UndefOr[FixedResponseActionContentType] = js.native
  
  /**
    * The message.
    */
  var MessageBody: js.UndefOr[FixedResponseActionMessage] = js.native
  
  /**
    * The HTTP response code (2XX, 4XX, or 5XX).
    */
  var StatusCode: FixedResponseActionStatusCode = js.native
}
object FixedResponseActionConfig {
  
  @scala.inline
  def apply(StatusCode: FixedResponseActionStatusCode): FixedResponseActionConfig = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedResponseActionConfig]
  }
  
  @scala.inline
  implicit class FixedResponseActionConfigMutableBuilder[Self <: FixedResponseActionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: FixedResponseActionContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setMessageBody(value: FixedResponseActionMessage): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageBodyUndefined: Self = StObject.set(x, "MessageBody", js.undefined)
    
    @scala.inline
    def setStatusCode(value: FixedResponseActionStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
  }
}

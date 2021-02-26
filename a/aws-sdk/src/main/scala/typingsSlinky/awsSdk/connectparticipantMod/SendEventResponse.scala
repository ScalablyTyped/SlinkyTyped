package typingsSlinky.awsSdk.connectparticipantMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendEventResponse extends StObject {
  
  /**
    * The time when the event was sent. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.native
  
  /**
    * The ID of the response.
    */
  var Id: js.UndefOr[ChatItemId] = js.native
}
object SendEventResponse {
  
  @scala.inline
  def apply(): SendEventResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendEventResponse]
  }
  
  @scala.inline
  implicit class SendEventResponseMutableBuilder[Self <: SendEventResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteTime(value: Instant): Self = StObject.set(x, "AbsoluteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteTimeUndefined: Self = StObject.set(x, "AbsoluteTime", js.undefined)
    
    @scala.inline
    def setId(value: ChatItemId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}

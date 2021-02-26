package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEventTrackerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the event tracker to delete.
    */
  var eventTrackerArn: Arn = js.native
}
object DeleteEventTrackerRequest {
  
  @scala.inline
  def apply(eventTrackerArn: Arn): DeleteEventTrackerRequest = {
    val __obj = js.Dynamic.literal(eventTrackerArn = eventTrackerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventTrackerRequest]
  }
  
  @scala.inline
  implicit class DeleteEventTrackerRequestMutableBuilder[Self <: DeleteEventTrackerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventTrackerArn(value: Arn): Self = StObject.set(x, "eventTrackerArn", value.asInstanceOf[js.Any])
  }
}

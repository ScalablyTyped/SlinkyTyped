package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListJourneysResponse extends StObject {
  
  var JourneysResponse: typingsSlinky.awsSdk.pinpointMod.JourneysResponse = js.native
}
object ListJourneysResponse {
  
  @scala.inline
  def apply(JourneysResponse: JourneysResponse): ListJourneysResponse = {
    val __obj = js.Dynamic.literal(JourneysResponse = JourneysResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJourneysResponse]
  }
  
  @scala.inline
  implicit class ListJourneysResponseMutableBuilder[Self <: ListJourneysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJourneysResponse(value: JourneysResponse): Self = StObject.set(x, "JourneysResponse", value.asInstanceOf[js.Any])
  }
}

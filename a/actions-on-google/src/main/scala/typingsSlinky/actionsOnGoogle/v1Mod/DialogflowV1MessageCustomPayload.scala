package typingsSlinky.actionsOnGoogle.v1Mod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleNumbers.`4`
import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageCustomPayload
  extends DialogflowV1BaseMessage[`4`]
     with DialogflowV1Message {
  
  var payload: js.UndefOr[JsonObject] = js.native
}
object DialogflowV1MessageCustomPayload {
  
  @scala.inline
  def apply(): DialogflowV1MessageCustomPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageCustomPayload]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageCustomPayloadMutableBuilder[Self <: DialogflowV1MessageCustomPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: JsonObject): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}

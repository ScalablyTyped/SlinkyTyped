package typingsSlinky.actionsOnGoogle.v1Mod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleNumbers.`4`
import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
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
  implicit class DialogflowV1MessageCustomPayloadOps[Self <: DialogflowV1MessageCustomPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPayload(value: JsonObject): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
  }
}

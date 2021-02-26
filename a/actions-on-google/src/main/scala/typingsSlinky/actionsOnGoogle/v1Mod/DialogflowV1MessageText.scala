package typingsSlinky.actionsOnGoogle.v1Mod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageText
  extends DialogflowV1BaseMessage[`0`]
     with DialogflowV1Message {
  
  var speech: js.UndefOr[String] = js.native
}
object DialogflowV1MessageText {
  
  @scala.inline
  def apply(): DialogflowV1MessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1MessageText]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageTextMutableBuilder[Self <: DialogflowV1MessageText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpeech(value: String): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechUndefined: Self = StObject.set(x, "speech", js.undefined)
  }
}

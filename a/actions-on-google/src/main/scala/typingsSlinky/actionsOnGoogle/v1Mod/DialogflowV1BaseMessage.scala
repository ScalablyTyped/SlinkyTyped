package typingsSlinky.actionsOnGoogle.v1Mod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.facebook_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.kik_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.line_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.skype_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.slack_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.telegram_
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.viber_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1BaseMessage[TType /* <: Double */] extends StObject {
  
  var platform: js.UndefOr[facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_] = js.native
  
  var `type`: js.UndefOr[TType] = js.native
}
object DialogflowV1BaseMessage {
  
  @scala.inline
  def apply[TType /* <: Double */](): DialogflowV1BaseMessage[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1BaseMessage[TType]]
  }
  
  @scala.inline
  implicit class DialogflowV1BaseMessageMutableBuilder[Self <: DialogflowV1BaseMessage[_], TType /* <: Double */] (val x: Self with DialogflowV1BaseMessage[TType]) extends AnyVal {
    
    @scala.inline
    def setPlatform(value: facebook_ | kik_ | line_ | skype_ | slack_ | telegram_ | viber_): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

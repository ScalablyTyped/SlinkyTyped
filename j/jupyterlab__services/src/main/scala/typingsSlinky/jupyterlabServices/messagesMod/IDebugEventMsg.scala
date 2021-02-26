package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.anon.Event
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_event
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDebugEventMsg
  extends IIOPubMessage[debug_event]
     with _Message {
  
  @JSName("content")
  var content_IDebugEventMsg: Event = js.native
}
object IDebugEventMsg {
  
  @scala.inline
  def apply(
    channel: iopub,
    content: Event,
    header: IHeader[debug_event],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDebugEventMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugEventMsg]
  }
  
  @scala.inline
  implicit class IDebugEventMsgMutableBuilder[Self <: IDebugEventMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Event): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

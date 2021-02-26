package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.anon.Cursorpos
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.inspect_request
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInspectRequestMsg
  extends IShellMessage[inspect_request]
     with _Message {
  
  @JSName("content")
  var content_IInspectRequestMsg: Cursorpos = js.native
}
object IInspectRequestMsg {
  
  @scala.inline
  def apply(
    channel: shell,
    content: Cursorpos,
    header: IHeader[inspect_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IInspectRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectRequestMsg]
  }
  
  @scala.inline
  implicit class IInspectRequestMsgMutableBuilder[Self <: IInspectRequestMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Cursorpos): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

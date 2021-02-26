package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.anon.Data
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_open
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommOpenMsg[T /* <: shell | iopub */] extends IMessage[comm_open] {
  
  @JSName("channel")
  var channel_ICommOpenMsg: T = js.native
  
  @JSName("content")
  var content_ICommOpenMsg: Data = js.native
}
object ICommOpenMsg {
  
  @scala.inline
  def apply[T /* <: shell | iopub */](
    channel: T,
    content: Data,
    header: IHeader[comm_open],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommOpenMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommOpenMsg[T]]
  }
  
  @scala.inline
  implicit class ICommOpenMsgMutableBuilder[Self <: ICommOpenMsg[_], T /* <: shell | iopub */] (val x: Self with ICommOpenMsg[T]) extends AnyVal {
    
    @scala.inline
    def setChannel(value: T): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Data): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}

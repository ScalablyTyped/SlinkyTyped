package typingsSlinky.jupyterlabServices.messagesMod

import typingsSlinky.jupyterlabServices.anon.Allowstdin
import typingsSlinky.jupyterlabServices.anon.Arguments
import typingsSlinky.jupyterlabServices.anon.Body
import typingsSlinky.jupyterlabServices.anon.Code
import typingsSlinky.jupyterlabServices.anon.CodeString
import typingsSlinky.jupyterlabServices.anon.Commid
import typingsSlinky.jupyterlabServices.anon.Cursorpos
import typingsSlinky.jupyterlabServices.anon.Data
import typingsSlinky.jupyterlabServices.anon.Ename
import typingsSlinky.jupyterlabServices.anon.Event
import typingsSlinky.jupyterlabServices.anon.Executioncount
import typingsSlinky.jupyterlabServices.anon.Executionstate
import typingsSlinky.jupyterlabServices.anon.Metadata
import typingsSlinky.jupyterlabServices.anon.Name
import typingsSlinky.jupyterlabServices.anon.Password
import typingsSlinky.jupyterlabServices.anon.Targetname
import typingsSlinky.jupyterlabServices.anon.Transient
import typingsSlinky.jupyterlabServices.anon.TransientDisplayidString
import typingsSlinky.jupyterlabServices.anon.Wait
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IIOPubMessage[T /* <: IOPubMessageType */] extends IMessage[T] {
  
  @JSName("channel")
  var channel_IIOPubMessage: iopub = js.native
}
object IIOPubMessage {
  
  @scala.inline
  def apply[T /* <: IOPubMessageType */](
    channel: iopub,
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[T],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IIOPubMessage[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIOPubMessage[T]]
  }
  
  @scala.inline
  implicit class IIOPubMessageMutableBuilder[Self <: IIOPubMessage[_], T /* <: IOPubMessageType */] (val x: Self with IIOPubMessage[T]) extends AnyVal {
    
    @scala.inline
    def setChannel(value: iopub): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}

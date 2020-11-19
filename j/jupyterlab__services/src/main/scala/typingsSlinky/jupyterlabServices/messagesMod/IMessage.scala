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
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMessage[MSGTYPE /* <: MessageType */] extends js.Object {
  
  /**
    * An optional list of binary buffers.
    */
  var buffers: js.UndefOr[js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]] = js.native
  
  /**
    * The channel on which the message is transmitted.
    */
  var channel: Channel = js.native
  
  /**
    * The content of the message.
    */
  var content: Wait | Commid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event = js.native
  
  /**
    * The message header.
    */
  var header: IHeader[MSGTYPE] = js.native
  
  /**
    * Metadata associated with the message.
    */
  var metadata: JSONObject = js.native
  
  /**
    * The parent message
    */
  var parent_header: IHeader[MessageType] | js.Object = js.native
}
object IMessage {
  
  @scala.inline
  def apply[MSGTYPE /* <: MessageType */](
    channel: Channel,
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[MSGTYPE],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IMessage[MSGTYPE] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage[MSGTYPE]]
  }
  
  @scala.inline
  implicit class IMessageOps[Self <: IMessage[_], MSGTYPE /* <: MessageType */] (val x: Self with IMessage[MSGTYPE]) extends AnyVal {
    
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
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(
      value: Wait | Commid | (ReplyContent[
          ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
        ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | ((/* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IDisplayDataMsg['content'] */ js.Any) with TransientDisplayidString) | Arguments | Body | Event
    ): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: IHeader[MSGTYPE]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: JSONObject): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[MessageType] | js.Object): Self = this.set("parent_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffersVarargs(value: (js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView)*): Self = this.set("buffers", js.Array(value :_*))
    
    @scala.inline
    def setBuffers(value: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]): Self = this.set("buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuffers: Self = this.set("buffers", js.undefined)
  }
}

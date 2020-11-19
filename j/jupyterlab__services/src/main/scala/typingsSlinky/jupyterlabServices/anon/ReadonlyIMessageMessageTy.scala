package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.jupyterlabServices.messagesMod.Channel
import typingsSlinky.jupyterlabServices.messagesMod.ICommInfoReply
import typingsSlinky.jupyterlabServices.messagesMod.ICompleteReply
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteCount
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteReply
import typingsSlinky.jupyterlabServices.messagesMod.IHeader
import typingsSlinky.jupyterlabServices.messagesMod.IHistoryReply
import typingsSlinky.jupyterlabServices.messagesMod.IHistoryRequestRange
import typingsSlinky.jupyterlabServices.messagesMod.IHistoryRequestSearch
import typingsSlinky.jupyterlabServices.messagesMod.IHistoryRequestTail
import typingsSlinky.jupyterlabServices.messagesMod.IInfoReply
import typingsSlinky.jupyterlabServices.messagesMod.IInputReply
import typingsSlinky.jupyterlabServices.messagesMod.IInspectReply
import typingsSlinky.jupyterlabServices.messagesMod.IIsCompleteReplyIncomplete
import typingsSlinky.jupyterlabServices.messagesMod.IIsCompleteReplyOther
import typingsSlinky.jupyterlabServices.messagesMod.MessageType
import typingsSlinky.jupyterlabServices.messagesMod.ReplyContent
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IMessage<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.MessageType>> */
@js.native
trait ReadonlyIMessageMessageTy extends js.Object {
  
  val buffers: js.UndefOr[js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]] = js.native
  
  val channel: Channel = js.native
  
  val content: Wait | Commid | (ReplyContent[
    ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
  ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata with TransientDisplayidString) | Arguments | Body | Event = js.native
  
  val header: IHeader[MessageType] = js.native
  
  val metadata: JSONObject = js.native
  
  val parent_header: IHeader[MessageType] | js.Object = js.native
}
object ReadonlyIMessageMessageTy {
  
  @scala.inline
  def apply(
    channel: Channel,
    content: Wait | Commid | (ReplyContent[
      ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
    ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata with TransientDisplayidString) | Arguments | Body | Event,
    header: IHeader[MessageType],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ReadonlyIMessageMessageTy = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIMessageMessageTy]
  }
  
  @scala.inline
  implicit class ReadonlyIMessageMessageTyOps[Self <: ReadonlyIMessageMessageTy] (val x: Self) extends AnyVal {
    
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
        ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata with TransientDisplayidString) | Arguments | Body | Event
    ): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: IHeader[MessageType]): Self = this.set("header", value.asInstanceOf[js.Any])
    
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

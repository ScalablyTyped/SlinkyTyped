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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IMessage<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.MessageType>> */
@js.native
trait ReadonlyIMessageMessageTy extends StObject {
  
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
  implicit class ReadonlyIMessageMessageTyMutableBuilder[Self <: ReadonlyIMessageMessageTy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffers(value: js.Array[js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView]): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuffersUndefined: Self = StObject.set(x, "buffers", js.undefined)
    
    @scala.inline
    def setBuffersVarargs(value: (js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView)*): Self = StObject.set(x, "buffers", js.Array(value :_*))
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(
      value: Wait | Commid | (ReplyContent[
          ICommInfoReply | ICompleteReply | IHistoryReply | IInfoReply | IInputReply | IInspectReply | IIsCompleteReplyIncomplete | IIsCompleteReplyOther
        ]) | Targetname | Data | Code | Metadata | Ename | Executioncount | (ReplyContent[IExecuteReply] with IExecuteCount) | Allowstdin | Transient | IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail | js.Object | Password | Cursorpos | CodeString | Executionstate | Name | (Metadata with TransientDisplayidString) | Arguments | Body | Event
    ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: IHeader[MessageType]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent_header(value: IHeader[MessageType] | js.Object): Self = StObject.set(x, "parent_header", value.asInstanceOf[js.Any])
  }
}

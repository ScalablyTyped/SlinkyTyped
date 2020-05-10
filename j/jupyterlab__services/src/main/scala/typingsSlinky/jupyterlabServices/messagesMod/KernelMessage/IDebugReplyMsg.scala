package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonBody
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.control
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_reply
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An experimental `'debug_reply'` messsage on the `'control'` channel.
  *
  * @hidden
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, this is *NOT* considered
  * part of the public API, and may change without notice.
  */
@js.native
trait IDebugReplyMsg
  extends IControlMessage[debug_reply]
     with _Message {
  @JSName("content")
  var content_IDebugReplyMsg: AnonBody = js.native
}

object IDebugReplyMsg {
  @scala.inline
  def apply(
    channel: control,
    content: AnonBody,
    header: IHeader[debug_reply],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDebugReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugReplyMsg]
  }
  @scala.inline
  implicit class IDebugReplyMsgOps[Self <: IDebugReplyMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: AnonBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}


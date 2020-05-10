package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonEvent
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.debug_event
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An experimental `'debug_event'` message on the `'iopub'` channel
  *
  * @hidden
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, this is *NOT* considered
  * part of the public API, and may change without notice.
  */
@js.native
trait IDebugEventMsg
  extends IIOPubMessage[debug_event]
     with _Message {
  @JSName("content")
  var content_IDebugEventMsg: AnonEvent = js.native
}

object IDebugEventMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonEvent,
    header: IHeader[debug_event],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDebugEventMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugEventMsg]
  }
  @scala.inline
  implicit class IDebugEventMsgOps[Self <: IDebugEventMsg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: AnonEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

